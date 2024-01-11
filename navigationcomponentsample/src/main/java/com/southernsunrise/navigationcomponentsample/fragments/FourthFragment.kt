package com.southernsunrise.navigationcomponentsample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.southernsunrise.navigationcomponentsample.R
import com.southernsunrise.navigationcomponentsample.databinding.FragmentFirstBinding
import com.southernsunrise.navigationcomponentsample.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {


    private var _binding: FragmentFourthBinding? = null
    val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupOnClickListeners()
    }

    private fun setupOnClickListeners() {
        binding?.btnNext?.setOnClickListener {

        }
    }

}