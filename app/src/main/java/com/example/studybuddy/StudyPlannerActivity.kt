package com.example.studybuddy

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class StudyPlannerActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_study_planner)

        val subjectsInput =
            findViewById<EditText>(R.id.etSubjects)

        val hoursInput =
            findViewById<EditText>(R.id.etHours)

        val createPlanButton =
            findViewById<Button>(R.id.btnCreatePlan)

        val resultText =
            findViewById<TextView>(R.id.tvPlanResult)

        createPlanButton.setOnClickListener {

            val subjects =
                subjectsInput.text.toString().toIntOrNull()

            val hours =
                hoursInput.text.toString().toDoubleOrNull()

            if (
                subjects == null ||
                hours == null ||
                subjects <= 0 ||
                hours <= 0
            ) {

                resultText.text =
                    "Please enter valid values."

            } else {

                val totalMinutes =
                    hours * 60

                val minutesPerSubject =
                    totalMinutes / subjects

                resultText.text =
                    "Study approximately %.0f minutes per subject."
                        .format(minutesPerSubject)
            }
        }
    }
}