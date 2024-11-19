import java.util.ArrayList;
import java.util.List;

class Pipeline {
    private List<Filter> filters;

    public Pipeline() {
        this.filters = new ArrayList<>();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(Student student) {
        for (Filter filter : filters) {
            filter.execute(student);
            if (!student.isEligibleForNextStep) {
                break;
            }
        }
    }
}
