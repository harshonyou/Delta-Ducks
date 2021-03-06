package com.ducks;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ducks.screens.MainMenuScreen;

/***
 * Game Class with global constants
 */
public class DeltaDucks extends Game {

	// Ratio of Game Screen
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;

	// Ratio of Game Camera
	public static final int VIRTUAL_WIDTH = 480*2; // 400
	public static final int VIRTUAL_HEIGHT = 480; // 208

	// Ratio of real world : game
	public static final float PIXEL_PER_METER = 100;
	public static final float TILEED_MAP_SCALE = .3f;

	// Bits filtration libgdx
	public static final short BIT_SEA = 2;
	public static final short BIT_LAND = 4;
	public static final short BIT_PLAYER = 8;
	public static final short BIT_PIRATES = 16;
	public static final short BIT_MONSTERS = 32;
	public static final short BIT_BOUNDARY = 64;
	public static final short BIT_BULLETS = 124;
	public static final short BIT_CANNONS = 248;
	public static final short BIT_COLLEGES = 496;

	// Batch to draw Game
	public SpriteBatch batch;

	/***
	 * Decide which screen to run first
	 */
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
