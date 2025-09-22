public class OfficeComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder(){
        this.computer = new Computer();
    }
    
    @Override
    public void buildProcessor(){
        computer.addComponent(new Component().setName("Intel Core 8th Gen (Coffee Lake)\n"));
    }
    
    @Override
    public void buildRam(){
        computer.addComponent(new Component().setName("32GB DDR4 ram\n"));

    }

    @Override
    public void buildHardDrive(){
        computer.addComponent(new Component().setName("256GB M.2 2280\n"));   
    }
    
    @Override
    public void buildGraphicsCard(){}

    @Override
    public void buildOperatingSystem(){
        computer.addComponent(new Component().setName("Windows 11 Pro 23H2-build\n"));
    }

    public Computer getComputer(){
        return computer;
    }

}
