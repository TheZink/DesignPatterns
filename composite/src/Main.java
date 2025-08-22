import java.io.*;

public class Main {

    public static void main(String[] args) {

        Component org = new Company("Testiyritys Oy");
        
        Component dep1 = new Department("Kehitys");
        Component dep2 = new Department("Laskutus");
        Component dep3 = new Department("Tuotanto");
        
        Component emp1 = new Employees("Jarkko", 4500);
        Component emp2 = new Employees("Pauli", 4300);
        Component emp3 = new Employees("Leevi", 3900);
        Component emp4 = new Employees("Hanna", 4100);
        Component emp5 = new Employees("Anita", 4300);
        Component emp6 = new Employees("Leena", 3500);
        Component emp7 = new Employees("Robert", 3200);
        Component emp8 = new Employees("Jukka", 4600);
        Component emp9 = new Employees("Saara", 3990);
        Component emp10 = new Employees("Lotta", 4700);

        

        // Jarkko, Pauli, Lotta and Saara
        dep1.add(emp1);
        dep1.add(emp2);
        dep1.add(emp8);
        dep1.add(emp10);

        // Leena and Robert
        dep2.add(emp6);
        dep2.add(emp7);

        // Leevi, Hanna, Anita and Saara
        dep3.add(emp3);
        dep3.add(emp4);
        dep3.add(emp5);
        dep3.add(emp9);

        // All department
        org.add(dep1);
        org.add(dep2);
        org.add(dep3);

        System.out.println("Testitulostus ");

        // Write data to XML-file
        try (FileWriter writer = new FileWriter("organization.xml")) {
            writer.write(org.printXml());
        } catch (IOException e) {
            System.err.println("Error writing xml " + e.getMessage());
        }

    }

}
