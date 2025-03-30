package com.in28minuts.spring.learn_spring_framework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minuts.spring.learn_spring_framework.enterprise.example.MyWebController;
import com.in28minuts.spring.learn_spring_framework.game.GameRunner;
import com.in28minuts.spring.learn_spring_framework.game.GamingConsole;
import com.in28minuts.spring.learn_spring_framework.game.MarioGame;
import com.in28minuts.spring.learn_spring_framework.game.PacmanGame;
import com.in28minuts.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//SpringApplication.run(LearnSpringFrameworkApplication.class, (java.lang.String[]) args);
		//SpringApplication.run
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		//PacmanGame game = new PacmanGame();
		//GamingConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
		
	}

}
