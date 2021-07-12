package com.gb.myapplication.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gb.myapplication.R
import com.gb.myapplication.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private lateinit var viewModel: TwoViewModel
    private lateinit var binding: FragmentTwoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_two, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(TwoViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.bottomSheet.viewModel = viewModel
        binding.bottomSheet.bottomSheetContainer.alpha= 0.7F

    }
}