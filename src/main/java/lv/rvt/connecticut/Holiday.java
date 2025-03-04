package lv.rvt.connecticut;

public class Holiday extends Card {

    public Holiday(String r) {
        super.recipient = r;
    }
    
    @Override
    public void printGreeting() {
      System.out.println("Dear " + recipient + ",");
      System.out.println("Season's Greetings!\n");
    }

    @Override
    public String getType() {
        return "HOLIDAY";
    }
}
