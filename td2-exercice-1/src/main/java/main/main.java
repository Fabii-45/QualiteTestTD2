package main;

import magasin.Produit;

public class main {
    public static void main(String[] args) {
        Produit produit1 = new Produit("Sacoche lacoste pour mettre des 10", 1, 50);
        Produit produit2 = new Produit("Petites TN", 2, 120);
        Produit produit3 = new Produit("Nike bien falsh", 3, 80);
        Produit produit4 = new Produit("Chemise à carreau", 60);


        System.out.println(produit1.getPrix());
        System.out.println(produit2.getPrix());
        System.out.println(produit3.getPrix());
        System.out.println(produit4.getPrix());
    }
}
