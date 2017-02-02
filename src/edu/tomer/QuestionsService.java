package edu.tomer;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by hackeru on 02/02/2017.
 */
public class QuestionsService {


    public class JsonTrivia {
        public String question;
        public String answer;
        public String A;
        public String B;
        public String C;
        public String D;
    }


    public static ArrayList<Trivia> getQuestions() {
        ArrayList<Trivia> triviaQuestions = new ArrayList<>();
        try {
            Gson gson = new Gson();

            FileReader reader = new FileReader("C:\\Users\\hackeru\\Documents\\Tomer\\src\\edu\\tomer\\json.json");
            ArrayList<JsonTrivia> jsonQuestions = gson.fromJson(reader, new ArrayList<JsonTrivia>().getClass());

            for (int i = 0; i < jsonQuestions.size(); i++) {
                JsonTrivia jQuestion = jsonQuestions.get(i);
                String question = jQuestion.question;
                String[] answers = new String[]{jQuestion.A, jQuestion.B, jQuestion.C, jQuestion.D};
                Trivia trivia = new Trivia(question, answers, jQuestion.answer);
                triviaQuestions.add(trivia);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return triviaQuestions;
    }
}
