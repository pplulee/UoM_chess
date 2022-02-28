package chess;

public class CheckInput {
	
	public static boolean checkCoordinateValidity(String input){
		if (input.length()!=2){
			return false;
		}else if (!Character.isDigit(input.charAt(0)) || !Character.isLetter(input.charAt(1))){
			return false;
		}else return (Character.getNumericValue(input.charAt(0)) <= 7) && (input.charAt(1) <= 'i');
	}
}
