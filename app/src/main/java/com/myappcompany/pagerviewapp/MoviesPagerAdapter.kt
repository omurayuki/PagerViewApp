package com.myappcompany.pagerviewapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

private const val MAX_VALUE = 200

class MoviesPagerAdapter(fragmentManager: FragmentManager, private val movies: ArrayList<Movie>): FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
//        MovieFragment.newInstance(movies[position % movies.size])
    }

    override fun getCount(): Int {
        return movies.size * MAX_VALUE
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return movies[position % movies.size].title
    }
}
