package _01_asteroids;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import game_tools.Controller;
import game_tools.GameControlScene;

public class Rocket implements GameControlScene, Controller {

	double acceleration = 15;
	double torque = 15;
	double angle = 0;
	int x, y, size;
	Rectangle collisionBox;
	boolean turnLeft = false;
	boolean turnRight = false;
	boolean accelerate = false;
	boolean deccelerate = false;
	boolean fire = false;
	boolean restart = false;

//	 2. A constructor does not have a return type and must be named the same as
//	 the class i.e. public Rocket(){
//	 
//	 In the constructor initialize:
	public Rocket(){
		x = AsteroidsGame.WIDTH / 2;
		y = AsteroidsGame.HEIGHT / 2;
		size = 10;
		collisionBox = new Rectangle(x - size / 2, y - size / 2, size, size);
	 	}
	public Rocket(int x, int y){
 		this.x = x;
 		this.y = y;
 		}
	 
//	 and
	 
	 
	 
// 		With this you can run the game. use WASD to move and SPACE to fire
//
//
//		 3. If we want to be able to choose where to place the rocket we can create a
//	 constructor that has parameters for x and y we can do this like any other
//	 method 
//	 
//	 
//	 We also need to initialize our variables again but this time 
//	  
//	 The keyword this refers to the current object, this instance of the rocket,
//	 so we are setting the member variable x to the x passed to the constructor
//	 
//	 try replacing one of the calls to the constructor with a call to this
//	 constructor.
	 

	public void draw(Graphics g) {
		Graphics2D graphics2D = (Graphics2D) g;
		graphics2D.rotate(Math.toRadians(angle), x, y);
		graphics2D.setColor(Color.WHITE);
		graphics2D.draw(collisionBox);
		graphics2D.rotate(-Math.toRadians(angle), x, y);

	}

	void update() {
		double newX = 0;
		double newY = 0;
		if (turnLeft)
			angle += torque;
		if (turnRight)
			angle -= torque;
		if (accelerate) {
			newX = (Math.cos(Math.toRadians(angle)));
			newY = (Math.sin(Math.toRadians(angle)));
		}
		if (deccelerate) {
			newX = -(Math.cos(Math.toRadians(angle)));
			newY = -(Math.sin(Math.toRadians(angle)));
		}
		x += newX * acceleration;
		y += newY * acceleration;

		if (x < 0)
			x = AsteroidsGame.WIDTH;
		if (x > AsteroidsGame.WIDTH)
			x = 0;
		if (y < 0)
			y = AsteroidsGame.HEIGHT;
		if (y > AsteroidsGame.HEIGHT)
			y = 0;
		collisionBox.setLocation(x - size / 2, y - size / 2);

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
			turnLeft = true;
			break;
		case KeyEvent.VK_A:
			turnRight = true;
			break;
		case KeyEvent.VK_W:
			accelerate = true;
			break;
		case KeyEvent.VK_S:
			deccelerate = true;
			break;
		case KeyEvent.VK_SPACE:
			if (!fire)
				fire = true;
			break;
		case KeyEvent.VK_R:
			restart = true;
			break;
		default:
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_D:
			turnLeft = false;
			break;
		case KeyEvent.VK_A:
			turnRight = false;
			break;
		case KeyEvent.VK_W:
			accelerate = false;
			break;
		case KeyEvent.VK_S:
			deccelerate = false;
			break;
		default:
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
