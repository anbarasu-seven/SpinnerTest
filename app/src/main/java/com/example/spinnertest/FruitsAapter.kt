package com.example.spinnertest

import android.widget.ArrayAdapter
import android.content.Context

import android.widget.TextView

import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup

import androidx.annotation.Nullable
import androidx.annotation.NonNull

class FruitAdapter(
    context: Context,
    val fruits: Array<String>
) :
    ArrayAdapter<String>(context, 0, fruits) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View? {
        return initView(position, convertView, parent)
    }


    fun initView(
        position: Int,
        @Nullable convertView: View?,
        parent: ViewGroup
    ): View {
        // It is used to set our custom view.
        val childView: View = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        val textViewName: TextView = childView.findViewById(R.id.fruitName)
        val currentItem = fruits[position]
        // It is used the name to the TextView when the
        // current item is not null.
        textViewName.text = currentItem
        return childView
    }



}