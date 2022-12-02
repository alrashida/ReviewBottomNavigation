package com.mysus.reviewbottomnavigation.Fragment.Gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mysus.reviewbottomnavigation.Adapter.AdapterGallery
import com.mysus.reviewbottomnavigation.Data.DataGallery
import com.mysus.reviewbottomnavigation.R
import com.mysus.reviewbottomnavigation.databinding.FragmentGalleryBinding
import com.mysus.reviewbottomnavigation.model.Gallery
import kotlinx.android.synthetic.main.fragment_gallery.*


class GalleryFragment : Fragment() {

    private lateinit var bindinggallery : FragmentGalleryBinding
    private var list : ArrayList<Gallery> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bindinggallery = FragmentGalleryBinding .inflate(inflater, container, false)
            bindinggallery.RecylerView.setHasFixedSize(true)
        list.addAll(DataGallery.ListdataGallery)
        bindinggallery.RecylerView.layoutManager = LinearLayoutManager(context)
        val adapter = AdapterGallery(list)
        bindinggallery.RecylerView.adapter = adapter
        return bindinggallery.root
    }

}