package lv.rvt.java.mooc;

// PW
public class ProductWarehouse extends Warehouse {

    private String wareHouseName; // Jaunu klases lauku

    public ProductWarehouse(String name, double capacity) {
        super(capacity); // Mūsu super klase ir Warehouse
        this.wareHouseName = name;
    }

    public String getName() {
        return this.wareHouseName;
    }
    public void setName(String name) {
        this.wareHouseName = name;
    }

    @Override
    public String toString() {
        return getName() + ": " + super.toString();

    }

}
