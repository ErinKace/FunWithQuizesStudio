import java.util.Scanner;
public class TrueFalse extends Question {
    private boolean booleanCorrectAnswer;
    private boolean actualAnswer;
    public TrueFalse(String question, int totalPossiblePoints, boolean correctAnswer) {
        super(question, totalPossiblePoints);
        this.booleanCorrectAnswer = correctAnswer;
    }

    protected boolean isBooleanCorrectAnswer() {
        return booleanCorrectAnswer;
    }

    public boolean isActualAnswer() {
        return actualAnswer;
    }

    public void setActualAnswer(boolean actualAnswer) {
        this.actualAnswer = actualAnswer;
    }
    public void displayPossibleAnswers() {
        System.out.println("Enter 't' for True, or 'f' for False");
    }
    public void getAnswer() {
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("t")) {
            actualAnswer = true;
        } else if (answer.toLowerCase().equals("f")){
            actualAnswer = false;
        }
        input.close();
    }
    public void gradeQuestion() {
        if (actualAnswer == booleanCorrectAnswer) {
            setActualPoints(getTotalPossiblePoints());
        }
    }
}
