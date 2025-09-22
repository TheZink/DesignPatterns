public class Component {
    private String componentName;

    public Component setName(String name){
        this.componentName = name;
        return this;
    }

    public String getName(){
        return componentName;
    }

}
