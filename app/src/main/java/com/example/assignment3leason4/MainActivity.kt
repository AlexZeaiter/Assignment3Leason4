package com.example.assignment3leason4

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun addAndroidVersion(view: View){
        val tl = findViewById<View>(R.id.androidTypesTable) as TableLayout

        val aVersionText = aVersion.text.toString()
        val aCodeNameText = aCodeName.text.toString()

        val tvVersionText = TextView(this)
        val tvCodeNameText = TextView(this)
        tvVersionText.text = aVersionText
        tvCodeNameText.text = aCodeNameText

        val tvParams1: ViewGroup.LayoutParams = firstColumn.layoutParams
        val tvParams2: ViewGroup.LayoutParams = secondColumn.layoutParams
        tvVersionText.layoutParams = tvParams1
        tvCodeNameText.layoutParams = tvParams2

        tvVersionText.textAlignment = View.TEXT_ALIGNMENT_CENTER
        tvCodeNameText.textAlignment = View.TEXT_ALIGNMENT_CENTER
        // Create a new table row.
        val tableRow = TableRow(applicationContext) // this
        val rowParams: ViewGroup.LayoutParams = headerRow.layoutParams
        tableRow.layoutParams = rowParams
        tableRow.addView(tvVersionText)
        tableRow.addView(tvCodeNameText)
        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams
        // add values into row by calling addView()
        tl.addView(tableRow)
    }
}