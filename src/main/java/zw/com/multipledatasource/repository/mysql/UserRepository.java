package zw.com.multipledatasource.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.com.multipledatasource.entity.mysql.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
