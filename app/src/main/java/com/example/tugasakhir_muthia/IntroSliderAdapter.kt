package com.example.tugasakhir_muthia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Adapter berfungsi untuk menampilkan item yang dimuat ke dalam adapter
//Adapter buat menghubungkan data dengan view nya
//adapter

// membuat introSlides untuk mengubah data nya menjadi bentuk list
class IntroSliderAdapter (private val introSlides : List<IntroSlide>)
//kalau buat adapter ada kodingan ini
    : RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewHolder {
        return IntroSliderViewHolder(
            // onCreateViewHolder = fungsi nya untuk memanggil layout yang kita buat untuk menaruh data
            LayoutInflater.from(parent.context).inflate(R.layout.slide_item,parent,false)
        )
    }

    override fun getItemCount(): Int {
        //buat ngitung si list nya ada berapa
        return introSlides.size
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        //buat nge set up widget2 nya
        //buat mengikat widget2 nya dengan data
        holder.bind(introSlides[position])
    }

    inner class IntroSliderViewHolder (view : View) : RecyclerView.ViewHolder(view){
        //inisialisasi = panggil id per widget nya
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)
        private val imageIcon = view.findViewById<ImageView>(R.id.imageIcon)

        //function bind untuk mengikat widget2 nya dengan data
        fun bind (introSlide: IntroSlide){
            textTitle.text = introSlide.title
            textDescription.text = introSlide.description
            imageIcon.setImageResource(introSlide.image)
        }

    }
}