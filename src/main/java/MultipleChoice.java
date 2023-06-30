import java.util.Scanner;

public class MultipleChoice extends Question {
    private String[] possibleAnswers;
    private String correctAnswer;
    private String actualAnswer;

    public MultipleChoice(String question, int totalPossiblePoints, String[] possibleAnswers, String correctAnswer) {
        super(question, totalPossiblePoints);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getActualAnswer() {
        return actualAnswer;
    }

    public void displayPossibleAnswers() {
        int i=1;
        for (String choice : possibleAnswers) {
            System.out.println(i+". "+choice);
            i++;
        }
    }

    public void getAnswer() {
        System.out.println("Enter 1 for choice 1, 2 for choice 2, etc. Enter answer: \n");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        int intAnswer = Integer.parseInt(answer);
        actualAnswer = possibleAnswers[intAnswer-1];
    }
    public void gradeQuestion() {
        if (actualAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
            setActualPoints(getTotalPossiblePoints());
        }
    }
}
