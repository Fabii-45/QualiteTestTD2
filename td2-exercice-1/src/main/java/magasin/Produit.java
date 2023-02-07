package magasin;

public class Produit {
    private String libelle;
    private double categorie;
    private double prix;

    public Produit(String libelle, double prix) {
        this.libelle = libelle;
        this.prix = prix;
    }
    public Produit(String libelle, double categorie, double prix) {
        this.libelle = libelle;
        this.categorie = categorie;
        this.prix = prix;
    }

    public double getPrix() {
        switch ((int) this.categorie) {
            case 1:
                return this.prix - (this.prix * 0.20);
            case 2:
                return this.prix - (this.prix * 0.50);
            case 3:
                return this.prix - (this.prix * 0.70);
            default:
                return this.prix;
        }
    }

}
