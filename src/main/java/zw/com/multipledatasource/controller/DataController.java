package zw.com.multipledatasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.com.multipledatasource.entity.mysql.User;
import zw.com.multipledatasource.entity.postgres.Product;
import zw.com.multipledatasource.service.DataService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    // ---- User (MySQL) Endpoints ----

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return dataService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return dataService.getAllUsers();
    }

    // ---- Product (PostgreSQL) Endpoints ----

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        return dataService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return dataService.getAllProducts();
    }
}
