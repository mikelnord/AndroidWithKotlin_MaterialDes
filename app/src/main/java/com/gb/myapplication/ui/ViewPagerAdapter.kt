package com.gb.myapplication.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gb.myapplication.pages.OneFragment
import com.gb.myapplication.pages.ThreeFragment
import com.gb.myapplication.pages.TwoFragment

private const val NUM_TABS = 3

 class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return OneFragment()
            1 -> return TwoFragment()
        }
        return ThreeFragment()
    }
}