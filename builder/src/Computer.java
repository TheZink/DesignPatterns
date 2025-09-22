import java.util.List;
import java.util.ArrayList;

public class Computer {

    private List<Component> components;

    public Computer(){
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component){
        components.add(component);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Component component : components){
            sb.append(component.getName());
        }

        return sb.toString();
    }

}
