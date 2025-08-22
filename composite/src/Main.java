import java.io.*;

public class Main {

    public static void main(String[] args) {

        Component org = new Organization("Testiyritys Oy");
        
        Component dep1 = new Organization("Kehitys");
        Component dep2 = new Organization("Laskutus");
        Component dep3 = new Organization("Tuotanto");
        
        Component emp1 = new Employees("Jarkko", 1000);
        Component emp2 = new Employees("Pauli", 4000);
        Component emp3 = new Employees("Leevi", 4000);
        Component emp4 = new Employees("Hanna", 4000);
        Component emp5 = new Employees("Anita", 4000);
        Component emp6 = new Employees("Leena", 4000);

        // Jarkko and Pauli
        dep1.add(emp1);
        dep1.add(emp2);

        // Leena
        dep2.add(emp6);

        // Leevi, Hanna and Anita
        dep3.add(emp3);
        dep3.add(emp4);
        dep3.add(emp5);

        // All department
        org.add(dep1);
        org.add(dep2);
        org.add(dep3);

        // Write data to XML-file
        try (FileWriter writer = new FileWriter("organization.xml")) {
            writer.write(org.printXml());
        } catch (IOException e) {
            System.err.println("Error writing xml " + e.getMessage());
        }

    }

}
