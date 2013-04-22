package lol;
import robocode.*;
import java.awt.Color;
import robocode.HitWallEvent;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import java.util.Random;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * First - a robot by (your name here)
 */
public class First extends AdvancedRobot
{
  boolean npr;
	boolean peak; 
	boolean iso;
	int turnDirection = 1;
	boolean nine;
	double f;
	double r; 
	int l;
	double er;	

	public void run() {
		Random r = new Random();
		int l = r.nextInt();
		setBodyColor(Color.lightGray);
		setGunColor(Color.gray);
		setRadarColor(Color.darkGray);
		iso = true;
		
		
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(l);
			back(l);	
		
			
	
			
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		f = e.getBearing(); 
		
	if (e.getBearing() >= 0) {
			turnDirection = 1;
			fire(3);
		 }
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		

	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void	onHitWall(HitWallEvent e){
	  er = e.getBearing();
	  if(er <= 180){
	  turnLeft(er-90);
	  ahead(er-90);
	  }
	  else{
		  turnRight(er-90);
		  ahead(er-90);
	  }
	}
	  }
