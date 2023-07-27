package com.example.chargecalculater

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.chargecalculater.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //전기부분
    lateinit var elecresultButton: Button
    lateinit var elecuse:EditText
    lateinit var eleclowp:RadioButton
    lateinit var elechighp:RadioButton
    lateinit var elecfamilynwelfare:Spinner
    lateinit var elecsummer:CheckBox
    lateinit var elecresultbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        //전기부분

        elecresultButton=findViewById(R.id.resultbutton)
        elecuse=findViewById(R.id.usage)
        eleclowp=findViewById(R.id.lowp)
        elechighp=findViewById(R.id.highp)
        elecfamilynwelfare=findViewById(R.id.familyandwelfare)
        elecsummer=findViewById(R.id.summercheck)

        elecresultButton.setOnClickListener{
            var intent= Intent(this,ResultElectric::class.java)
            intent.putExtra("elecuse",elecuse.text.toString())
            intent.putExtra("eleclowp",eleclowp.toString())
            intent.putExtra("elechighp",elechighp.toString())
            intent.putExtra("elecfamilyandwelfare",elecfamilynwelfare.toString())
            intent.putExtra("elecsummer",elecsummer.toString())

            startActivity(intent)

        }
    }
}