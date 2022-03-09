package com.example.cataloghw.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cataloghw.services.HomeActivity
import com.example.cataloghw.databinding.FragmentLoginBinding
import com.example.cataloghw.services.SharedPref

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val sharedPref = context?.let { SharedPref(it) }
        if (!sharedPref?.login.isNullOrBlank() && !sharedPref?.password.isNullOrBlank()) {
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.saveBtn.setOnClickListener {
            sharedPref?.login = binding.loginEdittext.text.toString()
            sharedPref?.password = binding.passwordEdittext.text.toString()
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        binding.getBtn.setOnClickListener {
            val arg =
                requireActivity().getSharedPreferences("SharedPreference", Context.MODE_PRIVATE)
                    ?.apply {
                        val login = getString("login", null)
                        val password = getString("password", null)

                        binding.loginEdittext.setText(login)
                        binding.passwordEdittext.setText(password)
                    }


        }

        return binding.root
    }

}