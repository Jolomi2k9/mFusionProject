package com.example.mfusionclone.screens.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mfusionclone.R
import com.example.mfusionclone.databinding.FragmentCartBinding
import com.example.mfusionclone.databinding.FragmentMenuBinding


class Cart : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCartBinding>(
            inflater,
            R.layout.fragment_cart, container, false
        )
        return binding.root
    }
}