package application;

public  class personnage {
    protected int vie;
    protected int hydratation;
    protected int satiété;
    protected int moral;
    protected int diplome;
    protected String pseudo;
    protected int xPerso;
    protected int yPerso;

    public personnage(int type, String pseudo) {
        //1->standard 2->hyppie 3 ->pressé
        switch (type) {
            case 1:
                this.vie = 75;
                this.hydratation = 75;
                this.satiété = 75;
                this.moral = 75;
                this.diplome = 0;
                this.pseudo = pseudo;
                this.xPerso = 0;
                this.yPerso = 0;
                break;
            case 2:
                this.vie = 75;
                this.hydratation = 50;
                this.satiété = 50;
                this.moral = 100;
                this.diplome = 0;
                this.pseudo = pseudo;
                this.xPerso = 0;
                this.yPerso = 0;
                break;

            case 3:
                this.vie = 100;
                this.hydratation = 75;
                this.satiété = 75;
                this.moral = 50;
                this.diplome = 0;
                this.pseudo = pseudo;
                this.xPerso = 0;
                this.yPerso = 0;
                break;

            default:
                System.out.println("ce type de personnage n'existe pas ");

        }
    }

    public int getVie() {
        return vie;
    }

    public int getMoral() {
        return moral;
    }

    public int getHydratation() {
        return hydratation;
    }

    public int getSatiété() {
        return satiété;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getDiplome() {
        return diplome;
    }

    public int getxPerso() {
        return xPerso;
    }

    public int getyPerso() {
        return yPerso;
    }

    public void setVie(int vie) {
        this.vie += vie;
    }

    public void setMoral(int moral) {
        this.moral += moral;
    }

    public void setHydratation(int hydratation) {
        this.hydratation += hydratation;
    }

    public void setSatiété(int satiété) {
        this.satiété += satiété;
    }

    public void setDiplome(int diplome) {
        this.diplome += diplome;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setxPerso(int xPerso) {
        this.xPerso = xPerso;
    }

    public void setyPerso(int yPerso) {
        this.yPerso = yPerso;
    }
    //savoir si personnage est toujours  en vie
    public boolean vivant(personnage perso){
        if(perso.vie == 0 || perso.hydratation == 0 || perso.moral == 0 || perso.satiété==0){
            return false;
        }
        else{
            return true ;
        }

    }
    public void malade(personnage perso){

        if (perso.vie > 10){
            perso.setMoral(-10);
        }
        else{
            System.out.println("le personnage " +perso.getPseudo() +" est mort" );
        }

    }



    //methode pour deplacer le personnage dans la ville
    public void deplacerPersonnage(int direction) {
        switch (direction) {
            //droite
            case 1:
                this.xPerso++;
                break;
            //gauche
            case 2:
                this.xPerso--;
                break;
            //haut
            case 3:
                this.yPerso++;
                break;
            //bas
            case 4:
                this.yPerso--;
                break;
            default:
                System.out.println("la direction choisit n'est pas connu ");


        }
    }

}
class main{

    public static void main(String[] args) {
            personnage perso= new personnage(3,"essaid") ;
            boolean vivant = perso.vivant(perso);
            if (vivant == true){
                System.out.println("je suis vivant ");

            }
            else{
                System.out.println("je suis mort ");

            }


        }
}






