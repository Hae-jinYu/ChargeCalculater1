package com.example.chargecalculater.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.chargecalculater.R
import com.example.chargecalculater.ResultElectric
import com.example.chargecalculater.ResultGasActivity
import com.example.chargecalculater.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.basebill
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = ""
        }

        val resultgasButton: Button = binding.resultgasbutton
        resultgasButton.findViewById<Button>(R.id.resultgasbutton)

        resultgasButton.setOnClickListener {
            var intent = Intent(context, ResultGasActivity::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}