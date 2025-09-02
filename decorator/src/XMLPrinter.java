public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer){
        super(printer);
    }

    // Wraps message in XML
    @Override
    public void print(String message){
        super.print("<Message>" + message + "</message>");
    }


}
