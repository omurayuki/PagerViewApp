package com.myappcompany.pagerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.nshmura.recyclertablayout.RecyclerTabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: MoviesPagerAdapter
    private lateinit var recyclerTabLayout: RecyclerTabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = MovieHelper.getMovieFromJson("movies.json", this)

        viewPager = findViewById(R.id.viewPager)

        pagerAdapter = MoviesPagerAdapter(supportFragmentManager, movies)
        viewPager.adapter = pagerAdapter

        recyclerTabLayout = findViewById(R.id.recyclerTabLayout)
        recyclerTabLayout.setUpWithViewPager(viewPager)

        viewPager.currentItem = pagerAdapter.count / 2
    }
}
