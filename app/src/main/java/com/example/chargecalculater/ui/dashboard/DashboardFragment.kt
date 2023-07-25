package com.example.chargecalculater.ui.dashboard

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
import com.example.chargecalculater.WaterResultActivity
import com.example.chargecalculater.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    lateinit var mainActivity: MainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val waterMeter=binding.waterspinner
        waterMeter.adapter=ArrayAdapter.createFromResource(mainActivity, R.array.meter,android.R.layout.simple_spinner_item)

        val Generation=binding.generationspinner
        Generation.adapter=ArrayAdapter.createFromResource(mainActivity, R.array.generation,android.R.layout.simple_spinner_item)

        val Month=binding.monthspinner
        Month.adapter=ArrayAdapter.createFromResource(mainActivity,R.array.month,android.R.layout.simple_spinner_item)

        val textView: TextView = binding.waterusage
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = ""
        }

        val waterresult: Button = binding.waterbill
        waterresult.findViewById<Button>(R.id.waterbill)

        waterresult.setOnClickListener {
            var intent = Intent(mainActivity, WaterResultActivity::class.java)
            startActivity(intent)
        }
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}