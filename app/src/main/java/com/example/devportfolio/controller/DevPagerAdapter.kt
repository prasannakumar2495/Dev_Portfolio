package com.example.devportfolio.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.devportfolio.view.AboutFragment
import com.example.devportfolio.view.ContactFragment
import com.example.devportfolio.view.SkillFragment
import com.example.devportfolio.view.WorkFragment

class DevPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillFragment()
            3 -> return ContactFragment()
        }
        // return null   : as we are not allowed to return "null", below line is added.
        throw IllegalStateException("position $position is invalid for this viewpager")
    }

    override fun getCount(): Int {
        return 4
        //we do know the number of fragments already.
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }
        return null
    }
}