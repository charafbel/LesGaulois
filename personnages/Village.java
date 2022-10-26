package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois gaulois;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		Gaulois[] villageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}
	
	
	public void setChef(Chef chef){
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois, Gaulois[] villageois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int nVillageois, Gaulois[] villageois) {
		return villageois[nVillageois];
	}
	
	public void afficherVillageois(){
		String ch = chef + "";
		System.out.println("Dans le village du chef " + ch + " vivent les légendaires Gaulois");
		for (int i=0; i < nbVillageois; i++){
			String pers = villageois[i] + "";
			System.out.println("-" + pers);
		}
	}
	
	public void main(){
		Village village = new Village("Village des Irréductibles", 30);
		Chef chief = new Chef("Abracourcix", 6, village);
		village.setChef(chief);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix, villageois);
		Gaulois gaulois = village.trouverHabitant(1, villageois);
		System.out.println(gaulois);
	}
	
}
