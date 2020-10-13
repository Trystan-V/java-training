package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1
		// Si le nom est Manu alors on veut "hello Manu" sinon on veut "hello World"
		if (name == "Manu") {
			return "Hello Manu";
		} else {
			return "Hello World";
		}
	}

	public static String[] removeNullElements(String[] array) {
		// 2

		String[] retour;
		int c = 0;

		for (String elem : array) {
			if (elem != null) {
				c++;
			}
		}

		retour = new String[c];

		int x = 0;
		for (String elem : array) {
			if (elem != null) {
				retour[x] = elem;
				x++;
				System.out.println(elem);
			}

		}
		// ArrayList<String> stock = new ArrayList<String>();

		// for (String mot : array) {
		// if (mot != null) {
		// stock.add(mot);
		// }
		// }
		// retour = stock.toArray(new String[stock.size()]);

		return retour;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		// int[] Sortie = {};
		// Sortie = new int[array.length];
		// int cpt = array.length;
		// for (int i = 0; i < Sortie.length; i++) {

		// }

		// return Sortie;

			int[] sortie = new int[array.length + 1]; // je crée un nouveau tableau comme le premier mais avec 1 place en plus

			sortie[0]= element; // à la position 0 il ya mon élément

			for ( int i = 0; i < array.length; i++) { //Je parcours le tableau pour savoir ce qu'il y a dedans
				sortie[i + 1] = array[i];// et hop j'ajoute l'array a mon tableau de sortie
			}
			
			return sortie;

	}

	

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		int[] Sortie = {}; // ce qu'on veut à la fin
		if (array.length > 3) {
			Sortie = new int[array.length - 3];
			for (int i = 3; i < array.length; i++) {
				Sortie[i - 3] = array[i];
			}
			return Sortie;
		} else {
			return Sortie;
		}
	}

	public static String getFirstHalf(String word) {
		// 5
		String result; // Résultat final
		int division = word.length() % 2; // découpe le mot en 2 on garde le modulo
		if (division == 0) { // si c'est égal à O
			result = word.substring(0, (word.length() / 2)); // on prend la premiere moitié
		} else {
			result = word.substring(0, (word.length() / 2 + 1));// sinon on ajoute 1 au réslutat
		}
		return result;
	}

	public static String[] selectElementsStartingWithA2(String[] array) {
		// 6
		// String[] sortie = {};
		// sortie = new String[array.length];
		// for (int i = 0; i < array.length; i++) {
		// if () {

		// } else {

		// }
		// }

		// }
		// intialiser un stock vide
		String[] mots; // juste déclaré

		// soit je connais la taille donc new soit une arraylist
		// comme pas de new on initialise on creer une boucle

		// je repère les mots qui commencent par un "a"
		int nombre = 0;
		for (String elem : array) {
			if (elem.charAt(0) == 'a') {
				// System.out.println(elem);
				nombre++; // nb = nb + 1;
			}
		}
		mots = new String[nombre]; // initiallisé
		// System.out.println(nb);

		// remplir le tableau
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			String elem = array[i];
			// System.out.println(elem);
			// System.out.println("i="+i);
			// System.out.println("x="+x);
			// parcourir chaque mot ==> boucle
			if (elem.charAt(0) == 'a') {
				mots[x] = elem;
				x++;
			}
		}
		// parcourir chaque mot ==> boucle
		// pour chaque mot j'extrait la premiere lettre
		// cette lettre je la compare a "a" ==> instruction
		// si = "a" je stocke le mot
		// je retourne un tableau de ces mots
		return mots;
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		String[] retour;
		ArrayList<String> stock = new ArrayList<String>();

		for (String mot : array) {
			if (mot.charAt(0) == 'a') {
				stock.add(mot);
			}
		}
		retour = stock.toArray(new String[stock.size()]);
		// int x= 0;
		// retour = new String[stock.size()];
		// for (String mot : stock) {
		// retour [x] = mot;
		// x++;
		// }
		return retour;
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		// static boolean voyelle (char letter) {
		// return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||
		// letter = 'u' || letter == 'y');
		// }
		String[] retour;

		int capacity = 0;

		for (String item : array) {
			// char lettre = item.charAt(0);
			if (item != null) {
				if (item.charAt(0) == 'a' || item.charAt(0) == 'e' || item.charAt(0) == 'i' || item.charAt(0) == 'o'
						|| item.charAt(0) == 'u' || item.charAt(0) == 'y') {
					capacity++; // Si le premeir caractère en position 0 est une voyelle stock le. capcity =
								// capacity + 1
					System.out.println(item);
				}
			}
		}
		retour = new String[capacity];

		int x = 0;

		for (int i = 0; i < array.length; i++) {
			String item = array[i]; //
			if (item != null) {
				if (item.charAt(0) == 'a' || item.charAt(0) == 'e' || item.charAt(0) == 'i' || item.charAt(0) == 'o'
						|| item.charAt(0) == 'u' || item.charAt(0) == 'y') {
					retour[x] = item;
					x++;

				}
			}
		}
		return retour;
		// String[] retour;

		// ArrayList<String> stock = new ArrayList<String>();

		// for (String item : array) {
		// if(item != null) {
		// if (item.charAt(0) == 'a' || item.charAt(0) == 'e' || item.charAt(0) == 'i'
		// || item.charAt(0) == 'o'
		// || item.charAt(0) == 'u' || item.charAt(0) == 'y') {
		// stock.add(item);
		// }
		// }
		// }
		// retour = stock.toArray(new String[stock.size()]);
		// return retour;
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		/*
		 * Je crée un nouveau tableau ->je le déclare (si je sais pas ce qu'il y a
		 * dedans)
		 * 
		 */
		String[] retour;

		// ArrayList<String> stock = new ArrayList<String>();

		// for (String inverse : array) {
		// stock.reverse(inverse);
		// }

		// retour = stock.toArray(new String[stock.size()]);

		return null;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		return null;
	}

	public static String shortestWord(String text) {
		// 10
		int longueur = 100;
		String[] mots = text.split(" ");
		String shortestWord = "";

		for (String word : mots) {
			if (word.length() < longueur) {
				longueur = word.length();
				shortestWord = word;
			}
		}

		return shortestWord;
	}

	public static String removeCapitals(String text) {
		// 11

		return null;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		return result;
	}

	public static float makeNegative(float number) {
		// 15
		float result;

		if (number > 0) {
			result = number * (-1);
			return result;
		} else {
			return number;
		}

	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		//String elem;
		boolean specialCharacters;
		String recherche;

		for(int i = 0; i < string.length(); i++){
		if(string.substring(0) == "&") {
 
		specialCharacters = true;
				
			}
		else {
		specialCharacters = false;
		}

		


		
		return specialCharacters;
	
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17

	// 	 for (String letter: word) {
	// 		if (word.substring(0, 1).equalsIgnoreCase("a") || word.substring(0, 1).equalsIgnoreCase("e") || word.substring(0, 1).equalsIgnoreCase("i")
	// 		|| word.substring(0, 1).equalsIgnoreCase("o") || word.substring(0, 1).equalsIgnoreCase("u") || word.substring(0, 1).equalsIgnoreCase("y")) {
   
	// 	   return false;
	// 		   } 
	// 		   else {
	// 	   return true;
	//   		 }
	//  }
	//	return true;
			String firstLetter = word.substring(0,1);
			if ("aeiouAEIOU".contains(firstLetter)){
				return false;
			}else{
				return true;
			}

	}

	public static String getDomainName(String email) {
		// 18

		//return email.replaceAll("(^.*@.com$)", ";");
		String [] split = email.split(".com");
		split = split[0].split("@");
	
		return split[1];
	}

	public static int[] letterPosition(String name) {
		// 19
		return null;
	}

	public static boolean isPeer(int number) {

		// 20
		boolean isPeer;

		if ((number % 2) == 0) {
			isPeer = true;
		} else {
			isPeer = false;
		}

		return isPeer;

	}
}
