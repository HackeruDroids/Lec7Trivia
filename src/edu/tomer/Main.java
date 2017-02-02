package edu.tomer;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int n = r.nextInt(10);//0-10 (Not including 10)
        System.out.println(n);
    }

    void game() {
        ArrayList<Trivia> questions = getQuestions();

        for (int i = 0; i < questions.size(); i++) {
            Trivia q = questions.get(i);
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
