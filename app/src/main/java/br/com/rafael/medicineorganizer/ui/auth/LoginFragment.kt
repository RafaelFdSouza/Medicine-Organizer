package br.com.rafael.medicineorganizer.ui.auth

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController
import br.com.rafael.medicineorganizer.R
import br.com.rafael.medicineorganizer.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
    }

    private fun initClick() {
        binding.btnCreateAccount.setOnClickListener {
            binding.btnCreateAccount.apply {
                setTextColor(resources.getColor(R.color.grey, null))
                setBackgroundColor(resources.getColor(R.color.color_default, null))
            }

            findNavController().navigate(R.id.action_loginFragment2_to_registerFragment2)
        }
        binding.btnRecoveryAccount.setOnClickListener {
            binding.btnRecoveryAccount.apply {
                setBackgroundColor(resources.getColor(R.color.color_default, null))
                setTextColor(resources.getColor(R.color.grey, null))
            }
            findNavController().navigate(R.id.action_loginFragment2_to_recoveryAccountFragment2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}