package Mycode;

public class Deliverable extends ProjectItem {

  private double timeRequired;


    public Deliverable(String name, String description , double timeRequired ) {
        super(name, description);
        this.timeRequired = timeRequired

    }

    public double getTimeRequired() {
        return timeRequired;
    }

}
