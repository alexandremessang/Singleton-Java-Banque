
public class OperationBancaire {

	private String type;
	private float montant;
	private String description;
	
	public OperationBancaire(String type, float montant, String description) {
		this.type = type;
		this.montant = montant;
		this.description = description;
	}
	
	public String toString() {
		String string = "Type: " + this.type +
						" - Montant: " + this.montant +
						" Descriptif: " + this.description;
		return string;
	}

}
