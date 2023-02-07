package magasin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestProduit {

    @Test
    void TestGetPrixCat1(){
        Produit produit = new Produit("Sacoche lacoste pour mettre des 10", 1, 50);
        Assertions.assertEquals( 40, produit.getPrix());
    }

    @Test
     void TestGetPrixCat2(){
        Produit produit = new Produit("Petites TN", 2, 120);
        Assertions.assertEquals(60, produit.getPrix());
    }

    @Test
     void TestGetPrixCat3(){
        Produit produit = new Produit("Nike bien falsh", 3, 80);
        Assertions.assertEquals(24, produit.getPrix() );
    }

    @Test
    void TestGetPrixSansCat(){
        Produit produit = new Produit("Chemise à carreau", 60);
        Assertions.assertEquals(60, produit.getPrix());
    }
}
