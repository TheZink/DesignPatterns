import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        while (true){
            Scanner scanner = new Scanner(System.in);


        }
        ComputerBuilder builder1 = new GamingComputerBuilder();
        ComputerBuilder builder2 = new OfficeComputerBuilder();

        ComputerDirector director1 = new ComputerDirector(builder1);
        ComputerDirector director2 = new ComputerDirector(builder2);

        director1.constructGamingComputer();
        director2.constructOfficeComputer();

        Computer computer1 = builder1.getComputer();
        Computer computer2 = builder2.getComputer();

        System.out.println(computer1);
        System.out.println(computer2);


    }
}
