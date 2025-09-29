public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new SmartTv());
    }

    public static void testDevice(Device device) {
        // System.out.println("Tests with basic remote.");
        // BasicRemote basicRemote = new BasicRemote(device);
        // basicRemote.power();
        // device.printStatus();

        // System.out.println("Tests with advanced remote.");
        // AdvancedRemote advancedRemote = new AdvancedRemote(device);
        // advancedRemote.power();
        // advancedRemote.mute();
        // device.printStatus();

        System.out.println("Test with Smart remote");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power();
        device.printStatus();
        smartRemote.openApp("Spotify");
        device.printStatus();
    }
}