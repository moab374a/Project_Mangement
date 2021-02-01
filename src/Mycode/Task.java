package Mycode;

import java.util.ArrayList;
import java.util.List;

public class Task extends ProjectItem {

    private List<ProjectItem> projectItems = new ArrayList<>();




    public Task(String name, String details, double rate) {
        super(name, details, rate);

    }

    public double getTimeRequired() {
        double totalTimeRequired = 0;
        for(ProjectItem pi : projectItems) {
            totalTimeRequired = totalTimeRequired + pi.getTimeRequired();
        }



        return totalTimeRequired;

    }

    public long getMaterialCost() {
        long totalMaterialCost = 0;
        for(ProjectItem pi : projectItems) {
            totalMaterialCost = totalMaterialCost + pi.getMaterialCost();
        }
        return totalMaterialCost;
    }

    public void addProjectItem(ProjectItem pi){
        if(pi == null) throw new NullPointerException();
        List<Deliverable> myList;
        if(pi instanceof Deliverable) {
            this.projectItems.add(pi);

        } else if(pi instanceof Task) {
            myList = ((Task) pi).allDeliverables();
            for(Deliverable d : myList) {
                this.addProjectItem(d);
            }
        }
    }

    public void removeProjectItem(ProjectItem pi){
        if(pi == null) throw new NullPointerException();
        this.projectItems.remove(pi);
    }

    public List<Deliverable> allDeliverables() {
        List<Deliverable> myList = new ArrayList<>();
        for (int i = 0; i < projectItems.size() ; i++)
        {
            if (projectItems.get(i) instanceof Deliverable)
            {
                myList.add((Deliverable) projectItems.get(i));
            }
        }

        return myList;

    }


}