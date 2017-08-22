package traitorspring;

import Fighters.Fighter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TraitorspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraitorspringApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Fighter fighter = (Fighter) context.getBean("fighterPro");
		fighter.fight();
	}
}
