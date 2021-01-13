package application;

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

}
class test {
    public static void main(String[] args) {
        bar un = new bar();
        personnage me= new personnage(1,"essaid");
        char result =un.getName();
        System.out.println("je suis le bar a :");
        System.out.println(result);
        un.ressourcer(me);

        System.out.println("je viens de passer dans un bar mon hydratation a augmenter de 25 : " + me.getHydratation());
    }
}


