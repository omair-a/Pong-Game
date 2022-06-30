package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	protected final int WIDTH = 32;
	protected final int HEIGHT = 4;

	protected int x;
	protected int y;

	Player(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void rightPressed() {
		this.x++;
		tick();
	}

	public void leftPressed() {
		this.x--;
		tick();
	}

	public void tick() {
		if (x + WIDTH > Game.WIDTH)
			x--;
		else if (x < 0)
			x++;
	}

	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}

}
