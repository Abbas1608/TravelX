package com.example.travelx

import Card1.itemData
import Card1.myAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeScreen : AppCompatActivity() {

    lateinit var viewPage2: ViewPager2
    lateinit var mypageadapter: myPageAdapter
    lateinit var TabLayout: TabLayout

    var tabIcon = listOf(R.drawable.home,R.drawable.heart,R.drawable.proflie_logo)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // action viewpage
        viewPage2 = findViewById(R.id.viewpage)
        viewPage2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // adapter page
        mypageadapter = myPageAdapter(supportFragmentManager, lifecycle)

        mypageadapter.addFragmentToList(HomeFragment())
        mypageadapter.addFragmentToList(AddCardFragment())
        mypageadapter.addFragmentToList(ProfileFragment())


        // conntected to viewpage
        viewPage2.adapter = mypageadapter

        // TabLayout
        TabLayout = findViewById(R.id.tabLayout)

        TabLayoutMediator(TabLayout, viewPage2)
        { tab, position ->
            tab.setIcon(tabIcon[position])
        }.attach()

    }
}