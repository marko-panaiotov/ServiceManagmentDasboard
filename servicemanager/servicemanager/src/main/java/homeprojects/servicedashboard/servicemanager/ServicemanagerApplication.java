package homeprojects.servicedashboard.servicemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("homeprojects.servicedashboard.servicemanager")
public class ServicemanagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServicemanagerApplication.class, args);
	}

}
