package com.example.chargecalculater

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
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
    lateinit var elecradio:RadioGroup
    lateinit var eleclowp:RadioButton
    lateinit var elechighp:RadioButton
    lateinit var elecfamilynwelfare:Spinner
    lateinit var elecsummer:CheckBox


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
        elecradio=findViewById(R.id.contract)




        elecresultButton.setOnClickListener{
            var intent= Intent(this,ResultElectric::class.java)

            if(eleclowp.isChecked)
            {
                intent.putExtra("eleclowp",true)
                intent.putExtra("elechighp",false)
            }
            else if(elechighp.isChecked)
            {
                intent.putExtra("elechighp",true)
                intent.putExtra("eleclowp",false)
            }

            intent.putExtra("elecuse",Integer.parseInt(elecuse.text.toString()))

            intent.putExtra("elecfamilyandwelfare",elecfamilynwelfare.selectedItem.toString())
            if(elecsummer.isChecked)
                intent.putExtra("elecsummer",true)
            else
                intent.putExtra("elecsummer",false)

            startActivity(intent)

        }

    }
}

