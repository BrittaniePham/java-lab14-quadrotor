package lab14_quadrotor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrotorApp {

	public static void main(String[] args) {
//		List<Quadrotor> rotors = Arrays.asList(
//				 new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6),
//				 new Quadrotor(5, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6));
		
		List<Quadrotor> rotors = new ArrayList<Quadrotor>(Arrays.asList(
				 new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6),
				 new Quadrotor(5, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));
		
		System.out.println(rotors);
		
		changeOrientation(rotors);
		System.out.println(rotors);
		
		Quadrotor searchItem = new Quadrotor(4, 6, 9);
		System.out.println("contains searchItem " + searchItem + " - " + rotors.contains(searchItem));
		System.out.println("Number of rotors: " + rotors.size());
		
		rotors.remove(searchItem);
		System.out.println(rotors);
		
		rotors.remove(0);
		System.out.println(rotors);
		
	}
	
	private static void changeOrientation(List<Quadrotor> list) {
		for(Quadrotor rotor : list) {
			int oldY = rotor.getY();
			int oldX = rotor.getX();
			rotor.setX(oldY);
			rotor.setY(oldX);
		}
	}

}
