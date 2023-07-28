package com.example.chargecalculater.ui.notifications

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.chargecalculater.MainActivity
import com.example.chargecalculater.R
import com.example.chargecalculater.ResultElectric
import com.example.chargecalculater.ResultGasActivity
import com.example.chargecalculater.databinding.FragmentNotificationsBinding


class NotificationsFragment : Fragment() {

    lateinit var mainActivity: MainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

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

        val gasbasebill:EditText=binding.basebill
        gasbasebill.findViewById<EditText>(R.id.citygasbill)

        val gascitygasbill:EditText=binding.citygasbill
        gascitygasbill.findViewById<EditText>(R.id.citygasbill)

        val gasaverageheat:EditText=binding.averageheat
        gasaverageheat.findViewById<EditText>(R.id.averageheat)

        val gasmodificationfactor:EditText=binding.modificationfactor
        gasmodificationfactor.findViewById<EditText>(R.id.modificationfactor)

        val gasusagecitygas:EditText=binding.usagecitygas
        gasusagecitygas.findViewById<EditText>(R.id.usagecitygas)

        val gasButton:Button=binding.resultgasbutton
        gasButton.findViewById<Button>(R.id.resultgasbutton)

        val resultgasButton: Button = binding.resultgasbutton
        resultgasButton.findViewById<Button>(R.id.resultgasbutton)


        resultgasButton.setOnClickListener {
            var intent = Intent(context, ResultGasActivity::class.java)

            intent.putExtra("gasbasebill",gascitygasbill.text)
            intent.putExtra("gascitybsebill",gascitygasbill.text)
            intent.putExtra("gasaverageheat",gasaverageheat.text)
            intent.putExtra("gasmodificationfactor",gasmodificationfactor.text)
            intent.putExtra("gasusagecitygas",gasusagecitygas.text)
            startActivity(intent)
        }


        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}