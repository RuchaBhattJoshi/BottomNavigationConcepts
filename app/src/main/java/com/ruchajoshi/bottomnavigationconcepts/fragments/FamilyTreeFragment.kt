package com.ruchajoshi.bottomnavigationconcepts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ruchajoshi.bottomnavigationconcepts.databinding.FragmentFamilytreeBinding

class FamilyTreeFragment : Fragment() {
    private lateinit var binding: FragmentFamilytreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFamilytreeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}