package com.example.studybuddy

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnGradeCalculator =
            findViewById<Button>(R.id.btnGradeCalculator)

        val btnStudyPlanner =
            findViewById<Button>(R.id.btnStudyPlanner)

        btnGradeCalculator.setOnClickListener {

            val intent = Intent(
                this,
                GradeCalculatorActivity::class.java
            )

            startActivity(intent)
        }

        btnStudyPlanner.setOnClickListener {

            val intent = Intent(
                this,
                StudyPlannerActivity::class.java
            )

            startActivity(intent)
        }
    }
}