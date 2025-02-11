package lv.rvt;

import lv.rvt.connecticut.Birthday;
import lv.rvt.connecticut.Card;


public class Main 
{
    public static void main(String[] args) throws Exception {  

        Card crd;
        // bd mainīgajā mums is saglabāta adrese uz objektu
        Birthday bd = new Birthday("Lucinda", 42);

        crd = bd;

    }   
    
}
