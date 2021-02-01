package Mycode;
import java.util.List;

public class Adapter implements IProject{

    private Task mainTask;



    public Adapter(String test_adapter, String s, double v) {
        if (test_adapter == null || s == null ) throw new NullPointerException();
        if (s == "" || test_adapter == "" || v < 0)throw new IllegalArgumentException();

    }

    @Override
    public void setTask(Task newTask) {
        if(newTask == null){throw new NullPointerException();}
        this.mainTask = newTask;
    }

    @Override
    public double getDuration() {

        return mainTask.getTimeRequired() ;
    }

    @Override
    public long getTotalCost() {
        return mainTask.getCostEstimate();
    }

    @Override
    public List<Deliverable> getDeliverables() {

        return mainTask.allDeliverables();
    }
}
