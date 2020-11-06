package com.tugastengahsemester.dwikustiarno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var DashboardFragment : DashboardFragment
    lateinit var ReviewFragment : ReviewFragment
    lateinit var AkunFragment : AkunFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.btn_nav)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    DashboardFragment = DashboardFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, DashboardFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.list -> {
                    ReviewFragment = ReviewFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, ReviewFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.task -> {
                    AkunFragment = AkunFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, AkunFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
            true
        }
    }
}