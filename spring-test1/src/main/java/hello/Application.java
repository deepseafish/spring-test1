package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
/**
 *	@SpringBootApplication is same as adding all 3:
 *	@Configuration, @EnableAutoConfiguration, @ComponentScan
 */
public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		// Disable command line properties
		app.setAddCommandLineProperties(false);
		ConfigurableApplicationContext ctx = app.run(args);
		MyConfig myConfig = ctx.getBean(MyConfig.class);

		/**
		 * To adjust environment in Eclipse provide environment variable in
		 * runtime / debug configurations: spring.profiles.active=devel || prod
		 * 
		 * All values here are configured either in:
		 * application-devel.properties or application-prod.properties
		 */
		System.out.println("using environment:" + myConfig.getEnv());
		System.out.println("name:" + myConfig.getName());
		System.out.println("random bytes:" + myConfig.getRandomBytes());
		System.out.println("random int value from 10-100:"
				+ myConfig.getRandomInt());
		System.out.println("random long value:" + myConfig.getRandomLong());
	}
}
