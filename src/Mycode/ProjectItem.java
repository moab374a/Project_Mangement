package Mycode;

public abstract class ProjectItem {
    private final String name;
    private String details;
    private final double rate;

    public ProjectItem(String name, String details, double rate) {

        if (name == "" || details == "" || rate < 0) {
            throw new IllegalArgumentException("");
        }
        if (name == null || details == null) {
            throw new NullPointerException("");
        }

        this.name = name;
        this.details = details;
        this.rate = rate;
    }


    public void setDetails(String newDetails) {
        this.details = newDetails;
    }

    public abstract double getTimeRequired();

    public abstract long getMaterialCost();

    public long getCostEstimate() {
        return Math.round(rate * getTimeRequired() + getMaterialCost());
    }


}
