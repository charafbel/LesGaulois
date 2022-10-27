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
	
	public void sEquiper (Equipement newEquip) {
		switch(nbEquipement){
		case 0 : 
			equip[0] = newEquip;
			nbEquipement ++;
			System.out.println("Le soldat " + getNom() +" s'équipe avec un/une "+ newEquip.toString());
			break;
		case 1 : 	
			if(newEquip == equip[0]) {
				System.out.println("Le soldat "+ getNom()+" posséde déja un "+ equip[0].toString()+" !");
			}
			else{
				equip[1] = newEquip;
				nbEquipement ++;
				System.out.println("Le soldat " + getNom() +" s'équipe avec un/une "+ newEquip.toString());
			}
			break;
		case 2:		
			System.out.println(getNom()+" est deja bien protégé");
			break;
		}
	}
}
