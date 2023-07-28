package com.example.chargecalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText

class ResultGasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_gas)

        var gasResultTextView=findViewById<TextView>(R.id.textResult)

        var gasbasebill=intent.getIntExtra("gasbasebill",1250) //기본요금
        var gascitybsebill=intent.getDoubleExtra("gascitybsebill",20.7354) //도시가스요금
        var gasaverageheat=intent.getDoubleExtra("gasaverageheat",43.549) //평균열량
        var gasmodificationfactor=intent.getDoubleExtra("gasmodificationfactor",0.9973) //보정계수
        var gasusagecitygas=intent.getDoubleExtra("gasusagecitygas",0.0) //사용량

        var cost=((gasusagecitygas*gasmodificationfactor)*gasaverageheat*gascitybsebill)+gasbasebill
        var finalcost=cost+(cost*0.1)

        gasResultTextView.text="${finalcost.toInt()}원"
    }
}