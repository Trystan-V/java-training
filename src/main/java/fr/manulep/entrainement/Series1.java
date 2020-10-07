package fr.manulep.entrainement;

import java.util.List;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		//Si le nom est Manu alors on veut "hello Manu" sinon on veut "hello World"
		if (name == "Manu") {
			return "Hello Manu";
		} else {
			return "Hello World";
		}
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
	// 	// On veut connaitre la longueur du tableau
	// 	// on parcourt le tableau et on enlève les null
	// 	String[] sortie; //on créer directement un tableau avec la valeur qu'on attend
 
	// 	int cpt=array.length; //la variable qui récupere le nombre de donnée dans le tableau (.lenght)
	// 	for (int i = 0; i < array.length; i++) {//parcour tout le tableau
	// 		String valeur= array[i];
	// 		if (valeur==null) { //Si il ya un null 
	// 			cpt--; 
	// 		}
	// 	}
	// }
		return null;
	}
	
	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		return null;

	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int[] Sortie = {}; // ce qu'on veut à la fin
		if (array.length > 3) {
			Sortie = new int[array.length - 3];
			for (int i = 3; i < array.length; i++) {
				Sortie[i - 3]=array[i];
			} return Sortie;
		} else {
			return Sortie;
		}
	}
	
	public static String getFirstHalf(String word) {
		//5
	String result; // Résultat final
	int division= word.length()%2; // découpe le mot en 2
	if (division == 0) {
		result = word.substring(0, (word.length() / 2));
	} else {
		result = word.substring(0, (word.length() / 2+1));
	}
	return result;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
		return null;
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		return null;
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		// String[] arrayOut;
		
		// int cpt=array.length;
		// for (int i = 0; i < array.length; i++)
		return null;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		return null;
	}

	public static String shortestWord(String text) {
		//10
		return null;
	}

	public static String removeCapitals(String text) {
		//11
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		long result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		return result;
	}

	public static float makeNegative(float number) {
		//15
		float result;
		
		if (number > 0) {
			result = number-(number*2);
			return result;
		} else {
			return number;
		}
		
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		return false;
	}

	public static String getDomainName(String email) {
		//18
		return null;
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		
		//20
		// int reste = number % 2;

		// if(reste == 0) {
			return true;
		//}
	}
}
