package Mycode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
    private String name;
    private String description;
    private Task mainTask;

    public Project(String name , String description , double rate)
    {
        if (name == "" || description == "" || rate < 0)
        {
            throw new IllegalArgumentException("");

        }
        if (name == null || description == null)
        throw new NullPointerException("");


        this.name = name;
        this.description = description;

    }

    public String getName(){ return name; }

    public String getDescription() { return description; }

    public void setTask(Task newTask){
        if (newTask == null)
        {
            throw new NullPointerException("");
        }
        this.mainTask = newTask;
    };

    public double getDuration()
    { return mainTask.getTimeRequired();};

    public long getTotalCost()
    {
        return mainTask.getCostEstimate();
    };

    public Map<LocalDate, List<Deliverable>> allDeliverables(){
        List<Deliverable> myList = new ArrayList<>(mainTask.allDeliverables());

        Map<LocalDate, List<Deliverable>> deliveables = new HashMap<>();

        for (Deliverable deliverable : myList) {

        if (deliveables.containsKey(deliverable.getDate())) {
            List<Deliverable> valueList = new ArrayList<>(deliveables.get(deliverable.getDate()));
            valueList.add(deliverable);
            deliveables.replace(deliverable.getDate(), valueList);

        } else {
            List<Deliverable> valueList = new ArrayList<>();
            valueList.add(deliverable);
            deliveables.put(deliverable.getDate(), valueList);
        }
    }

        return deliveables;
}


}
