package com.example.navigationcomponent

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import androidx.fragment.app.Fragment
import com.example.navigationcomponent.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    private lateinit var viewBinding: FragmentGalleryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentGalleryBinding.bind(view)

        viewBinding.tvArticle.movementMethod = ScrollingMovementMethod()
    }
}