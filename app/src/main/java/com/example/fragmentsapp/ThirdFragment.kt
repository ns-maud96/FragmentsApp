package com.example.fragmentsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {
    companion object {
        const val TAG = "com.example.myapplication.ThirdFragment"

        fun newInstance() = ThirdFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_third, container, false)
}
