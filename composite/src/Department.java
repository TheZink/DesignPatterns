import java.util.*;

public class Department extends Component {

    private List<Component> department = new ArrayList<>();
    private StringBuilder xml = new StringBuilder();

    public Department(String name){
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

    // Handle Department employees and save to the XML
    @Override
    public String printXml(){

        // Opening tag
        xml.append(" <Department name=\"").append(name).append("\">\n");

        for (Component employee : department) {
            xml.append(employee.printXml());
        }

        // Closing tag
        xml.append(" </Department>\n");

        return xml.toString();
    }

    public Component getChild(int inderx){
        throw new UnsupportedOperationException("Error");
    }
}
