package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding:FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMainBinding.bind(view)

        with(binding){
            buttonMain.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "NAME_TEXT",
                    (tvMain.text ?: "Error").toString()
                )

                findNavController().navigate(
                    R.id.action_mainFragment_to_snackbar_returnFragment,
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