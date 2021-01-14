package application;

import java.util.Random;


public class CaseBatiment {
    public CaseBatiment(){}

}
class maison extends CaseBatiment{

    private  char nom ;
    public maison(){
        this.nom='M';
    }
    public char getName(){
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setMoral(10);
        perso.setSatiété(10);
        perso.setHydratation(10);
    }

}
class université extends CaseBatiment{
    private  char nom ;
    public université(){
        this.nom='U';
    }
    public char getName(){
        return nom;
    }
    public void passerExamem(personnage perso){
        int pourcentage=perso.getpourcentageDiplome();
        Random rand=new Random();
        int rando=rand.nextInt(100 - 1) +1;
        if (rando<pourcentage){
            perso.setDiplome(1);
            System.out.println("vous avez reussi votre exament");
            perso.setpourcentageDiplome(0);
        }
        else {
            perso.setpourcentageDiplome(pourcentage+30);
        }


    }



}
class fastfood extends CaseBatiment{
    private  char nom ;
    public fastfood(){
        this.nom='F';
    }
    public char getName(){
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setSatiété(25);
        perso.setHydratation(10);
        perso.setMoral(10);
        perso.setVie(-5);
    }

}
class bibliotheque extends CaseBatiment{
    private  char nom='b' ;
    public bibliotheque(){
        this.nom='b';
    }
    public char getName(){
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setMoral(20);
    }
    public void foundBook(personnage perso) {
        int pourcentage=perso.getpourcentageDiplome();
        Random rand=new Random();
        int rando=rand.nextInt(100 - 1) +1;
        if (rando<5){
            perso.setpourcentageDiplome(pourcentage+10);
        }
    }
}
class bar extends CaseBatiment {
    private char nom ;

    public bar(){
        this.nom='B' ;
    }
    public char getName() {
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setHydratation(25);
        perso.setMoral(10);
        perso.setVie(-3);
    }
    public void foundCopie(personnage perso) {
        int pourcentage=perso.getpourcentageDiplome();
        Random randi=new Random();
        int rando=randi.nextInt(100 - 1) +1;
        if (rando<5){
            perso.setpourcentageDiplome(pourcentage+5);
        }
    }

}


