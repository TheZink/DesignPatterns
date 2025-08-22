public abstract class Component {

    protected String name;
    protected Double salary;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract String printXml();

    public abstract Component getChild(int index);
}
