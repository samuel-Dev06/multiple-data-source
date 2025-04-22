package zw.com.multipledatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "zw.com.multipledatasource")
@EntityScan("zw.com.multipledatasource.entity")
//@EnableJpaRepositories("zw.com.multipledatasource.repository")
public class MultipleDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleDataSourceApplication.class, args);
    }

}
