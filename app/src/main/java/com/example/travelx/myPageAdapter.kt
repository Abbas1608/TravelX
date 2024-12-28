package com.example.travelx

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class myPageAdapter(fm : FragmentManager,lc: Lifecycle): FragmentStateAdapter(fm,lc)

{
    // create frgment list
    var fragmentList : ArrayList<Fragment> = ArrayList()
    // add fragment to list
    fun addFragmentToList(fragment: Fragment)
    {
        fragmentList.add(fragment)
    }
    override fun createFragment(position: Int): Fragment {
      return fragmentList.get(position)
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

}