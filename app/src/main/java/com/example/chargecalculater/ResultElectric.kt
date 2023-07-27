package com.example.chargecalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        val elecresultTextView = findViewById<TextView>(R.id.textResult)

        val elecuse= intent.getIntExtra("elecuse",0)
        val eleclowp=intent.getStringExtra("eleclowp").toBoolean()
        val elechighp=intent.getStringExtra("elechighp").toBoolean()
        val elecfamilyandwelfare=intent.getStringExtra("elecfamilyandwelfare")
        val elecsummer=intent.getStringExtra("elecsummer").toBoolean()


        if(eleclowp) //저압용이면
        {
                if(elecfamilyandwelfare.equals("해당없음"))
                {
                    if(elecsummer) //하계계절이면
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("5인이상 가구") || elecfamilyandwelfare.equals("3자녀이상 가구") || elecfamilyandwelfare.equals("출산가구"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("생명유지장치") || elecfamilyandwelfare.equals("사회복지시설"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("장애인") || elecfamilyandwelfare.equals("독립유공자") || elecfamilyandwelfare.equals("국가유공자") || elecfamilyandwelfare.equals("5.18민주유공자"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("기초생활수급(생계,의료)"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("기초생활수급(주거,교육)"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>12000)
                                finalcost-=12000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>12000)
                                finalcost-=12000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>12000)
                                finalcost-=12000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
                else if(elecfamilyandwelfare.equals("차상위계층"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1600.0 + (300*120)+((elecuse-300)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (300*105)+(150*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 910.0 + (elecuse*120)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>8000)
                                finalcost-=8000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1600.0 + (200*120)+((elecuse-200)*214.6)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>8000)
                                finalcost-=8000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 7300.0 + (200*105)+(200*214.6)+((elecuse-450)*307.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>8000)
                                finalcost-=8000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
        }
        else if(elechighp) //고압용이면
        {
            if(elecfamilyandwelfare.equals("해당없음"))
                {
                    if(elecsummer) //하계계절이면
                    {
                        if(elecuse<=300)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            val finalcost=(cost+cost1+cost2)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                }
            else if(elecfamilyandwelfare.equals("5인이상 가구") || elecfamilyandwelfare.equals("3자녀이상 가구") || elecfamilyandwelfare.equals("출산가구"))
                {
                        if(elecsummer)
                        {
                            if(elecuse<=300)
                            {
                                val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                                val cost1 =round(cost*0.1) //부가가치세
                                val cost2=(cost*0.037)/10*10 //전력기반기금
                                var finalcost=(cost+cost1+cost2)/10*10

                                if(finalcost*0.3>16000)
                                    finalcost-=16000
                                else
                                    finalcost-=(finalcost*0.3)/10*10

                                elecresultTextView.text = finalcost.toString()
                            }
                            else if(elecuse<=450)
                            {
                                val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                                val cost1 =round(cost*0.1) //부가가치세
                                val cost2=(cost*0.037)/10*10 //전력기반기금
                                var finalcost=(cost+cost1+cost2)/10*10

                                if(finalcost*0.3>16000)
                                    finalcost-=16000
                                else
                                    finalcost-=(finalcost*0.3)/10*10

                                elecresultTextView.text = finalcost.toString()
                            }
                            else
                            {
                                val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                                val cost1 =round(cost*0.1) //부가가치세
                                val cost2=(cost*0.037)/10*10 //전력기반기금
                                var finalcost=(cost+cost1+cost2)/10*10

                                if(finalcost*0.3>16000)
                                    finalcost-=16000
                                else
                                    finalcost-=(finalcost*0.3)/10*10

                                elecresultTextView.text = finalcost.toString()
                            }
                        }
                        else
                        {
                            if(elecuse<=200)
                            {
                                val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                                val cost1 =round(cost*0.1) //부가가치세
                                val cost2=(cost*0.037)/10*10 //전력기반기금
                                var finalcost=(cost+cost1+cost2)/10*10

                                if(finalcost*0.3>16000)
                                    finalcost-=16000
                                else
                                    finalcost-=(finalcost*0.3)/10*10

                                elecresultTextView.text = finalcost.toString()
                            }
                            else if(elecuse<=400)
                            {
                                val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                                val cost1 =round(cost*0.1) //부가가치세
                                val cost2=(cost*0.037)/10*10 //전력기반기금
                                var finalcost=(cost+cost1+cost2)/10*10

                                if(finalcost*0.3>16000)
                                    finalcost-=16000
                                else
                                    finalcost-=(finalcost*0.3)/10*10

                                elecresultTextView.text = finalcost.toString()
                            }
                            else
                            {
                                val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                                val cost1 =round(cost*0.1) //부가가치세
                                val cost2=(cost*0.037)/10*10 //전력기반기금
                                var finalcost=(cost+cost1+cost2)/10*10

                                if(finalcost*0.3>16000)
                                    finalcost-=16000
                                else
                                    finalcost-=(finalcost*0.3)/10*10

                                elecresultTextView.text = finalcost.toString()
                            }
                    }
                }
            else if(elecfamilyandwelfare.equals("생명유지장치") || elecfamilyandwelfare.equals("사회복지시설"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    }
            else if(elecfamilyandwelfare.equals("장애인") || elecfamilyandwelfare.equals("독립유공자") || elecfamilyandwelfare.equals("국가유공자") || elecfamilyandwelfare.equals("5.18민주유공자"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    }
            else if(elecfamilyandwelfare.equals("기초생활수급(생계,의료)"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>20000)
                                finalcost-=20000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>16000)
                                finalcost-=16000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    }
            else if(elecfamilyandwelfare.equals("기초생활수급(주거,교육)"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>12000)
                                finalcost-=12000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>12000)
                                finalcost-=12000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>12000)
                                finalcost-=12000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    }
            else if(elecfamilyandwelfare.equals("차상위계층"))
                {
                    if(elecsummer)
                    {
                        if(elecuse<=300)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=450)
                        {
                            val cost = 1260.0 + (300*105)+((elecuse-300)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (300*105)+(150*174)+((elecuse-450)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10


                            if(finalcost*0.3>10000)
                                finalcost-=10000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    else
                    {
                        if(elecuse<=200)
                        {
                            val cost = 730.0 + (elecuse*105)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>8000)
                                finalcost-=8000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else if(elecuse<=400)
                        {
                            val cost = 1260.0 + (200*105)+((elecuse-200)*174)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>8000)
                                finalcost-=8000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                        else
                        {
                            val cost = 6060.0 + (200*105)+(200*174)+((elecuse-400)*242.3)+(elecuse*9)+(elecuse*5)
                            val cost1 =round(cost*0.1) //부가가치세
                            val cost2=(cost*0.037)/10*10 //전력기반기금
                            var finalcost=(cost+cost1+cost2)/10*10

                            if(finalcost*0.3>8000)
                                finalcost-=8000
                            else
                                finalcost-=(finalcost*0.3)/10*10

                            elecresultTextView.text = finalcost.toString()
                        }
                    }
                    }
            }
        }
    }