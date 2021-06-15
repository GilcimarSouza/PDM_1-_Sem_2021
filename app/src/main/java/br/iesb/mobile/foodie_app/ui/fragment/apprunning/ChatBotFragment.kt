package br.iesb.mobile.foodie_app.ui.fragment.apprunning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.iesb.mobile.foodie_app.R
import br.iesb.mobile.foodie_app.ui.adapter.CurrentFragmentAdapter

// TODO: Rename parameter arguments, choose names that match

class ChatBotFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        CurrentFragmentAdapter.setCurrentFragment("chatbot")
        return inflater.inflate(R.layout.fragment_chat_bot, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        CurrentFragmentAdapter.setCurrentFragment("chatbot")
    }

}