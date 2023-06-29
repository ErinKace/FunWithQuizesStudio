public abstract class Question {
    private String question;
    private String correctAnswer;
    private int totalPossiblePoints;
    private int actualPoints = 0;
    public Question(String question, int totalPossiblePoints) {
        this.question = question;
        this.totalPossiblePoints = totalPossiblePoints;
    }
    public void displayQuestion() {
        System.out.println(question);
    }

    protected String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getTotalPossiblePoints() {
        return totalPossiblePoints;
    }

    public int getActualPoints() {
        return actualPoints;
    }
    public void setActualPoints(int newActualPoints) {
        actualPoints = newActualPoints;
    }

    public abstract void displayPossibleAnswers();
    public abstract void getAnswer();
    public abstract void gradeQuestion();
}
