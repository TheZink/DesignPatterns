public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello World, this is a basic printed message!");
        
        Printer printer2 = new XMLPrinter(new BasicPrinter());
        printer2.print("Hello World, this is an XML printed message!");
        
        Printer printer3 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer3.print("Hello World, this is an encrypted and XML printed message!");
        printer3.print("Print only numbers: 123456");

    }

}
