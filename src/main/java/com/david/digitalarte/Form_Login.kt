package com.david.digitalarte


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.david.digitalarte.databinding.FragmentFirstBinding
import com.google.android.gms.auth.api.signin.GoogleSignInClient

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Form_Login : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var googleSignInClient: GoogleSignInClient



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        //botao que vai para tela cadastro
        binding.textTelaCadastro.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        //botão de login
        binding.botaoLogin.setOnClickListener {
            findNavController().navigate(R.id.FirstFragment_to_third_fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}