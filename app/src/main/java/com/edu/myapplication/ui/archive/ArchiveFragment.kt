package com.edu.myapplication.ui.archive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.edu.myapplication.R
import com.edu.myapplication.databinding.FragmentGalleryBinding

class ArchiveFragment : Fragment() {
    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val archiveViewModel =
            ViewModelProvider(this)[ArchiveViewModel::class.java]

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        archiveViewModel.initText(resources.getString(R.string.it_s_archive_fragment))

        val textView: TextView = binding.textGallery
        archiveViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}