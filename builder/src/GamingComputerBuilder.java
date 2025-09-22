public class GamingComputerBuilder implements ComputerBuilder {
    
    private Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();
    }
    
    @Override
    public void buildProcessor(){
        computer.addComponent(new Component().setName("AMD Ryzen 9 9900X3D processor\n"));
    }
    
    @Override
    public void buildRam(){
        computer.addComponent(new Component().setName("64GB ram\n"));
    }
    
    @Override
    public void buildHardDrive(){
        computer.addComponent(new Component().setName("1000GB harddrive\n"));
    }

    @Override
    public void buildGraphicsCard(){
        computer.addComponent(new Component().setName("8GB Nvidia GeForce RTX 5090\n"));
    }

    @Override
    public void buildOperatingSystem(){
        computer.addComponent(new Component().setName("Windows 11 Pro 23H2-build\n"));
    }

    public Computer getComputer(){
        return computer;
    }
        
}
