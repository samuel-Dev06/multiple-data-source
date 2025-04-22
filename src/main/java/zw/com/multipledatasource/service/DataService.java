package zw.com.multipledatasource.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zw.com.multipledatasource.entity.mysql.User;
import zw.com.multipledatasource.entity.postgres.Product;
import zw.com.multipledatasource.repository.mysql.UserRepository;
import zw.com.multipledatasource.repository.postgres.ProductRepository;

import java.util.List;

@Service
public class DataService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    @Autowired
    public DataService(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Transactional("mysqlTransactionManager")
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Transactional("postgresTransactionManager")
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
