import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> questionList;

    int totalPossiblePoints;
    int actualTotalPoints;
    public Quiz(ArrayList<Question> questionList) {
        this.questionList = questionList;
        for (Question question : questionList) {
            this.totalPossiblePoints+=question.getTotalPossiblePoints();
        }
    }

    public int getTotalPossiblePoints() {
        return totalPossiblePoints;
    }

    public int getActualTotalPoints() {
        return actualTotalPoints;
    }

    public void addQuestion(Question newQuestion) {
        questionList.add(newQuestion);
        this.totalPossiblePoints+=newQuestion.getTotalPossiblePoints();
    }
    public void runQuiz() {
        for (Question question : questionList) {
            question.displayQuestion();
            question.displayPossibleAnswers();
            question.getAnswer();
            question.gradeQuestion();
            actualTotalPoints+=question.getActualPoints();
        }
    }
    public double calculateScore() {
        return actualTotalPoints/totalPossiblePoints;
    }
    public void printQuizResults() {
        System.out.println("You scored: "+calculateScore());
        System.out.println(actualTotalPoints+"/"+totalPossiblePoints);
        System.out.println();
    }
}
