class FeeSubmissionFilter implements Filter {
    @Override
    public void execute(Student student) {
        if (student.isInterviewPassed) {
            student.hasSubmittedFee = true;
            student.isEligibleForNextStep = true;
            System.out.println(student.name + " is notified to submit the fee.");
        }
    }
}
