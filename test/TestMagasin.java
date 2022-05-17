import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.AssertEquals.assertEquals;
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
        ChargeurMagasin m = new ChargeurMagasin("./musicbrainzSimple");
        Magasin magasin = m.chargerMagasin();
        CD cd1 = new CD("Antonin","Alors la zone");
        CD cd2 = new CD("Amhed","gpasdidee");
        CD cd3 = new CD("s","oui");
        ArrayList<CD> liste = null;
        liste.add(cd3);
        liste.add(cd1);
        liste.add(cd2);
        liste.trier
        assertEquals;
    }

}
