package moyenne;

import java.util.Scanner;

public class App {

	/*
	DECLARATION DES VARIABLE
	
	DEBUT PROGRAMME
	
	FIN PROGRAMME
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//VARIABLE
		
		double nbr1;
		double nbr2;
		double nbr3;
		double moy1 = (nbr1+nbr3)/2d;
		
	//DEBUT PROG	
		Scanner sc = new Scanner(System.in); //permet de lire les saisies utilisateur

		
		System.out.println("PROG CAL MOY 2 NBR");
		System.out.println("veuillez choisir nbr 1");
		
		nbr1  = sc.nextInt();

		System.out.println("Vous avez saisi nbr 1 => " + nbr1);
		
		System.out.println("Veuillez saisir nbr 2");
		nbr2 = sc.nextInt();
		
		System.out.println("Vous avez saisi nbr 2 => " + nbr2);
		
		System.out.println("La moyenne est de " + moy = (nbr1+nbr2)/2d);
		
		System.out.println("Entrer nbr 3")
		nbr3 = sc.nextDouble();
		
		System.out.println("la moy des 3 nbr est "+ moy + );
		
	//FIN PROG	
	}

}
