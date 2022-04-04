package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.mynavigation.databinding.FragmentDetailBinding
import com.example.mynavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {

            var bundle = bundleOf("test" to "sample text")

            it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment2, bundle)
        }

        return binding.root
    }

}