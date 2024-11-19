import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AdmissionService admissionService = new AdmissionService();
        NotificationService notificationService = new NotificationService();
        admissionService.addObserver(notificationService);

        List<Student> students = Arrays.asList(
            new Student("Tayyab", 80, 90),  
            new Student("Abdullah", 50, 70),   
            new Student("Asif", 85, 40), 
            new Student("Sara", 45, 60)  
        );

        for (Student student : students) {
            admissionService.processStudent(student);
        }
    }
}
