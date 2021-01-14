import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<CompteBancaire> comptes = new ArrayList<>();
		CompteBancaire compteB;
		
		while(true) {
			System.out.println("Bienvenu, veuillez choisir un compte ou en cr�er un");
			System.out.println("1 - cr�er un compte");
			System.out.println("2 - s�l�ctionner un compte");
			Scanner in = new Scanner(System.in);
	 		//int choix = 0;
	        int choix = in.nextInt();
	        switch(choix) {
	        
	        	case 1:
	        		int nb = comptes.size()+1;
	        		CompteBancaire compte = new CompteBancaire("" + nb);
	        		comptes.add(compte);
	        		System.out.println("Compte cr�� avec succ�s \n");
	        		break;
	        		
	        	case 2:
	        		System.out.println("Choisir le compte");
	        		for (CompteBancaire compteBancaire : comptes) {
	        			System.out.println(compteBancaire.getNumCompte());
					}
	        		int choix2 = in.nextInt();
	        		if (choix2 > 0 && choix2 <= comptes.size()) {
						compteB = comptes.get(choix2-1);
		        		System.out.println("*********** Compte n� " + compteB.getNumCompte() + " ***********");
		        		boolean isActive = true;
		        		while(isActive) {
		        			System.out.println("Veuillez choisir une action:");
			        		System.out.println("1 - cr�er une nouvelle op�ration");
			        		System.out.println("2 - consulter le journal");
			    			System.out.println("3 - revenir au menu principal");
			    			int choix3 = in.nextInt();
			    			switch(choix3) {
			    			case 1:
			    				 compteB.createOperation();
			    				 System.out.println("Op�ration cr��e et ajout�e au journal avec succ�s");
			    				break;
			    			case 2:
			    				 compteB.checkJournal();
			    				 isActive = true;
			    				break;
			    				
		    				default:
		    					isActive = false;
		    					break;
			    			}
			        		break;
		        		}
		        		choix2 = 0;
					} else {
						System.out.println("Operation inconnue, retour au menu principal");
					}
	        		
	        		
	        		
	        	default:
	        		break;
	        }
	        choix = 0;
		}
		

	}


}
