package com.example.chargecalculater

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.round


class WaterResultActivity : AppCompatActivity() {

    lateinit var meter : Spinner
    lateinit var generation : Spinner
    lateinit var month: Spinner
    lateinit var waterusage : EditText
    lateinit var  discounType : Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_water)


        val waterresultTextView = findViewById<TextView>(R.id.waterResult)
        val meter = intent.getStringExtra("waterspinner")?.toInt()
        val month = intent.getIntExtra("monthspinner", 1)
        val usage = intent.getIntExtra("waterusage", 0)
        val discountType = intent.getStringExtra("generationspinner")


        //월 평균 사용량
        var monthlyUse = usage / month
        //상수도 요금 계산
        var uBillDefault = 0
        when(meter){
            15-> uBillDefault = 1080*month
            20-> uBillDefault = 3000*month
            25-> uBillDefault = 5200*month
            32-> uBillDefault = 9400*month
            40-> uBillDefault = 16000*month
            50-> uBillDefault = 25000*month
            65-> uBillDefault = 38900*month
            75-> uBillDefault = 52300*month
            100-> uBillDefault = 89000*month
            125-> uBillDefault = 143000*month
            150-> uBillDefault = 195000*month
            200-> uBillDefault = 277000*month
            250-> uBillDefault = 375000*month
            300-> uBillDefault = 465000*month
            350-> uBillDefault = 565000*month
            else -> uBillDefault = 6145000 *month
        }
        uBillDefault += monthlyUse * 580 * month
        //하수도 요금 계산
        var dBillDefault = monthlyUse * month
        if(monthlyUse<=30)
            dBillDefault * 400
        else if (monthlyUse<=50)
            dBillDefault * 930
        else
            dBillDefault * 1420

        //물 이용 부담금
        var waterUsePayment = monthlyUse * 170 * month
        var totalBill = uBillDefault + dBillDefault + waterUsePayment

        //감면액
        var discount = 0
        when(discountType){
            "복지개별요금 감면"-> discount = 10* 580 + 10*400 + 170*10
            "독립유공자 감면"-> discount = 10* 580 + 10*400 + 170*10
            "다자녀 하수도 감면"-> discount = (dBillDefault * 0.3).toInt()
            "한부모 감면"-> discount = 4000
            "중중장애인 감면"-> discount = 10* 580 + 10*400 + 170*10
            "자가검침 감면"-> discount = 600
            "전자고지 감면"-> discount = 200

        }
        totalBill -= discount


        waterresultTextView.text = totalBill.toString()




    }
}