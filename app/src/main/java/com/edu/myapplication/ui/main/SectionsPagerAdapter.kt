package com.edu.myapplication.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.edu.myapplication.R

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fa: FragmentActivity/*FragmentManager*/) :
    FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return TAB_TITLES.size
    }

    fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 2) {
            PlaceholderFragment()
        } else {
            PlaceholderFragment.newInstance(position + 1)
        }
    }
}