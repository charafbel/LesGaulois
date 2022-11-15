package personnages;

public class Romain {
	private String nom; 
	private int force;
	private Equipement[] equip;
	private int nbEquipement = 0;
	private String texte;
	
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

	//public void recevoirCoup(int forceCoup) {
	//      force -= forceCoup;
	//      if (force > 0) {
	//    	  parler("Aïe");} 
	//      else { 
	//    	  parler("J'abandonne...");}
	//}
	
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
		default:
			System.out.println(getNom()+" n'est pas equipé");
		}
	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
        Equipement[] equipementEjecte = null;
        // précondition
        assert force > 0;
        int oldForce = force;
        forceCoup = CalculResistanceEquipement(forceCoup);
        //if (force > 0) {
        //	parler("Aïe");
        //} 
        //else {
	    //     equipementEjecte = ejecterEquipement();
	    //     parler("J'abandonne...");
        //}
        switch(force){
        case 0:
             parler("Aïe");
             break;
        default:
            equipementEjecte = ejecterEquipement();
            parler("J'abandonne...");
            break;
       }
       // post condition la force a diminuée
       assert force < oldForce;
       return equipementEjecte;
	}
	
	private int CalculResistanceEquipement(int forceCoup) {
        texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
        int resistanceEquipement = 0;
        if (nbEquipement != 0) {
             texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
             for (int i = 0; i < nbEquipement;) {
                  if ((equip[i] != null && equip[i].equals(Equipement.BOUCLIER))) {
                       resistanceEquipement += 8;
                  } else {
                       System.out.println("Equipement casque");
                       resistanceEquipement += 5;
                  }}
             texte += resistanceEquipement + "!";
        }
        parler(texte);
        forceCoup -= resistanceEquipement;
        return forceCoup;
}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equip[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equip[i];
				nbEquipementEjecte++;
				equip[i] = null;
			}
		}
		return equipementEjecte;
	}

	
}
