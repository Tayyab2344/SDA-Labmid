# Student Admission Process System

## Project Overview:
This project simulates a student admission process using the **Observer Pattern** and **Chain of Responsibility Pattern**. It processes students through a series of filters (Test, Interview, Fee Submission) and notifies relevant observers about the student's progress (such as the Notification Service).

## Technologies Used:
- Java
- Observer Design Pattern
- Chain of Responsibility Design Pattern

## System Components:
1. **Student Class**:
   - Represents a student with attributes like name, test score, interview score, and flags indicating if they passed each step (test, interview, fee submission).

2. **AdmissionService (Subject)**:
   - Manages the student admission process and notifies observers about student progress after processing.

3. **NotificationService (Observer)**:
   - Listens for updates on student status and sends notifications about the student's progress, such as whether they passed or failed at each stage.

4. **Pipeline**:
   - A sequence of filters that each student goes through to check their eligibility for each stage of the admission process.

5. **Filters**:
   - `TestFilter`: Evaluates if the student passed the test based on their score.
   - `InterviewFilter`: Evaluates if the student passed the interview based on their interview score.
   - `FeeSubmissionFilter`: Ensures the student has submitted their fees if they passed the interview.

## Classes:

### 1. **Student Class**:
   - `String name`: The name of the student.
   - `int testScore`: The student's score in the test.
   - `int interviewScore`: The student's score in the interview.
   - `boolean isTestPassed`: If the student passed the test.
   - `boolean isInterviewPassed`: If the student passed the interview.
   - `boolean hasSubmittedFee`: If the student has submitted the required fee.
   - `boolean isEligibleForNextStep`: Indicates if the student is eligible to proceed to the next step.

### 2. **AdmissionService Class (Subject)**:
   - Manages the student admission process and maintains a list of observers.
   - `void processStudent(Student student)`: Processes a student through a pipeline of filters and notifies observers.
   - `void addObserver(Observer observer)`: Adds an observer to the list.
   - `void removeObserver(Observer observer)`: Removes an observer.
   - `void notifyObservers(Student student)`: Notifies all observers after the student has been processed.

### 3. **NotificationService Class (Observer)**:
   - Listens for updates on student status and sends notifications.
   - `void update(Student student)`: Called when a student’s admission status changes.

### 4. **Pipeline Class**:
   - Manages the sequence of filters and ensures the student goes through the process step-by-step.
   - `void addFilter(Filter filter)`: Adds a filter to the pipeline.
   - `void execute(Student student)`: Executes each filter on the student.

### 5. **Filter Interface**:
   - `void execute(Student student)`: Defines the method that each filter must implement to process a student.

### 6. **TestFilter Class**:
   - `void execute(Student student)`: Checks if the student passed the test based on their score and updates their status accordingly.

### 7. **InterviewFilter Class**:
   - `void execute(Student student)`: Checks if the student passed the interview based on their interview score and updates their status accordingly.

### 8. **FeeSubmissionFilter Class**:
   - `void execute(Student student)`: Ensures the student has submitted the fee after passing the interview.

## How to Run:
1. Clone the repository.
2. Compile and run the `Main` class.
3. The system will process a list of students and notify the observers with their status after each step.

### Example Output:
```java
Tayyab passed the test.
Tayyab passed the interview.
Tayyab has been asked to submit the fee.
Notification: Tayyab is invited for an interview.
Notification: Tayyab is asked to submit the fee.
Notification: Tayyab has successfully completed the admission process.
Abdullah failed the test.
Notification: Abdullah has been rejected.
Asif passed the test.
Asif failed the interview.
Notification: Asif has been rejected.
Sara failed the test.
Notification: Sara has been rejected.
