import java.util.Scanner;

public class CompteBancaire {

	private String numCompte;
	
	public CompteBancaire(String numCompte) {
		this.numCompte = numCompte;
	}
	
	public void afficher() {
		System.out.println(numCompte);
	}
	
 	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public void createOperation() {
 		Scanner in = new Scanner(System.in);
 		boolean isValid = false;
		System.out.println("Saisir le type d'opération:");
        String type = in.nextLine();
        
        System.out.println("Saisir le montant:");
        Float montant = in.nextFloat();
        String description = "";
        while(!isValid) {
        	System.out.println("Saisir une description de l'opération :");
        	description = in.nextLine();
        	if(description.length() > 0 )
        		isValid = true;
        }
        
        
        
 		
 		
        
        
        if(isValid) {
        	OperationBancaire opeB = new OperationBancaire(type, montant, description);
	 		Journal journal = Journal.getInstance();
	 		journal.addTraceBack(opeB.toString());
        } else {
        	System.out.println("Erreur");
        }
 	}
	
	public void checkJournal() {
		Journal.getInstance().showHistory();
	}

}
