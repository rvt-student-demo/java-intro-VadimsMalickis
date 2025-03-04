package lv.rvt.java.mooc;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Money> owedPersonList;
    
    public IOU() {
        this.owedPersonList = new HashMap<>();
    }

    public void setSum(String toWhom, Money amount) {
        owedPersonList.put(toWhom, amount);
    }

    public Money howMuchDoIOweTo(String toWhom) {
        return owedPersonList.get(toWhom);
    }
}
