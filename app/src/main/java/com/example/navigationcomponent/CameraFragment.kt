package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationcomponent.databinding.FragmentCameraBinding

class CameraFragment : Fragment(R.layout.fragment_camera) {

    private lateinit var viewBinding: FragmentCameraBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentCameraBinding.bind(view)

        val navController = view.findNavController()

        viewBinding.btnGallery.setOnClickListener {
            navController.navigate(R.id.action_cameraFragment_to_galleryFragment)
        }

        viewBinding.btnClick.setOnClickListener {
            navController.navigate(R.id.action_cameraFragment_to_clickFragment)
        }

    }
}