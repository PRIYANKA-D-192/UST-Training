public class SmartPhone extends Phone implements ICamera,IMusic {
    public void videoCall()
    {
        System.out.println("Smartphone video call");
    }
    public void play()
    {
        System.out.println("Music plays");
    }
    public void stop()
    {
        System.out.println("Music stops");
    }
    public void click()
    {
        System.out.println("camera photo click");
    }
    public void record()
    {
        System.out.println("camera video record");
    }
}
