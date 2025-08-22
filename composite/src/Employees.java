public class Employees  extends Component {

    public Employees(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public void add(Component component){};
    public void remove(Component component){};
    public String printXml(){
        return "  <Employee name=\"" + name + "\" salary=\"" + salary + "\">\n";
    }

    public Component getChild(int inderx){
        throw new UnsupportedOperationException("Error");
    }
}
