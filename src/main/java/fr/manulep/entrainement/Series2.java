package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Series2 {

	private Series2() {
		throw new IllegalStateException("Test class");
	}

	public static List<String> selectElementsFromListStartingWithA(List<String> elements) {

		ArrayList<String> stock = new ArrayList<String>();

		for (String mot : elements) {
			if (mot.charAt(0) == 'a') {
				stock.add(mot);

			}

		}
		return stock;

	}

	public static List<String> sortByLastLetter(List<String> names) {
		return new ArrayList<>();
	}

	public static String exportWordsWithoutALetter(List<String> names, char letter) {
		return "";
	}

	public static String getAllLetters(List<String> words) {
		return "";
	}

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {

		return new ArrayList<>();
	}

	public static List<Integer> exportPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> reverseOrder(List<Integer> elements) {

		List<Integer> result = new ArrayList<>();
		for (int i = elements.size() - 1; i >= 0; i--) {
			result.add(elements.get(i));
		}

		return result;
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static String longestWord(String text) {

		int longueur = 0;
		text = text.replace(',', ' ');
		String[] mots = text.split(" ");
		String longestWord = "";

		for (String word : mots) {
			if (word.length() > longueur) {
				longueur = word.length();
				longestWord = word;
			}
		}

		return longestWord;
		// return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {

		// int result;
		double arrondi;

		arrondi = Math.round(number);

		int result = (int) arrondi;

		return result;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		int result;
		double convertorCelsius;
		convertorCelsius = (temperature - 32);
		convertorCelsius = convertorCelsius * 5 / 9;
		convertorCelsius = Math.ceil(convertorCelsius);
		result = (int) convertorCelsius;

		return result;

		// int celsius;
		// if (temperature == 32) {
		// celsius = (temperature - 32) * 5 / 9;
		// } else {
		// celsius = ((temperature - 32) * 5 / 9) + 1;
		// }

		// return celsius;
	}

	public static boolean isPeerSum(final int... numbers) {

		boolean resultat = false;
		int num = 0;

		for (int count = 0; count < numbers.length; count++) {
			num = num + numbers[count];
		}

		if (num % 2 == 0) {
			resultat = true;
		}

		return resultat;

	}

	public static boolean isRightTriangle(int side1, int side2, int side3) {

		Boolean result = false;
		int powerSide1 = (int) Math.pow(side1, 2);
		int powerSide2 = (int) Math.pow(side2, 2);
		int powerSide3 = (int) Math.pow(side3, 2);

		if (powerSide1 == powerSide2 + powerSide3 || powerSide2 == powerSide1 + powerSide3
				|| powerSide3 == powerSide1 + powerSide2) {
			result = true;
		}

		return result;

	}

	public static boolean isOrder(int... number) {

		boolean resultat = false;
		List<Integer> emptyArray = new ArrayList<Integer>();
		List<Integer> compareArray = new ArrayList<Integer>();
		for (Integer num : number) {
			emptyArray.add(num);
			compareArray.add(num);
		
		}

		if (emptyArray.size() < 2) {
			resultat = true;
		} else if (emptyArray.get(0) < emptyArray.get(1)){

			Collections.sort(compareArray);

			if (emptyArray.equals(compareArray)) {
				resultat = true;
			}else if (emptyArray != compareArray) {
				resultat = false;
			}
		}else if (emptyArray.get(0) > emptyArray.get(1)) {
			Collections.sort(compareArray, Collections.reverseOrder());

			if (emptyArray.equals(compareArray)) {
				resultat = true;
			}else if (emptyArray != compareArray) {
				resultat = false;
			}
		}

		// System.out.println(emptyArray);
		// System.out.println(compareArray);

		// if (emptyArray.equals(compareArray)){
		// 	resultat = true;
		// } else {
		// 	resultat = false;
		// }
		
	return resultat;
		// if (emptyArray.indexOf(0) <= emptyArray.indexOf(1) 
		// && emptyArray.indexOf(1) <= emptyArray.indexOf(2) 
		// && emptyArray.indexOf(2) <= emptyArray.indexOf(3)) {
		// 	resultat = true;
		// } else if (emptyArray.indexOf(0) >= emptyArray.indexOf(1) 
		// && emptyArray.indexOf(1) >= emptyArray.indexOf(2) 
		// && emptyArray.indexOf(2) >= emptyArray.indexOf(3)) {
		// 	resultat = true;
		// }else if (emptyArray.size() == 1 || emptyArray.size() == 0){

		// } else {
		// 	resultat = false;
		// }

		// for (int i = number.length()-1; i >= 0; i--) {

		// }
		// System.out.println(number);
		// ArrayList<int> numbers = number;
		// ArrayList<int>[] compare = number;
		// Arrays.sort(compare);
		// if (numbers == compare) {
		// return true;
		// }
		
		// }
	}

	// boolean result;

	// for (int i = 0; i < number.length; i++) {
	// if (number[1] < number[2]) {
	// result = true;
	// return result;
	// } else {
	// result = false;
	// }
	// }

	// return result;
	// }

	public static Float intToFloat(int number) {

		float convert;

		convert = (float) number;

		return convert;
	}

	public static Integer floatToInt(float number) {

		int convert;

		convert = (int) number;

		return convert;

	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
