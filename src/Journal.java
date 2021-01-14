import java.util.ArrayList;

public class Journal {
	
	private ArrayList<String> history = new ArrayList<>();
	private static final Journal instance = new Journal();

	private Journal() {
		System.out.println("Construction au 1er appel");
	}
	
	public static Journal getInstance() {
		return instance;
	}
	
	public void showHistory() {
		if (this.history != null) {
			for (String string : history) {
			System.out.println(string);
			}
		} else {
			System.out.println("Aucune entrée dans le journal");
		}
	}
		
	
	public void addTraceBack(String operation) {
		this.history.add(operation);
	}

}
