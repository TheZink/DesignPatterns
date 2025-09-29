
public class SmartRemote extends BasicRemote{
    public SmartRemote(Device device){
        super.device = device;
    }

    public void openApp(String appName){

        if (device instanceof SmartTv) {
            ((SmartTv) device).setApp(appName);
            System.out.println("SmartRemote: Opening app " + appName);
        } else {
            System.out.println("SmartRemote: Device does not support " + appName);
        }
    }
}
