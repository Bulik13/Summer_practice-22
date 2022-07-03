package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentMainBinding
import com.example.summerpractice.databinding.FragmentMessageBinding
import com.google.android.material.snackbar.Snackbar

class MessageFragment:Fragment(R.layout.fragment_message) {

    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMessageBinding.bind(view)

        with(binding){
            buttonMessage.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "NAME_TEXT",
                    (tvMessage.text ?: "Error").toString()
                )

                findNavController().navigate(
                    R.id.action_messageFragment_to_snackbar_returnFragment,
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