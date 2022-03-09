package com.example.cataloghw.fragments

import android.os.Bundle
import android.provider.SyncStateContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cataloghw.adapters.AdapterGrid
import com.example.cataloghw.services.Constants
import com.example.cataloghw.databinding.FragmentGridBinding

class GridFragment : Fragment() {
    private var _binding: FragmentGridBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGridBinding.inflate(inflater, container, false)

        binding.recyclerviewGrid.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.recyclerviewGrid.adapter = AdapterGrid(Constants.array, requireActivity())

        return binding.root


    }

}