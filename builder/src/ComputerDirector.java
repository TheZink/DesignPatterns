public class ComputerDirector {

    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder){
        this.builder = builder;
    }

    public void constructGamingComputer(){
        builder.buildProcessor();
        builder.buildRam();
        builder.buildHardDrive();
        builder.buildGraphicsCard();
        builder.buildOperatingSystem();
    }

        public void constructOfficeComputer(){
        builder.buildProcessor();
        builder.buildRam();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
    }

}
