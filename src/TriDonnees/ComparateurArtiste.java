package TriDonnees;

import donnees.CD;

public class ComparateurArtiste implements ComparateurCd{
    @Override
    public boolean etreAvant(CD cd, CD cd2) {
        boolean res = false;
        String artiste1 = cd.getNomArtiste();
        String artiste2 = cd2.getNomArtiste();
        int a = artiste1.compareTo(artiste2);
        if(a<0){
            res = true;
        }
        return res;
    }


}
