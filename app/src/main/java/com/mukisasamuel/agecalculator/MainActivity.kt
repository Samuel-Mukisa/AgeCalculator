package com.mukisasamuel.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BUClickevent(view: View){
        val DOB = findViewById<EditText>(R.id.etDOB)
        val SHOWAGE = findViewById<TextView>(R.id.tvshowage)
        val userDOB:String=DOB.text.toString()
        // Putting Converting int to String
        if(userDOB.toInt() == 0){
            SHOWAGE.text = "Invalid input"
            return
        }
        val year :Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        SHOWAGE.text = "Your age is $myAge"
    }
}