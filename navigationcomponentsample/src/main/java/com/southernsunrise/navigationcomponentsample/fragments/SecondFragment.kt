package com.southernsunrise.navigationcomponentsample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.southernsunrise.navigationcomponentsample.R
import com.southernsunrise.navigationcomponentsample.databinding.FragmentFourthBinding
import com.southernsunrise.navigationcomponentsample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {



    private var _binding: FragmentSecondBinding? = null
    val binding get() = _binding
    private val args:SecondFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupOnClickListeners()
    }

    private fun setupOnClickListeners() = with(binding!!) {
        btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        textView.text = args.name
    }

}