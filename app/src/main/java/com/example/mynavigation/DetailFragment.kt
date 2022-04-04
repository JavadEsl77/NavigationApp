package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynavigation.databinding.FragmentDetailBinding
import com.example.mynavigation.databinding.FragmentHomeBinding

class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        var sample_text = arguments?.getString("test")
        binding.txtTitle.text = sample_text
        return binding.root
    }

}