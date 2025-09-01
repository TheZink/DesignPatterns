import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
       try{
        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data 1...");
        logger.write("Processing data 2...");
        logger.write("Processing data 3...");
        logger.write("Processing data 4...");
        logger.write("Simulation finished");
        logger.close(); // Remember to close the logger
       } catch (IOException e){
        System.out.println("Error in main: " + e);
       }
    }
}
