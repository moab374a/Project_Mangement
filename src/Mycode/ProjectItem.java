package Mycode;
import java.util.Map;

public abstract class ProjectItem {
    private final String name;
    private String description;


    public ProjectItem(String name, String description) {

        if (name == "" || description == "" ) {
            throw new IllegalArgumentException("");
        }
        if (name == null || description == null) {
            throw new NullPointerException("");
        }

        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}


