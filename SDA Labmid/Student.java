class Student {
    String name;
    int testScore;
    int interviewScore;
    boolean isTestPassed;
    boolean isInterviewPassed;
    boolean hasSubmittedFee;
    boolean isEligibleForNextStep;

    public Student(String name, int testScore, int interviewScore) {
        this.name = name;
        this.testScore = testScore;
        this.interviewScore = interviewScore;
        this.isTestPassed = false;
        this.isInterviewPassed = false;
        this.hasSubmittedFee = false;
        this.isEligibleForNextStep = false;
    }
}
