package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois gaulois;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	
	public Village(String nom, Chef chef, Gaulois[] villageois, int nbVillageoisMaximum, int nbVillageois, Gaulois gaulois) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.villageois = villageois;
		this.nbVillageois = nbVillageois;
		this.gaulois = gaulois;
	}

	public String getNom() {
		return nom;
	}
	
	
	public void setChef(Chef chef) 
		this.chef = chef;
	}


	public void ajouterHabitant(Gaulois gaulois, Gaulois[] villageois) {
		villageois.add(gaulois);
		nbVillageois++;
		
	}
}
