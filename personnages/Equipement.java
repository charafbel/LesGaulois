package personnages;

public enum Equipement {
	CASQUE("Casque"), BOUCLIER("bouclier");
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}

}