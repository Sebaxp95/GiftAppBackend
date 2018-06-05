package pl.edu.agh.ux.giftapp.giftapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.ux.giftapp.giftapp.Models.Product;
import pl.edu.agh.ux.giftapp.giftapp.Models.Purchase;

import java.util.List;

@RestController
@RequestMapping(path = "app")
public class ClassController {

    private Database database;

    @Autowired
    public ClassController(Database database) {
        this.database = database;
    }

    @GetMapping(path = "/purchases")
    public List<Purchase> getAllPurchases() {
        return database.getPurchases();

    }

    @GetMapping(path = "/products")
    public List<Product> getAllProducts() {
        return database.getProducts();

    }

}
