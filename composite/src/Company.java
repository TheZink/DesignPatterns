import java.util.*;

public class Company extends Component {

    private List<Component> company = new ArrayList<>();
    private StringBuilder xml = new StringBuilder();


    public Company(String name){
        super(name);
    }

    @Override
    public void add(Component component){
        this.company.add(component);
    };

    @Override
    public void remove(Component component){
        this.company.remove(component);
    };

    // Handle Company department and save to the XML
    @Override
    public String printXml(){
        StringBuilder xml = new StringBuilder();

        // Opening tag
        xml.append("<Company name\"").append(name).append("\">\n");
        
        for (Component department : this.company){
            xml.append(department.printXml());
        }
    
        // Closing tag
        xml.append("</Company>\n");

        return xml.toString();
    };

    @Override
    public Component getChild(int index){
        return this.company.get(index);
    };

}
