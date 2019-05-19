package sample;

import java.util.ArrayList;
import java.util.List;

public class Question {
    String question;
    List<String> answers = new ArrayList<String>();
    private int correctAnswer;

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        if (correctAnswer < answers.size() && correctAnswer >=0)
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(int userAnswer){
        if (userAnswer == correctAnswer) {
            return true;
        }
        else
            return false;
    }
}
