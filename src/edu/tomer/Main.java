package edu.tomer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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

        Trivia q1 = new Trivia("1 + 1 ?",
                new String[]{"2", "11", "1", "0"}, "2");

        Trivia q2 = new Trivia("Whose the president of the US?",
                new String[]{"Obama", "Clinton", "Bush", "Trump"}, "Trump");

        questions.add(q1);
        questions.add(q2);
        return questions;
    }

}
