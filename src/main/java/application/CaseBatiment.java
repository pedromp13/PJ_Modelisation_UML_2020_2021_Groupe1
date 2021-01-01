package application;

public class CaseBatiment extends Case{
    public CaseBatiment(){}

}
class maison extends CaseBatiment{

    private  String nom ;
    public maison(){
        this.nom="M";
    }
    public String getName(){
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setMoral(10);
        perso.setSatiété(10);
        perso.setHydratation(10);
    }
}
class université extends CaseBatiment{
    private  String nom ;
    public université(){
        this.nom="U";
    }
    public String getName(){
        return nom;
    }


}
class fastfood extends CaseBatiment{
    private  String nom ;
    public fastfood(){
        this.nom="F";
    }
    public String getName(){
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
    private  String nom ;
    public bibliotheque(){
        this.nom="b";
    }
    public String getName(){
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setMoral(20);
    }
}
class bar extends CaseBatiment {
    private String nom ;

    public bar(){
        this.nom="B" ;
    }
    public String getName() {
        return nom;
    }
    public void ressourcer(personnage perso){
        perso.setHydratation(25);
        perso.setMoral(10);
        perso.setVie(-3);
    }

}
 class Main {
    public static void main(String[] args) {
        bar un = new bar();
        personnage me= new personnage(1,"essaid");
        String result =un.getName();
        System.out.println("je suis le bar a :");
        System.out.println(result);
        un.ressourcer(me);
        System.out.println("je viens de passer dans un bar mon hydratation a augmenter de 25 : " + me.getHydratation());
    }
}


