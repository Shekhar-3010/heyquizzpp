package com.example.heyquizzpp

object  Constants{
    const val user_name : String="user_name"
    const val total_questions:String="total_questions"
    const val correctanswers: String="correctanswers"
    fun getquestions():ArrayList<Question>
    {
        val questionlist = ArrayList<Question>()
        val q1=Question(1,
            "which animal is this?",
            R.drawable.cat,
            "cat",
            "elephant ",
            "tiger",
            "bhalu",
            1
        )
        questionlist.add(q1)
        //2
        val q2=Question(2,
            "which animal is this?",
            R.drawable.elephant,
            "cat",
            "elephant ",
            "tiger",
            "bhalu",
            2
        )
        questionlist.add(q2)
        //3
        val q3=Question(3,
            "which animal is this?",
            R.drawable.tiger,
            "cat",
            "tiger ",
            "dog",
            "bhalu",
            2
        )
        questionlist.add(q3)
        //4
        val q4=Question(4,
            "which animal is this?",
            R.drawable.monkey,
            "cat",
            "tiger ",
            "dog",
            "monkey",
            4
        )
        questionlist.add(q4)
        //5
        val q5=Question(5,
            "which animal is this?",
            R.drawable.panda,
            "cat",
            "panda ",
            "moneky",
            "dog",
            2
        )
        questionlist.add(q5)
        //6
        val q6=Question(6,
            "which animal is this?",
            R.drawable.zebra,
            "cat",
            "tiger ",
            "zebra",
            "hiran",
            2
        )
        questionlist.add(q6)
        //7
        val q7=Question(7,
            "which animal is this?",
            R.drawable.lion,
            "leopard",
            "tiger ",
            "lion",
            "tendua",
            3
        )
        questionlist.add(q7)
        //8
        val q8=Question(8,
            "which animal is this?",
            R.drawable.girraf,
            "leopard",
            "printed dino ",
            "girraf",
            "tendua",
            3
        )
        questionlist.add(q8)
        //9
        val q9=Question(9,
            "which animal is this?",
            R.drawable.wolf,
            "leopard",
            "wolf ",
            "dog",
            "patla bhalu",
            2
        )

        questionlist.add(q9)
        val q10=Question(10,
            "which animal is this?",
            R.drawable.rhino,
            "leopard",
            "wolf ",
            "sheep",
            "rhino",
            4
        )

        questionlist.add(q10)




        return  questionlist
    }

}
