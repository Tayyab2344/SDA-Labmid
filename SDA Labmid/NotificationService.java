class NotificationService implements Observer {
    @Override
    public void update(Student student) {
        if (student.isTestPassed && !student.isInterviewPassed) {
            System.out.println("Notification: " + student.name + " is invited for an interview.");
        } else if (student.isInterviewPassed && !student.hasSubmittedFee) {
            System.out.println("Notification: " + student.name + " is asked to submit the fee.");
        } else if (student.hasSubmittedFee) {
            System.out.println("Notification: " + student.name + " has successfully completed the admission process.");
        } else {
            System.out.println("Notification: " + student.name + " has been rejected.");
        }
    }
}
