package com.mysus.reviewbottomnavigation.Data

import com.mysus.reviewbottomnavigation.R
import com.mysus.reviewbottomnavigation.model.Gallery
object DataGallery {
    private val judulGallery = arrayOf(
        "\n Deluxe",
        " Superior",
        " standar",
        " Superior",


    )

    private val DescGallery = arrayOf(
        "kamar ternyaman",
        "Kamar B aja",
        "Kamar orang miskin",
        "Kamar ternyaman",



    )
    private val hargaGallery = arrayOf(
        "2000000000",
        "2000000000",
        "2000000000",
        "2000000000",

    )
    private val ImgGallery = intArrayOf(
        R.drawable.fto1,
        R.drawable.fto2,
        R.drawable.fto3,
        R.drawable.fto4,

    )
    val ListdataGallery: ArrayList<Gallery>
        get() {
            var list = arrayListOf<Gallery>()
            for (i in judulGallery.indices) {
                val gallery = Gallery()
                gallery.nama = judulGallery[i]
                gallery.desc = DescGallery[i]
                gallery.gambar = ImgGallery[i]
                list.add(gallery)


            }
            return list

        }
}