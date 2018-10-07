package com.lenghel.michael.tipcalc

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //window.decorView.setBackgroundColor(Color.RED)

        //Make text disappear as soon as app opens
        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tip_percentage = tipPercentageEditText.text.toString().toDouble()
            val tip = (bill * tip_percentage) / 100
            val total = bill + tip

            infoTextView.text = "Tip: ${doubleToEuro(tip)} Total: ${doubleToEuro(total)}"
            infoTextView.visibility = View.VISIBLE
        }
    }
    fun doubleToEuro(number:Double) : String {
        return "€" + String.format("%.2f", number)
    }
}
