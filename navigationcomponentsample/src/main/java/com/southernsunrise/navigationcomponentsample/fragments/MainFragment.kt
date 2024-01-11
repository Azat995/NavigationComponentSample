package com.southernsunrise.navigationcomponentsample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.southernsunrise.navigationcomponentsample.R
import com.southernsunrise.navigationcomponentsample.databinding.FragmentFirstBinding
import com.southernsunrise.navigationcomponentsample.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupOnClickListeners()
    }

    private fun setupOnClickListeners() = with(binding) {
        binding?.btnNext?.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
        }
    }

}