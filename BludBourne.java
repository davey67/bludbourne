package com.bludbourne.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import com.bludbourne.game.screens.MainGameScreen;
import com.badlogic.gdx.Game;

public class BludBourne extends Game {
	
	public static final MainGameScreen _mainGameScreen = new MainGameScreen();
	

	@Override
	public void create () {
		setScreen(_mainGameScreen);
	}
	
	@Override
	public void dispose () {
		_mainGameScreen.dispose();
	}
}
