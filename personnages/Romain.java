package personnages;

public class Romain {
	private String nom; 
	private int force;
	private Equipement[] equip;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
	      this.nom = nom;
	      this.force = force;
	}
	
	public String getNom() {
	      return nom;
	}
	
	public void parler(String texte) {
	      System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
	      return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
	      force -= forceCoup;
	      if (force > 0) {
	    	  parler("Aïe");} 
	      else { 
	    	  parler("J'abandonne...");}
	}
	
	public static void main() {
		Romain romain = new Romain("name", 2);
		romain.equip[nbEquipement] = Equipement.Bouclier;
		System.out.println(romain.equip[]);
	}
}
