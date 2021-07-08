package com.gb.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.gb.myapplication.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding:FragmentSettingBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_setting, container, false
        )
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioButton -> setTheme(AppCompatDelegate.MODE_NIGHT_NO)
                R.id.radioButton2 -> setTheme(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }

        return binding.root
    }

    private fun setTheme(themeMode: Int) {
        AppCompatDelegate.setDefaultNightMode(themeMode)
    }

}


