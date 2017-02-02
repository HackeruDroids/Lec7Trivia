package edu.tomer;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by hackeru on 02/02/2017.
 */
public class QuestionsService {


    public class Q {
        public String question;
        public String answer;
        public String A;
        public String B;
        public String C;
        public String D;
    }


    public static ArrayList<Q> getQuestions() {
        try {
            Gson gson = new Gson();

            FileReader reader = new FileReader("C:\\Users\\hackeru\\Documents\\Tomer\\src\\edu\\tomer\\json.json");

            return gson.fromJson(reader, new ArrayList<Q>().getClass());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }
}
