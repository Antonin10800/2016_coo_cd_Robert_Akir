package TriDonnees;

import donnees.CD;

public class ComparateurAlbum implements ComparateurCd{
    @Override
    public boolean etreAvant(CD cd, CD cd2) {
        boolean res = false;
        String Album1 = cd.getNomCD();
        String Album2 = cd2.getNomCD();
        int a = Album1.compareTo(Album2);
        if(a<0){
            res= true;

        }
    return res;
    }
}
