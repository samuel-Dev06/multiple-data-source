package zw.com.multipledatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.com.multipledatasource.entity.postgres.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
