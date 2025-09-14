package _02_race_car;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar car= new RaceCar("subaru",3);
	JOptionPane.showMessageDialog(null, car.getPositionInRace());
		// 2. Print the RaceCar's position in the race
	car.crash();
	if(car.damaged) {
		car.pit();
	}
	car.overtake();
	car.overtake();
	car.overtake();
	car.overtake();
	car.overtake();
	car.overtake();
		// 3. Crash the RaceCar
		
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
}
