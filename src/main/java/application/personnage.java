package application;

public abstract class personnage {
    protected int vie ;
    protected int hydratation;
    protected int satiété;
    protected int moral;
    protected int diplome;
    protected String pseudo;
    public personnage(int vie,int hydratation, int satiété,int moral,int diplome,String pseudo){
        this.vie=vie;
        this.hydratation=hydratation;
        this.satiété=satiété;
        this.moral=moral;
        this.diplome=diplome;
        this.pseudo=pseudo

    }
    public String afficher(){

    }
}
class standard extends personnage{
    public standard(){
        this.vie=75;
        this.hydratation=75;
        this.satiété=75;
        this.moral=75;
    }
}
class hippie extends personnage{
    public hippie(){
        this.vie=75;
        this.hydratation=50;
        this.satiété=50;
        this.moral=100;

    }
}
class pressé extends personnage{

    public pressé(){
        this.vie=100;
        this.hydratation=75;
        this.satiété=75;
        this.moral=50
    }
}
