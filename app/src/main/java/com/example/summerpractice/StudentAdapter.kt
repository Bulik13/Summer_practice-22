package com.example.summerpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summerpractice.databinding.ItemStudentBinding

class StudentAdapter(
    private val list: List<Student>,
    private val onItemClick: (Student) -> Unit,
): RecyclerView.Adapter<StudentHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentHolder = StudentHolder(
        ItemStudentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        onItemClick
    )

    override fun onBindViewHolder(
        holder: StudentHolder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}