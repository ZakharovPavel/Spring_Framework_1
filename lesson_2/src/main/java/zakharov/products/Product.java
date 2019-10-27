package zakharov.products;

public class Product {

    private int ID = 1;
    private String title;
    private double cost;

    public Product(String title, double cost) {
        this.title = title;
        this.cost = cost;
        ++ID;
    }

    public int getId() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }
}
