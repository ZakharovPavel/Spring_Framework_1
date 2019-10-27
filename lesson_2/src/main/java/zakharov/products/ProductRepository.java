package zakharov.products;

import java.util.List;

public class ProductRepository {

    private List<Product> productList;

    public List<Product> getProductList() {
        if (productList.size() != 0) {
            return productList;
        }
        return null;
    }

    public Product getProductViaId(int id) {
        for (Product o: productList) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    public void addProduct(String title, double cost) {
        Product product = new Product(title, cost);
        productList.add(product);
    }
}
