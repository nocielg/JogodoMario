package com.in28minuts.spring.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//private MarioGame game;
	//private SuperContraGame game;
	@Autowired
	private GamingConsole game;
	
	//public GameRunner (MarioGame game) {
	//public GameRunner (SuperContraGame game) {
	public GameRunner (GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.down();
		game.left();
		game.right();
		game.up();
		
	}

}
