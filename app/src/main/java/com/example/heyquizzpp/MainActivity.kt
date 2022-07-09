package com.example.heyquizzpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main)
            buttonstart.setOnClickListener {
                if(et_text.text.toString().isEmpty() )
                {
                    Toast.makeText(this, "please entre your a name ",Toast.LENGTH_SHORT).show()
                }else
                {
                    val intent= Intent(this,quizquestionactivity::class.java)
                    intent.putExtra(Constants.user_name,et_text.text.toString())
                    startActivity(intent)
                    finish()
                }
            }
    }
}