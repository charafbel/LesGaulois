package personnages;
import java.util.*;

public class Druide {
	private String nom; 
	private static int effetPotionMin; 
	private static int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	      this.nom = nom;
	      this.effetPotionMin = effetPotionMin;
	      this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
	                + effetPotionMax + ".");
	}
	
	public String getNom() {
	      return nom;
	}
	
	
	public void parler(String texte) {
	      System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
	      return "Le druide " + nom + " du village: ";
	}
	
	public void preparerPotion(int effetPotionMin, int effetPotionMax) {
	    Random val = new Random();
	    forcePotion = val.nextInt((effetPotionMax - effetPotionMin)) + effetPotionMin;
	    String Text = forcePotion + "";
	    if (forcePotion > 7)  {
	    	parler("J'ai préparé une super potion de force : " + Text);
	    }
	    else {
	    	parler("Je n'ai pas trouvé tous les ingredients ma potion est seulement de force : " + Text);
	    }
	}
	
	public void booster(Gaulois Perso) {
		String name = Perso.getNom();
		if (name == "Obélix") {
			parler("Non, Obélix !... Tu n'auras pas de potion magique");
		}
		else {
			Perso.boirePotion(forcePotion);
		}
	}
	
	public void main(int effetPotionMin, int effetPotionMax) {
		Druide panoramix = new Druide("panoramix", effetPotionMin, effetPotionMax);
		preparerPotion(effetPotionMin, effetPotionMax);
	}
}