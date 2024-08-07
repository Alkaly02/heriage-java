package models;

public class CompteBancaire {
	private double solde;
	private String titulaire;
	
	public CompteBancaire(double solde, String titulaire) {
		this.solde = solde;
		this.titulaire = titulaire;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getSolde() {
		return this.solde;
	}
	
	public String getTitulaire() {
		return this.titulaire;
	}
	
	public void deposer(double montant) {
		if(montant < 100) {
			System.out.println(this.titulaire + " nioune 100F ba ci kaw lagni dieul, "+ montant + "F doyoul");
		}else {
			this.solde += montant;
		}
	}
	public void retirer(double montant) {
		if(this.solde < montant) {
			System.out.println(this.titulaire + " sa xaliss doyoul!, danga doucoure saway :)");
		}else {
			this.solde -= montant;
		}
	}
	public void consulterSolde() {
		System.out.println("Titulaire: " + this.getTitulaire() + "\n" + 
							"Solde: " + this.getSolde());
	}
}
