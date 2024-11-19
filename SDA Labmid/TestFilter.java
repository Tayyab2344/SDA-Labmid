class TestFilter implements Filter {
    @Override
    public void execute(Student student) {
        if (student.testScore >= 60) {
            student.isTestPassed = true;
            student.isEligibleForNextStep = true;
            System.out.println(student.name + " passed the test.");
        } else {
            student.isEligibleForNextStep = false;
            System.out.println(student.name + " failed the test.");
        }
    }
}
