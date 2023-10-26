package exercice;

import java.util.HashSet;
import java.util.Set;

class GestionProduits {
    private static int prochainId = 1; // Variable statique pour gérer les ID uniques
    private final double TVA = 0.20; // Variable finale pour la TVA
    private Set<Produit> produits = new HashSet<>();

    void ajouterProduit(String nom, double prix) {
        Produit produit = new Produit(prochainId, nom, prix);
        produits.add(produit);
        prochainId++;
    }

    void afficherProduits() {
        System.out.println("Liste des produits :");
        for (Produit produit : produits) {
            double prixAvecTVA = produit.getPrix() * (1 + TVA);
            System.out.println("ID : " + produit.getId() + ", Nom : " + produit.getNom() + ", Prix avec TVA : " + prixAvecTVA);
        }
    }

    Set<Produit> filtrerProduits(FiltreProduit filtre) {
        Set<Produit> produitsFiltres = new HashSet<>();
        for (Produit produit : produits) {
            if (filtre.filtre(produit)) {
                produitsFiltres.add(produit);
            }
        }
        return produitsFiltres;
    }
}
