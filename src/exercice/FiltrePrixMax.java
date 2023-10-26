package exercice;

class FiltrePrixMax extends FiltreProduit {
    private double prixMax;

    FiltrePrixMax(double prixMax) {
        this.prixMax = prixMax;
    }

    @Override
    boolean filtre(Produit produit) {
        return produit.getPrix() <= prixMax;
    }
}