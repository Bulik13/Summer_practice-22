package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentSettingsBinding
import com.google.android.material.snackbar.Snackbar

class SettingsFragment:Fragment(R.layout.fragment_settings) {

    private var _binding:FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSettingsBinding.bind(view)

        with(binding){
            buttonSettings.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "NAME_TEXT",
                    (tvSetings.text ?: "Error").toString()
                )

                findNavController().navigate(
                    R.id.action_settingsFragment_to_snackbar_returnFragment,
                    bundle
                )

            }
        }

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}