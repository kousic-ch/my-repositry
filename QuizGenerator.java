import java.util.ArrayList;
import java.util.Scanner;
public class QuizGenerator {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("5");
        options1.add("6");
        options1.add("4");
        options1.add("1");
        Question question1 = new Question("What is 2 + 2?", options1, 3);
        questions.add(question1);
        ArrayList<String> options2 = new ArrayList<>();
        options2.add("Paris");
        options2.add("Italy ");
        options2.add("Rome");
        options2.add("Hong kong");
        Question question2 = new Question("What is the capital of France?", options2, 1);
        questions.add(question2);
        ArrayList<String> options3 = new ArrayList<>();
        options3.add("Ap");
        options3.add("Assam");
        options3.add("Delhi");
        options3.add("Goa");
        Question question3 = new Question("What is the capital of India", options3, 3);
        questions.add(question3);

        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
    }

}


		