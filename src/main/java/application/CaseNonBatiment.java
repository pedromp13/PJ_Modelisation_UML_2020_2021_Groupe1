package application;

public class CaseNonBatiment  extends Case{
    public CaseNonBatiment(){}
}
class etendueEau extends  CaseNonBatiment{
    //autoriser le personnage a aller se baigner
    public void aller(personnage perso){
        if(perso.maillot == true){
            System.out.println("le personnage peut aller se baigner");
        }
        else {
            System.out.println("le personnage n'a pas de maillot de bain");

        }

    }
}
class forêt extends CaseNonBatiment{
    //risque de tomber malade
    public void tomberMalade(personnage perso){
        perso.malade();
    }
}
//pour la case grise c'est deja fait dans la ville

class  route extends CaseNonBatiment{
    public void piegeFeuRouge(personnage perso){
        perso.setVie(-1);
    }
    public void piegePolice(personnage perso){
        perso.setMoral(-1);
    }
    public void piegeNidPoule(personnage perso){
        perso.setHydratation(-2);
        perso.setSatiété(-2);
    }

}
class  trottoir extends CaseNonBatiment{
    public void piegeBanane(personnage perso){
        perso.setVie(-3);
    }
    public void piegePoussette(personnage perso){
        perso.setMoral(-2);
    }
    public void piegeDejection(personnage perso){
        perso.setSatiété(-1);
    }
}
