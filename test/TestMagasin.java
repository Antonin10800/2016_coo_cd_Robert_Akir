import TriDonnees.ComparateurAlbum;
import TriDonnees.ComparateurArtiste;
import TriDonnees.ComparateurCd;
import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagasin {

   // @test
    public void test_charger(){


       /* lorsque qu'un répertoire valide est donné (le répertoire d'exemple), la méthode
        chargerMagasin ne lève pas d'exception et retourne bien un magasin avec la
        bonne taille.
• lorsque qu'un répertoire non valide est donné (répertoire inexistant), la méthode
        chargerMagasin lève bien une FileNotFoundException.*/
//        ArithmeticException exception = assertThrows (
//                12 ArithmeticException .class ,
//                13 () -> { divise . diviser (1 , 0) ;}
//        14 ) ;

    }
    @Test
    public void testTriCD() throws FileNotFoundException {
        Magasin magasin = new Magasin();
        CD cd1 = new CD("Zntonin","Zlors la zone");
        CD cd2 = new CD("Amhed","gpasdidee");
        CD cd3 = new CD("s","oui");
        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);
        ComparateurAlbum comparateurAlbum= new ComparateurAlbum();
        ComparateurArtiste comparateurArtiste = new ComparateurArtiste();
        magasin.trier(comparateurAlbum);
        assertEquals(cd1,magasin.getCd(0),"Mauvais cd");

    }
    @Test
    public void testTriCD2() throws FileNotFoundException {

        Magasin magasin = new Magasin();
        CD cd1 = new CD("Zntonin","Alors la zone");
        CD cd2 = new CD("Amhed","gpasdidee");
        CD cd3 = new CD("S","oui");
        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);
        ComparateurAlbum comparateurAlbum= new ComparateurAlbum();
        ComparateurArtiste comparateurArtiste = new ComparateurArtiste();
        magasin.trier(comparateurArtiste);
        assertEquals(cd2,magasin.getCd(0),"Mauvais cd");
    }


}
