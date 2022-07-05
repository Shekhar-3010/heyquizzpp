package com.example.heyquizzpp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quizquestionactivity.*

class quizquestionactivity : AppCompatActivity() ,View.OnClickListener{
    private var mcurrentposition:Int=1//position of first question
    private var mquestionlist : ArrayList<Question>?=null
    private var mselectedoptionposition:Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestionactivity)
        mquestionlist=Constants.getquestions()
        setquestion()
        optionone.setOnClickListener(this)
        optionone.setOnClickListener(this)
        optionone.setOnClickListener(this)
        optionone.setOnClickListener(this)
        submitbutton.setOnClickListener(this)



    }
    override fun onClick(v: View?) {
        when (v?.id)
        {
            R.id.optionone -> {

                selectedoptionview(optionone, 1)
            }

            R.id.optiontwo -> {

                selectedoptionview(optiontwo, 2)
            }

            R.id.optionthree -> {

                selectedoptionview(optionthree, 3)
            }

            R.id.optionfour -> {

                selectedoptionview(optionfour, 4)
            }

            R.id.submitbutton->{
                if(mselectedoptionposition==0)
                {
                    mcurrentposition++
                    when{
                        mcurrentposition<=mquestionlist!!.size->
                        {
                            setquestion()
                        }else ->
                    {
                        Toast.makeText(this , "you have sucessfully completed the quiz ",Toast.LENGTH_SHORT).show()
                    }


                    }

                }else{
                    val question=mquestionlist?.get(mcurrentposition-1)
                    if(question!!.correctanswer!=mselectedoptionposition){
                        answerview(mselectedoptionposition,R.drawable.worngoptionbg)
                    }
                    answerview(question.correctanswer,R.drawable.correctoptionbg)
                    if(mcurrentposition==mquestionlist!!    .size)
                    {
                        submitbutton.text="Finish"

                    }else {
                        submitbutton.text="GO TO NExT Question"
                    }
                    mselectedoptionposition=0
                }
            }
        }
    }
    private  fun setquestion(){
       // val mcurretposition=1;
        val question=mquestionlist!!.get(mcurrentposition-1)
        defualtoptionview()
        if(mcurrentposition==mquestionlist?.size)
        {
            submitbutton.text="FINISH"
        }
        else {
            submitbutton.text="SUBMIT"
        }
      //  val question=mquestionlist!!.get(mcurrentposition-1)
        progressBar.progress=mcurrentposition
        tv_progress.text="$mcurrentposition"+"/"+progressBar.getMax()
        tvquestion.text=question.question
        iv_image.setImageResource(question.image)
        optionone.text=question.optionone
        optiontwo.text=question.optiontwo
        optionthree.text=question.optionthree
        optionfour.text=question.optionfour

    }
    private  fun selectedoptionview(tv:TextView,selectedoptionnumber :Int )
    {
        defualtoptionview()
        mselectedoptionposition=selectedoptionnumber
        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface,Typeface.BOLD)

        tv.background=ContextCompat.getDrawable(
            this ,
            R.drawable.selectedoptionboredr
        )

    }
    private  fun defualtoptionview()
    {
        val options = ArrayList<TextView>()
        options.add(0,optionone)
        options.add(1,optiontwo)
        options.add(2,optionthree)
        options.add(3,optionfour)
        for(options in options)
        {
            options.setTextColor(Color.parseColor("#787089"))
            options.typeface= Typeface.DEFAULT
            options.background=ContextCompat.getDrawable(this   ,R.drawable.tvoptionbg)
        }



    }


    private fun answerview(answer : Int , drawableView :Int )

    {
        when(answer) {
            1 -> {
                optionone.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                optiontwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                optionthree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                optionfour.background = ContextCompat.getDrawable(this, drawableView)
            }


        }
    }





}