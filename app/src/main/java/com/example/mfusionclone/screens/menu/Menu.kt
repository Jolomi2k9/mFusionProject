package com.example.mfusionclone.screens.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mfusionclone.R
import com.example.mfusionclone.databinding.FragmentLandingBinding
import com.example.mfusionclone.databinding.FragmentMenuBinding


class Menu : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    private lateinit var viewModel: MenuViewModel

    /*private var viewModel: MenuViewModel by activityViewModels() */


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMenuBinding>(
            inflater,
            R.layout.fragment_menu, container, false
        )

        /**
         * Creating a ViewModel instance using viewModelProvider in order to save the instance
         * during configuration change.
         * This creates an instance of the class MenuViewModel and stores it in the viewModel
         * variable
         */
        viewModel = ViewModelProvider(this).get(MenuViewModel::class.java)

        /**
         * Set the viewModel for data-binding - this allows the bound layout access
         * to all the data in the ViewModel
         */
        binding.menuViewModel = viewModel



        return binding.root
    }
}