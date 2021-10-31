package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener {
            changeFragment()
        }
    }

    private fun changeFragment() {
        when (counter) {
            1 -> openFragment(FirstFragment.newInstance(), FirstFragment.TAG)
            2 -> openFragment(SecondFragment.newInstance(), SecondFragment.TAG)
            3 -> openFragment(ThirdFragment.newInstance(), ThirdFragment.TAG)
        }
        counter++
        if (counter > 3) {
            counter = 1
        }
    }

    private fun openFragment(fragment: Fragment, TAG: String) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(TAG)
            .add(R.id.container, fragment)
            .commit()
    }
}
