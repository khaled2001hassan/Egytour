package com.example.graduationproject2.ui.home.ui.adpter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("setImage")
fun Bindind(image:ImageView , resource :Int){
image.setImageResource(resource)
}