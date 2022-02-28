package com.charles.zuo.lodge

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PhotoAlbumFragment : Fragment() {

    companion object {
        fun newInstance() = PhotoAlbumFragment()
    }

    private lateinit var viewModel: PhotoAlbumViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.photo_album_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PhotoAlbumViewModel::class.java)
        // TODO: Use the ViewModel
    }

}