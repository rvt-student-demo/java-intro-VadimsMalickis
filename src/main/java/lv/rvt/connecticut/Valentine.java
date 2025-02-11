package lv.rvt.connecticut;

public class Valentine extends Card {

    private int kisses;

    public Valentine ( String r, int k )
    {
        super.recipient = r;
        this.kisses    = k;
    }

    @Override
    public void printGreeting()
    {
      System.out.println("Dear " + recipient + ",");
      System.out.println("Love and Kisses,");

      for ( int j=0; j < kisses; j++ ) {
          System.out.print("X");
      }

      System.out.println("\n");
    }

    @Override
    public String getType() {
        return "VALENTINE";
    }
}
