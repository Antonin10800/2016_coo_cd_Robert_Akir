package donnees;

import XML.ChargeurMagasin;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder à un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	// TODO  ajouter une methode de tri
public void triCD(){
		int taille = listeCds.size();
		int compteur = 1; //place qui se décale vers la droite pour savoir ce qui est deja trier
		CD min = listeCds.get(0);
		for(int a=0;a<(listeCds.size()-1);a++){ //Boucle qui répete le parcour de tri pleins de fois


		for(int i=compteur; i<taille;i++){ // boucle pour parcourir les valeurs qui restent à trier
			// on trouve le plus petit
			CD temp = listeCds.get(i);

			int res =temp.comparerCDs(min);
			if(res<0){
				min = listeCds.get(i);

			}

		}
		//echanger2CD();
		}
}
public void echanger2CD(CD CDPlusPetit, CD cdABouger){
		int placeCDPlusPetit = listeCds.indexOf(CDPlusPetit);
		int placeCDABouger = listeCds.indexOf(cdABouger);
		listeCds.add(placeCDABouger, CDPlusPetit);// on bouge le cd bon
		listeCds.add(placeCDPlusPetit,cdABouger);
}
public int compareCd(CD cd1, CD cd2){
		int res;
		res =cd1.getNomCD().compareTo(cd2.getNomCD());
		return res;
}

	public static void main(String[] args) throws FileNotFoundException {
		ChargeurMagasin n = new ChargeurMagasin("./musicbrainzSimple");
		Magasin m = n.chargerMagasin();
		m.triCD();
		System.out.println(m);
	}
}
