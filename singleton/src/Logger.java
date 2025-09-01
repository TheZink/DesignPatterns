import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private FileWriter writer;

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Set filename
    public synchronized void setFileName(String fileName) throws IOException {
        if (fileName == null) {
            return;
        }

        try {
        writer = new FileWriter(fileName);
        } catch (IOException e){
            System.out.println("An error occurred. " + e);
            writer.close();
        }
    }

    // Add string to the file
    public synchronized void write(String text) {
        try {
            writer.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to log file: " + e);
        }
    }

    // Flush FileWriter stream and close it, if writer-variable is not null.
    public synchronized void close() {
        try {
            
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Error in close(): " + e);
        } finally {
            writer = null;
        }
    }
}
