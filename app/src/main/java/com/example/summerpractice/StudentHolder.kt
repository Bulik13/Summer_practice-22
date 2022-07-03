package com.example.summerpractice

import androidx.recyclerview.widget.RecyclerView
import com.example.summerpractice.databinding.ItemStudentBinding

class StudentHolder(
    private val binding: ItemStudentBinding,
    private val onItemClick: (Student) -> Unit,
):RecyclerView.ViewHolder(binding.root) {

    fun onBind(student: Student){
        with(binding){
            tvFirstname.text = student.first_name
            tvLastname.text = student.last_name

            root.setOnClickListener {
                onItemClick(student)
            }
        }
    }
}