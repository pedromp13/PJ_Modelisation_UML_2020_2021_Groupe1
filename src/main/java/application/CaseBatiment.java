package application;

public class CaseBatiment extends Case{
    public CaseBatiment(){}

}
class maison extends CaseBatiment{

    private  String nom = "maison";
    public maison(String nom){
        this.nom=nom;
    }
    public String getName(){
        return nom;
    }
}
class université extends CaseBatiment{
    private  String nom = "université";
    public université(String nom){
        this.nom=nom;
    }
    public String getName(){
        return nom;
    }


}
class fastfood extends CaseBatiment{
    private  String nom = "fastfood";
    public fastfood(String nom){
        this.nom=nom;
    }
    public String getName(){
        return nom;
    }

}
class bibliotheque extends CaseBatiment{
    private  String nom = "bibliotheque";
    public bibliotheque(String nom){
        this.nom=nom;
    }
    public String getName(){
        return nom;
    }

}
class bar extends CaseBatiment {
    private String nom = "bibliotheque";

    public bar(String nom) {
        this.nom = nom;
    }

    public String getName() {
        return nom;
    }

}
 class Main {
    public static void main(String[] args) {
        bar un = new bar("essaid");
        String result =un.getName();
        System.out.println("je suis le bar a :");
        System.out.println(result);
    }
}


