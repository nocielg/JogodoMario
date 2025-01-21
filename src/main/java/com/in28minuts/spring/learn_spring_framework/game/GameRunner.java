package com.in28minuts.spring.learn_spring_framework.game;

public class GameRunner {
	
	private MarioGame game;
	
	public GameRunner (MarioGame game) {
		this.game = game;
	}

	public void run() {
		game.down();
		game.left();
		game.right();
		game.up();
		
	}

}
