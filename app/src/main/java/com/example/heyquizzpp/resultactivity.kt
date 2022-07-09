package com.example.heyquizzpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultactivity.*

class resultactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultactivity)
        val unsername=intent.getStringExtra(Constants.user_name)
        tv_unsername.text=unsername
        val totalquestion=intent.getIntExtra(Constants.total_questions,0)
        val correctans=intent.getIntExtra(Constants.correctanswers,0)
        tv_score.text="Your score is $correctans out of $totalquestion"
        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }



    }
}