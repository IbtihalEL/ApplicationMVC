package metier.manager.bean;

public class Livre {

		String titre;
		int prix;
		int nombreExemplaire;
		String domaine;
		
		public String getDomaine() {
			return domaine;
		}

		public void setDomaine(String domaine) {
			this.domaine = domaine;
		}

		public Livre() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public int getPrix() {
			return prix;
		}
		public void setPrix(int prix) {
			this.prix = prix;
		}
		public int getNombreExemplaire() {
			return nombreExemplaire;
		}
		public void setNombreExemplaire(int nombre) {
			this.nombreExemplaire = nombre;
		}
		
		
		
}
