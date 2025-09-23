import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Welcome to the computer-builder program.\n" +
                                "Please select, what build do you want\n" +
                                "1. Gaming computer\n" +
                                "2. Office computer\n" +
                                "3. Exit programm");
            int choice = scanner.nextInt();

            if (choice == 1){
                ComputerBuilder builder1 = new GamingComputerBuilder();
                ComputerDirector director1 = new ComputerDirector(builder1);
                director1.constructGamingComputer();
                Computer computer1 = builder1.getComputer();
                System.out.println(computer1);
            }

            else if (choice == 2){
                ComputerBuilder builder2 = new OfficeComputerBuilder();
                ComputerDirector director2 = new ComputerDirector(builder2);
                director2.constructOfficeComputer();
                Computer computer2 = builder2.getComputer();
                System.out.println(computer2);
            }

            else if (choice == 3){
                System.out.println("Closing program. Have a nice day!");
                break;
            }
            
            else {
                System.out.println("Error! Unknown input");
            }
        }
        scanner.close();
    }
}
