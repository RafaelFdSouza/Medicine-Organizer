package br.com.rafael.medicineorganizer.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.rafael.medicineorganizer.R
import br.com.rafael.medicineorganizer.databinding.FragmentSplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {
    //View Binding
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       CoroutineScope(Dispatchers.Main).launch {
           delay(2000)
           checkAuth()
       }
    }

    private fun checkAuth(){
        findNavController().navigate(R.id.action_splashFragment2_to_loginFragment2)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}