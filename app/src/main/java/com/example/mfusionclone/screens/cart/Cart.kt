package com.example.mfusionclone.screens.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mfusionclone.R
import com.example.mfusionclone.databinding.FragmentCartBinding
import com.example.mfusionclone.databinding.FragmentMenuBinding
import com.example.mfusionclone.screens.menu.MenuViewModel


class Cart : Fragment() {


    private lateinit var viewModel: MenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCartBinding>(
            inflater,
            R.layout.fragment_cart, container, false
        )


        /**
         * Creating a ViewModel instance using viewModelProvider in order to save the instance
         * during configuration change.
         * This creates an instance of the class MenuViewModel and stores it in the viewModel
         * variable
         * This will be a shared viewModel between the menu and cart fragments
         */
        viewModel = ViewModelProvider(this).get(MenuViewModel::class.java)






        return binding.root
    }
}