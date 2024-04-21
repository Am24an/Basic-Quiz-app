package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>
    {
        val questionsList = ArrayList<Question>()
        //1
        val que1 = Question(
            1, "Which country does this flag belongs to?",
            R.drawable.flag_of_russia_flat_square,
            "Romania","Scotland",
            "Russia","Australia",
            3
        )
       questionsList.add(que1)

       //2
        val que2 = Question(
            2, "Which country does this flag belongs to?",
            R.drawable.flag_of_bulgaria_flat_square,
            "Bulgaria","Canada",
            "Scotland","Poland",
            1
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3, "Which country does this flag belongs to?",
            R.drawable.flag_of_gabon_flat_square,
            "Hong kong","Gabon",
            "Egypt","Austria",
            2
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4, "Which country does this flag belongs to?",
            R.drawable.flag_of_romania_flat_square,
            "Romania","Canada",
            "Denmark","Bahrain",
            1
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5, "Which country does this flag belongs to?",
            R.drawable.flag_of_australia_flat_square,
            "France","Australia",
            "Iceland","New Zealand",
            2
        )
        questionsList.add(que5)

        //6

        val que6 = Question(
            6, "Which country does this flag belongs to?",
            R.drawable.flag_of_mauritius_flat_square,
            "Bahrain","Israel",
            "Egypt","Mauritius",
            4
        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7, "Which country does this flag belongs to?",
            R.drawable.flag_of_finland,
            "Canada","Austria",
            "Finland","Kenya",
            3
        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8, "Which country does this flag belongs to?",
            R.drawable.flag_of_scotland,
            "Nicaragua","Austria",
            "Scotland","Philippines",
            3
        )
        questionsList.add(que8)

        //9
        val que9 = Question(
            9, "Which country does this flag belongs to?",
            R.drawable.flag_of_hong_kong_flat_square,
            "Poland","Romania",
            "Bulgaria","Hong Kong",
            4
        )
        questionsList.add(que9)

        //10
        val que10 = Question(
            10, "Which country does this flag belongs to?",
            R.drawable.flag_of_egypt_flat_square,
            "Egypt","Denmark",
            "Wakanda","Chile",
            1
        )
        questionsList.add(que10)

        return questionsList
    }
}