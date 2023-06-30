import java.util.Scanner;
import java.util.ArrayList;
public class Checkbox extends Question {
    private String[] possibleAnswers;
    private ArrayList<String> correctAnswers;
    private ArrayList<String> actualAnswers;
    public Checkbox(String question, String[] possibleAnswers, ArrayList<String> correctAnswers) {
        super(question, correctAnswers.size());
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList<String> getActualAnswers() {
        return actualAnswers;
    }
    public void displayPossibleAnswers() {
        int i =1;
       for (String choice : possibleAnswers) {
           System.out.println(i+". "+choice);
           i++;
       }
    }
    public void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiple Answers may be correct. Enter the number of each choice you think is right. Then enter 'c' to continue.");
        for (int i=0; i < possibleAnswers.length; i++) {
            String answer = input.nextLine();
            if (answer.equals("c")) {
                break;
            }
            int intAnswer = Integer.parseInt(answer);
            String actualAnswer = possibleAnswers[intAnswer-1];
            actualAnswers.add(actualAnswer);
        }
    }
    public void gradeQuestion() {
        for (String answer : actualAnswers) {
            if (correctAnswers.contains(answer)) {
                setActualPoints(getActualPoints()+1);
            }
        }
    }
}
