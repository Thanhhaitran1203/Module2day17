import java.io.Serializable;

public class Product implements Serializable {
    private String id,name,manufacture,describe;
    private int price;

    public Product() {
    }
    public Product(String id, String name, String manufacture, String describe, int price) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.describe = describe;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", exportProducts='" + manufacture + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExportProducts() {
        return manufacture;
    }

    public void setExportProducts(String exportProducts) {
        this.manufacture = manufacture;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
