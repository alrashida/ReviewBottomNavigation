package com.mysus.reviewbottomnavigation.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mysus.reviewbottomnavigation.Fragment.Gallery.GalleryFragment
import com.mysus.reviewbottomnavigation.Fragment.Gallery.GalleryFragmentDirections
import com.mysus.reviewbottomnavigation.databinding.ItemRecylerGalleryBinding
import com.mysus.reviewbottomnavigation.model.Gallery

class AdapterGallery(private val listdataGallery: ArrayList<Gallery>) :
    RecyclerView.Adapter<AdapterGallery.ViewHolder>() {
    class ViewHolder(var binding: ItemRecylerGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itembinding =
            ItemRecylerGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gallery = listdataGallery[position]
        holder.binding.txtName.text = gallery.nama
        holder.binding.txtDesk.text = gallery.desc
        holder.binding.imgMe.setImageResource(gallery.gambar!!)

        holder.itemView.setOnClickListener{ View ->
            val dariadaptergallerykedetailgallery =  GalleryFragmentDirections.actionGalleryFragmentToDetailGalleryFragment()
            dariadaptergallerykedetailgallery.judul = gallery.nama.toString()
            dariadaptergallerykedetailgallery.descdetail = gallery.desc.toString()
            dariadaptergallerykedetailgallery.gbrdetail = gallery.gambar!!
            View.findNavController().navigate(dariadaptergallerykedetailgallery)

        }

    }

    override fun getItemCount() = listdataGallery.size
}