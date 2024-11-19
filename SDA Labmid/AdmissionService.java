import java.util.ArrayList;
import java.util.List;

class AdmissionService implements Subject {
    private List<Observer> observers;

    public AdmissionService() {
        this.observers = new ArrayList<>();
    }

    public void processStudent(Student student) {
        Pipeline pipeline = new Pipeline();
        pipeline.addFilter(new TestFilter());
        pipeline.addFilter(new InterviewFilter());
        pipeline.addFilter(new FeeSubmissionFilter());

        pipeline.execute(student);
        notifyObservers(student);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Student student) {
        for (Observer observer : observers) {
            observer.update(student);
        }
    }
}
