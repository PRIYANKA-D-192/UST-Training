//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      SmartPhone s=new SmartPhone();
      Phone p=s;
      ICamera c=s;
      IMusic m=s;
      c.click();         //reference c can only mehods inside ICamera interface i.e, click,record
      c.record();
      m.play();          //reference m can only mehods inside IMusic interface i.e, play,stop
      m.stop();
      p.sms();           //reference p can only mehods inside phone class i.e, sms,call
      p.call();
      s.videoCall();
    }
}