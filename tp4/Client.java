import java.util.HashMap;
import java.util.Random;

public class Client {
	private String nom;
	private String prenom;
	private int idClient;
	private HashMap<Integer, Produit> commande;
	
	public Client(String nom, String prenom, int idClient) {
		this.nom = nom;
		this.prenom = prenom;
		this.idClient = idClient;
		this.commande = new HashMap<Integer, Produit>();
	}
	
	public Random commander() {
		Random id = new Random(); 
		return id;
	}
	
	public void ajouterProduit(Integer id, Produit produit) {
		this.commande.put(id, produit);
	}
	
	public afficherCommande() {

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", idClient=" + idClient + ", commande=" + commande + "]";
	}
	
	
}
