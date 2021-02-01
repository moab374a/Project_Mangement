package Mycode;


import java.time.LocalDate;

public class Deliverable extends ProjectItem {

    private long materialCost;
    private double productionTime;
    private LocalDate date;


    public Deliverable(String name, String details, double rate , long materialCost , double productionTime , LocalDate date) {
        super(name, details, rate);

        this.materialCost = materialCost;
        this.productionTime = productionTime;
        this.date = date;

        if (date == null)
        {
            throw new NullPointerException("");
        }
        if (materialCost < 0 || productionTime <= 0   )
        {
            throw new IllegalArgumentException("");
        }


    }

    public LocalDate getDate()
    {
        return date;
    }

    @Override
    public double getTimeRequired() {
        return productionTime;
    }

    @Override
    public long getMaterialCost() {
        return materialCost;
    }


}