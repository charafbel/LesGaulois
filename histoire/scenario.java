package histoire;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Village;

public class scenario {
	private Chef chef;
	private Gaulois gaulois;
	private Village village;
	private Romain romain;
	private Druide druide;

	public scenario(Chef chef, Gaulois gaulois, Village village, Romain romain, Druide druide) {
		super();
		this.chef = chef;
		this.gaulois = gaulois;
		this.village = village;
		this.romain = romain;
		this.druide = druide;
	}
	
	

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8, 1);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour a tous !");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.parler("Aïe");
		asterix.frapper(minus);
		minus.parler("Aïe");
		asterix.frapper(minus);
		minus.parler("J'abandonne");
	}

}
