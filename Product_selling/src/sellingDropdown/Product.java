
package sellingDropdown;

import java.io.Serializable;


public class Product implements Serializable{
    private int id;
    private int code;
    private String name;
    private double price;
    private int qty;
    private String remmark;

    public Product(int id, int code, String name, double price, int qty, String remmark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.remmark = remmark;
    }

    public String getRemmark() {
        return remmark;
    }

    public void setRemmark(String remmark) {
        this.remmark = remmark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    
}
