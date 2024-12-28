package com.example.travelx

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class ProfileFragment : Fragment() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Addmenu()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return onOptionsItemSelected(item)
    }

    private fun Addmenu() {
        val drawerLayout: DrawerLayout = requireView().findViewById(R.id.drawer_Layout)
        val navView: NavigationView = requireView().findViewById(R.id.nav_View)
        // Set up the toolbar


        toggle = ActionBarDrawerToggle(
            requireActivity(),  // Use requireActivity() to pass the Activity context
            drawerLayout,
            R.string.open,
            R.string.close
        )
        // Don't forget to add the DrawerListener and sync the state
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // use this exp SupportActionBar?.setDisplayHomeAsUpEnabled(true) in fragment
//        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> Toast.makeText(requireContext(), "Clicked Home ", Toast.LENGTH_LONG).show()
            }
            true
            }
        }
    }
