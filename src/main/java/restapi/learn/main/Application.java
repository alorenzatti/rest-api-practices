
package restapi.learn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */

@ComponentScan("restapi.learn")
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
