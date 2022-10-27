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
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("Obélix", 9);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(5, 10);
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste");
		asterix.parler("Bonjour");
		panoramix.booster(asterix);
		minus.parler("Un Gau... Un GAUGAU...");
		asterix.frapper(minus);
	}
}
