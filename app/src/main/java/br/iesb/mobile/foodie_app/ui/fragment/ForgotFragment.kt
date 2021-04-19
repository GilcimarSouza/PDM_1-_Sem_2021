package br.iesb.mobile.foodie_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.iesb.mobile.foodie_app.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_resetpassword.*

class ForgotFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_send_reset.setOnClickListener {
            sendReset()
        }

        bt_voltar_reset.setOnClickListener {
            activity?.finish()
        }
    }
    private fun sendReset() {
        val email = tv_email_reset.text.toString()

        if(email.isBlank()) {
            Toast.makeText(activity, "Digite um e-mail válido!", Toast.LENGTH_LONG).show()
            return
        }
        val auth = FirebaseAuth.getInstance()
        auth.sendPasswordResetEmail(email)
        Toast.makeText(activity, "Email com reset de senha enviado!", Toast.LENGTH_LONG).show()
        activity?.finish()
    }

}