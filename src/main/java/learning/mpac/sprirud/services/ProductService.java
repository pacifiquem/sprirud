package learning.mpac.sprirud.services;

import org.springframework.stereotype.Service;

import learning.mpac.sprirud.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {

        Product product = new Product("Rice", 2000, 12, "We only have 2 kg left");
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(product);

        return productsList;
    }
}
