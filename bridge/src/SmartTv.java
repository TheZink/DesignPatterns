public class SmartTv implements Device{
    private boolean on = false;
    private int volume = 30;
    private int channel = 0;
    private String app = "Youtube";

    @Override
    public boolean isEnabled(){
        return on;
    }

    @Override
    public void enable(){
        on = true;
    }

    @Override
    public void disable(){
        on = false;
    }

    @Override
    public int getVolume(){
        return volume;
    }

    @Override
    public void setVolume(int volume){
        if (volume > 100){
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel(){
        return channel;
    }

    @Override
    public void setChannel(int channel){
        this.channel = channel;
    }

    public void setApp(String name){
        this.app = name;
    }

    public String getApp(){
        return app;
    }

    @Override
    public void printStatus(){
        System.out.println("------------------------------------");
        System.out.println("| I'm SmartTV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current app open: " + app);
        System.out.println("------------------------------------\n");
    }
}
