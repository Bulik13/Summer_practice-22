package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentProfileBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment: Fragment(R.layout.fragment_profile) {

    private var _binding:FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private var adapter: StudentAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentProfileBinding.bind(view)

        adapter = StudentAdapter(StuentRepository.students) {
            Snackbar.make(
                binding.root,
                "Student id: ${it.id}",
                Snackbar.LENGTH_SHORT
            ).show()
        }
        binding.rvStudents.adapter = adapter

        with(binding){
            buttonProfile.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "NAME_TEXT",
                    (tvProfile.text ?: "Error").toString()
                )

                findNavController().navigate(
                    R.id.action_profileFragment_to_snackbar_returnFragment,
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