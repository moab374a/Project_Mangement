package Mycode;

import java.util.ArrayList;
import java.util.List;

public class Task extends ProjectItem {

    private List<ProjectItem> projectItems = new ArrayList<>();


    public Task(String name, String description) {
        super(name, description);

    }

    public double getTimeRequired() {
        double totalTimeRequired = 0;
        for(ProjectItem pi : projectItems) {
            totalTimeRequired = totalTimeRequired;
        }

        return totalTimeRequired;

    }


    public void addProjectItem(ProjectItem pi){
        if(pi == null) throw new NullPointerException();
        List<Deliverable> myList;
        if(pi instanceof Deliverable) {
            this.projectItems.add(pi);
        }
    }

    public void removeProjectItem(ProjectItem pi){
        if(pi == null) throw new NullPointerException();
        this.projectItems.remove(pi);
    }



}