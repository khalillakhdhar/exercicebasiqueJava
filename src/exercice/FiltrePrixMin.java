package exercice;

class FiltrePrixMin extends FiltreProduit {
    private double prixMin;

    FiltrePrixMin(double prixMin) {
        this.prixMin = prixMin;
    }

    @Override
    boolean filtre(Produit produit) {
        return produit.getPrix() >= prixMin;
    }
}
