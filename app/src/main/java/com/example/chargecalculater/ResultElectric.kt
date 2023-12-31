package com.example.chargecalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import kotlin.math.round


class ResultElectric : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_electric)

        var elecresultTextView = findViewById<TextView>(R.id.textResult)

        var elecuse= intent.getIntExtra("elecuse",0)
        var eleclowp=intent.getBooleanExtra("eleclowp",false)
        var elechighp=intent.getBooleanExtra("elechighp",false)
        var elecfamilyandwelfare=intent.getStringExtra("elecfamilyandwelfare")
        var elecsummer=intent.getBooleanExtra("elecsummer",false)



        if(eleclowp) //저압용이면
        {
                if(elecfamilyandwelfare.equals("해당없음"))
                {
                    if(elecsummer) //하계계절이면
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2=(cost*0.037) //전력기반기금
                            var finalcost=(cost+cost1+cost2)



                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)


                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("5인이상 가구") || elecfamilyandwelfare.equals("3자녀이상 가구") || elecfamilyandwelfare.equals("출산가구"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=(finalcost-16000)
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("생명유지장치") || elecfamilyandwelfare.equals("사회복지시설"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("장애인") || elecfamilyandwelfare.equals("독립유공자") || elecfamilyandwelfare.equals("국가유공자") || elecfamilyandwelfare.equals("5.18민주유공자"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("기초생활수급(생계,의료)"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>16000)
                                finalcost=finalcost-16000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("기초생활수급(주거,교육)"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>12000)
                                finalcost=finalcost-12000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>12000)
                                finalcost=finalcost-12000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)


                            if(finalcost*0.3>12000)
                                finalcost=finalcost-12000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>10000)
                                finalcost=finalcost-10000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>10000)
                                finalcost=finalcost-10000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>10000)
                                finalcost=finalcost-10000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("차상위계층"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)


                            if(finalcost*0.3>10000)
                                finalcost=finalcost-10000
                            else
                                finalcost=finalcost-(finalcost*0.3)



                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=450)
                        {
                            var cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)


                            if(finalcost*0.3>10000)
                                finalcost=finalcost-10000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 + (300*120)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)


                            if(finalcost*0.3>10000)
                                finalcost=finalcost-10000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            var cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>8000)
                                finalcost=finalcost-8000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else if(elecuse<=400)
                        {
                            var cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>8000)
                                finalcost=finalcost-8000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                        else
                        {
                            var cost = 7300.0 +(200*120)+(200*214.6)+((elecuse-400)*307.3)+(elecuse*9)+(elecuse*5)
                            var cost1 =cost*0.1 //부가가치세
                            var cost2 = cost*0.037  //전력기반기금
                            var finalcost=(cost+cost1+cost2)

                            if(finalcost*0.3>8000)
                                finalcost=finalcost-8000
                            else
                                finalcost=finalcost-(finalcost*0.3)

                            elecresultTextView.text = "${finalcost.toInt()}원"
                        }
                    }
                }
        }
        else if(elechighp)//고압용이면
        {
            if(elecfamilyandwelfare.equals("해당없음"))
            {
                if(elecsummer) //하계계절이면
                {
                    if(elecuse<=300)
                    {
                        var cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2=(cost*0.037)/10 //전력기반기금
                        var finalcost=(cost+cost1+cost2)/10



                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)


                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060.0 + (300*730)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        elecresultTextView.text = "${finalcost.toInt()}원"

                        Log.d("값0",cost.toString())
                        Log.d("값1",cost1.toString())
                        Log.d("값2",cost2.toString())
                        Log.d("값3",finalcost.toString())
                    }
                }
            }
            else if(elecfamilyandwelfare.equals("5인이상 가구") || elecfamilyandwelfare.equals("3자녀이상 가구") || elecfamilyandwelfare.equals("출산가구"))
            {
                if(elecsummer)
                {
                    if(elecuse<=300)
                    {
                        var cost = 730 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=(finalcost-16000)
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060.0 + (300*105)+(150*174.0)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
            }
            else if(elecfamilyandwelfare.equals("생명유지장치") || elecfamilyandwelfare.equals("사회복지시설"))
            {
                if(elecsummer)
                {
                    if(elecuse<=300)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
            }
            else if(elecfamilyandwelfare.equals("장애인") || elecfamilyandwelfare.equals("독립유공자") || elecfamilyandwelfare.equals("국가유공자") || elecfamilyandwelfare.equals("5.18민주유공자"))
            {
                if(elecsummer)
                {
                    if(elecuse<=300)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>20000)
                            finalcost-=20000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>20000)
                            finalcost-=20000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>20000)
                            finalcost-=20000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
            }
            else if(elecfamilyandwelfare.equals("기초생활수급(생계,의료)"))
            {
                if(elecsummer)
                {
                    if(elecuse<=300)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>20000)
                            finalcost-=20000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>20000)
                            finalcost-=20000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>20000)
                            finalcost-=20000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>16000)
                            finalcost=finalcost-16000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
            }
            else if(elecfamilyandwelfare.equals("기초생활수급(주거,교육)"))
            {
                if(elecsummer)
                {
                    if(elecuse<=300)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>12000)
                            finalcost=finalcost-12000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>12000)
                            finalcost=finalcost-12000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)


                        if(finalcost*0.3>12000)
                            finalcost=finalcost-12000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>10000)
                            finalcost=finalcost-10000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>10000)
                            finalcost=finalcost-10000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>10000)
                            finalcost=finalcost-10000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
            }
            else if(elecfamilyandwelfare.equals("차상위계층"))
            {
                if(elecsummer)
                {
                    if(elecuse<=300)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>10000)
                            finalcost=finalcost-10000
                        else
                            finalcost=finalcost-(finalcost*0.3)



                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=450)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)


                        if(finalcost*0.3>10000)
                            finalcost=finalcost-10000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {

                        var cost = 6060 + (200*105)+(200*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)


                        if(finalcost*0.3>10000)
                            finalcost=finalcost-10000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
                else
                {
                    if(elecuse<=200)
                    {
                        var cost = 730 + (elecuse*105.0)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>8000)
                            finalcost=finalcost-8000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else if(elecuse<=400)
                    {
                        var cost = 1260 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>8000)
                            finalcost=finalcost-8000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                    else
                    {
                        var cost = 6060 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                        var cost1 =cost*0.1 //부가가치세
                        var cost2 = cost*0.037  //전력기반기금
                        var finalcost=(cost+cost1+cost2)

                        if(finalcost*0.3>8000)
                            finalcost=finalcost-8000
                        else
                            finalcost=finalcost-(finalcost*0.3)

                        elecresultTextView.text = "${finalcost.toInt()}원"
                    }
                }
            }
        }
        }
    }