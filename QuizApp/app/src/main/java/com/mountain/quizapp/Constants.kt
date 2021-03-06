package com.mountain.quizapp

object Constants {   // object는 객체 생성 과정을 생략하고 곧바로 사용할 수 있는 클래스와 비슷한 개념

    const val USER_NAME: String = "user name"   // 직접 스트링을 하드코딩하기보다, 이름으로 사용될 string을 변수화한다.
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
            R.drawable.flag_southkorea, "Argentina", "United States",
            "France", "Korea", 4)

        val que2 = Question(2, "Who is he?",
            R.drawable.char_obama, "george w bush", "barack obama",
            "mahatma gandhi", "george washington", 2)

        val que3 = Question(3, "What animal in this image?", R.drawable.animal_dog,
            "Dog", "Cat", "Bird", "Dolphin", 1)

        questionList.add(que1)   // TODO: 어떻게 줄일 수 있는지?
        questionList.add(que2)
        questionList.add(que3)

        return questionList
    }
}
