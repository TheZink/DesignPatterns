import java.util.*;

public class Organization extends Component {

    private List<Component> department = new ArrayList<>();

    public Organization(String name){
        super(name);
    }

    @Override
    public void add(Component component){
        this.department.add(component);
    };

    @Override
    public void remove(Component component){
        this.department.remove(component);
    };

    // Collect data for XML
    @Override
    public String printXml(){
        StringBuilder xml = new StringBuilder();

        xml.append("<Organization name=\"").append(name).append("\">\n");

        for (Component employee : this.department){
            xml.append(" " + employee.printXml());
        }

        xml.append("</Organization").append(">\n");

        return xml.toString();
    };

    @Override
    public Component getChild(int index){
        return this.department.get(index);
    };

}
