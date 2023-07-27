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
        val meter = intent.getStringExtra("waterMeter")
        var month  = intent.getStringExtra("waterMonth")!!.split("개월")!!.get(0)!!.toInt()
        val usage = intent.getStringExtra("waterUsage")!!.toInt()
        val discountType = intent.getStringExtra("waterDiscount")

        // 로그 확인
        Log.d("계량기 값",meter.toString())
        Log.d("개월 수",month.toString())
        Log.d("사용량",usage.toString())
        Log.d("감면액",discountType.toString())

        //월 평균 사용량
        var monthlyUse = usage / month
        //상수도 요금 계산
        var uBillDefault = 0
        when(meter){
            "15mm"-> uBillDefault = 1080*month
            "20mm"-> uBillDefault = 3000*month
            "25mm"-> uBillDefault = 5200*month
            "32mm"-> uBillDefault = 9400*month
            "40mm"-> uBillDefault = 16000*month
            "50mm"-> uBillDefault = 25000*month
            "65mm"-> uBillDefault = 38900*month
            "75mm"-> uBillDefault = 52300*month
            "100mm"-> uBillDefault = 89000*month
            "125mm"-> uBillDefault = 143000*month
            "150mm"-> uBillDefault = 195000*month
            "200mm"-> uBillDefault = 277000*month
            "250mm"-> uBillDefault = 375000*month
            "300mm"-> uBillDefault = 465000*month
            "350mm"-> uBillDefault = 565000*month
            else -> uBillDefault = 6145000 *month
        }
        uBillDefault += monthlyUse * 580 * month
        //하수도 요금 계산
        var dBillDefault = monthlyUse * month
        if(usage<=30)
            dBillDefault *=  400
        else if (monthlyUse<= 50)
            dBillDefault *= 930
        else
            dBillDefault *= 1420

        //물 이용 부담금
        var waterUsePayment = monthlyUse * 170 * month
        var totalBill = uBillDefault + dBillDefault + waterUsePayment

        Log.d("월 이용량", monthlyUse.toString())
        Log.d("상수도 요금", uBillDefault.toString())
        Log.d("하수도 요금", dBillDefault.toString())
        Log.d("물이용 부담금", waterUsePayment.toString())
        Log.d("총 이용요금", totalBill.toString())
        //감면액
        var discount = 0
        when(discountType){
            "해당없음" -> discount = 0
            "복지개별요금 감면"-> discount = 10* 580 + 10*400 + 170*10
            "독립유공자 감면"-> discount = 10* 580 + 10*400 + 170*10
            "다자녀 하수도 감면"-> discount = (dBillDefault * 0.3).toInt()
            "한부모 감면"-> discount = 4000
            "중중장애인 감면"-> discount = 10* 580 + 10*400 + 170*10
            "자가검침 감면"-> discount = 600
            "전자고지 감면"-> discount = 200

        }
        totalBill -= discount


        waterresultTextView.text = "${totalBill}원"




    }
}