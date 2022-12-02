package com.mysus.reviewbottomnavigation.Fragment.Gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mysus.reviewbottomnavigation.R
import com.mysus.reviewbottomnavigation.databinding.FragmentDetailGalleryBinding


class DetailGalleryFragment : Fragment() {

    private lateinit var binding : FragmentDetailGalleryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailGalleryBinding.inflate(inflater, container, false)


        val ambildatanamadarigallery = DetailGalleryFragmentArgs.fromBundle(arguments as Bundle).judul
        val ambildatadescdetaildarigallery = DetailGalleryFragmentArgs.fromBundle(arguments as Bundle).descdetail
        val ambildatagbrdarigallery = DetailGalleryFragmentArgs.fromBundle(arguments as Bundle).gbrdetail
        val ambildatahargagallery = DetailGalleryFragmentArgs.fromBundle(arguments as Bundle).hargadetail

        binding.txtJudul.text = ambildatanamadarigallery
        binding.txtDesc.text = ambildatadescdetaildarigallery
        binding.imgW.setImageResource(ambildatagbrdarigallery)

        return binding.root
    }


}