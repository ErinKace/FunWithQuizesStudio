import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        // Define Quizzes
        Quiz testQuiz = new Quiz(new ArrayList<>());
        Quiz fullQuiz = new Quiz(new ArrayList<>());
        // Define Questions and Choices
        Question favoriteColorQuestion = new TrueFalse("Erin's favorite color is blue. True or False?",1,true);
        String[] nameOfDogChoices = {"Sammy","Petey","Kylo","Mina"};
        Question nameOfDogQuestion = new MultipleChoice("What is the name of Erin's dog?", 2, nameOfDogChoices,"Kylo");
        String[] favoriteFoodChoices = {"Chocolate","Pineapple","Sharp Cheddar Cheese","Mushrooms"};
        ArrayList<String> correctFavoriteFoods = new ArrayList<>(Arrays.asList("Chocolate","Sharp Cheddar Cheese"));
        Question favoriteFoodsQuestion = new Checkbox("What foods does Erin love? You can choose more than one.", favoriteFoodChoices,correctFavoriteFoods);
        // Add questions to quizzes
        testQuiz.addQuestion(favoriteColorQuestion);
        fullQuiz.addQuestion(favoriteColorQuestion);
        fullQuiz.addQuestion(nameOfDogQuestion);
        fullQuiz.addQuestion(favoriteFoodsQuestion);
        // Run Quizzes
//        testQuiz.runQuiz();
//        testQuiz.printQuizResults();
        fullQuiz.runQuiz();
        fullQuiz.printQuizResults();
    }
}
