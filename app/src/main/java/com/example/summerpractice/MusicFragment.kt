package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentMusicBinding
import com.google.android.material.snackbar.Snackbar

class MusicFragment:Fragment(R.layout.fragment_music) {

    private var _binding:FragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMusicBinding.bind(view)

        with(binding){
            buttonMusic.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "NAME_TEXT",
                    (tvMusic.text ?: "Error").toString()
                )

                findNavController().navigate(
                    R.id.action_musicFragment_to_snackbar_returnFragment,
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