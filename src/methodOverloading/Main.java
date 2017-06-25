package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// method overloading uses the same method name with different parameters
		
		int newScore = calculateScore("Kelly", 500);
		System.out.println("New score is " + newScore);
		
		calculateScore(75);
		calculateScore();
		
		calcFeetAndInchesToCentimeters(10, 23);

	}
	
	public static int calculateScore(String playerName, int score){
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000; 
	}

	public static int calculateScore(int score){
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000; 
	}

	public static int calculateScore(){
		System.out.println("No player name, no player score");
		return 0; 
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, int inches){
		if(feet >= 0 && inches >= 0 && inches <= 12){
			// calculate how many centimeters comprise the feet and inches passed to this method and return the value
			double feetToCentimeters = feet * 30.48;
			double inchesToCentimeters = inches * 2.54;
			double conversionFeetAndInchesToCentimeters = feetToCentimeters + inchesToCentimeters;
			return conversionFeetAndInchesToCentimeters;
		} else {
			return -1;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches){
		if(inches >= 0){
			// calculate how many feet are in the inches
			double inchesToFeet = inches / 0.0833333;
			return inchesToFeet;
		} else {
			return -1;
		}
	}
	
}
