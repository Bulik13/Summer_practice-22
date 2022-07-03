package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class Snackbar_returnFragment:Fragment(R.layout.fragment_sbreturn) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments?.getString("NAME_TEXT").orEmpty()

        if(text.isNotEmpty()){
            Snackbar.make(view,text, Snackbar.LENGTH_SHORT).show()
        }
    }
}