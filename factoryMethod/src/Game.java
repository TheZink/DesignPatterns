package src;

import java.util.Scanner;

public class Game {

    public static void main(String[] args){

        // Promt user to choose terrain
        System.out.println("Choose terrain. (C)ity or (W)ilderness. Type 'e' to exit");
        Scanner input = new Scanner(System.in);

        String userInput;
        Map map;

        // Generate map
        do {
            // convert input to lower case
            userInput = input.nextLine().toLowerCase();

            // Generate CityMap
            if (userInput.equals("c")){

                map = new CityMap(); 
                map.createTile();
                map.display();

                System.out.println("Select terrain (c or w) or press 'e' to exit");

            // Generate WildernessMap
            } else if (userInput.equals("w")) {

                map = new WildernessMap();
                map.createTile();
                map.display();
                
                System.out.println("Select terrain (c or w) or press 'e' to exit");

            } else if (!userInput.equals("e")) {
                System.out.println(userInput + " is an unknown input");
            }

            
        } while (!userInput.equals("e"));

        System.out.println("Exiting game. Have a nice day!");
        input.close();
    }
}
