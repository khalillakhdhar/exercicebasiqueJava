package exercice;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GestionProduits gestionProduits = new GestionProduits();

        gestionProduits.ajouterProduit("Produit 1", 10.0);
        gestionProduits.ajouterProduit("Produit 2", 20.0);
        gestionProduits.ajouterProduit("Produit 3", 15.0);
        gestionProduits.ajouterProduit("Produit 4", 30.0);

        System.out.println("Tous les produits :");
        gestionProduits.afficherProduits();

        FiltrePrixMin filtreMin = new FiltrePrixMin(20.0);
        FiltrePrixMax filtreMax = new FiltrePrixMax(25.0);

        Set<Produit> produitsFiltresMin = gestionProduits.filtrerProduits(filtreMin);
        System.out.println("Produits avec un prix supérieur ou égal à 20 :");
        for (Produit produit : produitsFiltresMin) {
            System.out.println("ID : " + produit.getId() + ", Nom : " + produit.getNom());
        }

        Set<Produit> produitsFiltresMax = gestionProduits.filtrerProduits(filtreMax);
        System.out.println("Produits avec un prix inférieur ou égal à 25 :");
        for (Produit produit : produitsFiltresMax) {
            System.out.println("ID : " + produit.getId() + ", Nom : " + produit.getNom());
        }
    }
}