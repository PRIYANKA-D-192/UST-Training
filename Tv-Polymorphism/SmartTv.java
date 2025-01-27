public class SmartTv extends Tv {
    @Override
    public void switchOn()
    {
        System.out.println("Smart Tv is on");
    }

    @Override
    public void changeChannel()
    {
        System.out.println("Smart TV channel is changed");
    }
}
