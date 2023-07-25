package com.example.chargecalculater.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.chargecalculater.MainActivity
import com.example.chargecalculater.R
import com.example.chargecalculater.ResultElectric
import com.example.chargecalculater.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    lateinit var mainActivity: MainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val famAry = binding.family
        famAry.adapter = ArrayAdapter.createFromResource(mainActivity, R.array.familys, android.R.layout.simple_spinner_item)

        val welfAry = binding.welfare
        welfAry.adapter = ArrayAdapter.createFromResource(mainActivity, R.array.welfares, android.R.layout.simple_spinner_item)

        val textView: TextView = binding.usage
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = ""
        }

        val resultB: Button = binding.resultbutton
        resultB.findViewById<Button>(R.id.resultbutton)

        resultB.setOnClickListener {
            var intent = Intent(mainActivity, ResultElectric::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}