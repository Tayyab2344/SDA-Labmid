class InterviewFilter implements Filter {
    @Override
    public void execute(Student student) {
        if (student.isTestPassed && student.interviewScore >= 60) {
            student.isInterviewPassed = true;
            student.isEligibleForNextStep = true;
            System.out.println(student.name + " passed the interview.");
        } else {
            student.isEligibleForNextStep = false;
            System.out.println(student.name + " failed the interview.");
        }
    }
}
