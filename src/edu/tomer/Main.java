package edu.tomer;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Trivia> questions = QuestionsService.getQuestions();
        //Questions are now taken from the question service... (File reader)
        System.out.println(questions);

        game();

        Random r = new Random();
        int n = r.nextInt(10);//0-10 (Not including 10)
        System.out.println(n);



    }

    static void game() {
        ArrayList<Trivia> questions = QuestionsService.getQuestions();

        for (Trivia q : questions) {
            q.show();
            q.showAnswers();
            int userAns = IO.getInt("Whats your answer?");
            q.check(userAns);
        }


    }

    public static ArrayList<Trivia> getQuestions() {
        ArrayList<Trivia> questions = new ArrayList<Trivia>();



        Trivia q1 = new Trivia("Whose the president of the US?",
                new String[]{"Obama", "Clinton", "Bush", "Trump"}, "Trump");

        Trivia q2 = new Trivia("A + B ?",
                new String[]{"AB", "22", "1", "0"}, "AB");


        questions.add(q1);
        questions.add(q2);
        return questions;
    }

}
