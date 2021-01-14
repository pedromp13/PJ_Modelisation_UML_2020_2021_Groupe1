package application;


import java.util.Random;
import java.util.Scanner;

public class ville {
        public int n;//nombre de ligne

        public int m;//nombre de colonne

        public char [][] ville;

        // Constructeur

        public ville(int x, int y) {

            this.n = x;
            this.m = y;

            ville = new char[n][m];

            for(int i = 0; i < n ; i++) {

                for(int j = 0 ; j < m; j++) {

                    ville[i][j] = '.';
                }
            }

        }

        // pour acceder a une case

        public char getCase(int x, int y) {

            return ville[x][y];

        }

        // Methode

        public void afficher() {

            for(int i = 0; i < n ; i++) {

                for(int j = 0 ; j < m ; j++) {

                    System.out.print(" | " + ville[i][j]);
                }

                System.out.println(" | ");
            }


        }


      //placer aleatoirement les pieges dans les trottoir et les routes
    public static boolean placePiege () {
        Random random = new Random();
        int ran=random.nextInt(100 - 1) +1;
        if (ran<6)return true;
        else return false;
    }


package application;


import java.util.Random;
import java.util.Scanner;

public class ville {
        public int n;//nombre de ligne

        public int m;//nombre de colonne

        public char [][] ville;

        // Constructeur

        public ville(int x, int y) {

            this.n = x;
            this.m = y;

            ville = new char[n][m];

            for(int i = 0; i < n ; i++) {

                for(int j = 0 ; j < m; j++) {

                    ville[i][j] = '.';
                }
            }

        }

        // pour acceder a une case

        public char getCase(int x, int y) {

            return ville[x][y];

        }

        // Methode

        public void afficher() {

            for(int i = 0; i < n ; i++) {

                for(int j = 0 ; j < m ; j++) {

                    System.out.print(" | " + ville[i][j]);
                }

                System.out.println(" | ");
            }


        }


      //placer aleatoirement les pieges dans les trottoir et les routes
    public static boolean placePiege () {
        Random random = new Random();
        int ran=random.nextInt(100 - 1) +1;
        if (ran<6)return true;
        else return false;
    }



        //placer un element dans batiment

    public void placer(int x, int y, char t) {
            // Test si on se trouve bien dans la grille.
        if(x < 0 || y < 0 || x > n || y > m) {

            System.out.print("Erreur de placement.");
            return;
        }

        if(ville[x][y] == '.')
        {
            if (t=='-'){ // placer les pieges sur les trottoir et les routes
                boolean piege=placePiege();
                if (piege == true){
                    ville[x][y]='%' ;
                    return;
                }
                else{
                    ville[x][y]=t;
                    return ;
                }
            }
            else if(t=='='){
                boolean piege=placePiege();
                if (piege == true){
                    ville[x][y]='$' ;
                    return;
                }
                else{
                    ville[x][y]=t;
                    return ;
                }

            }
            else {
                ville[x][y] = t;
                return;
            }
        }
        //personnage deplace sur le trottoir ou sur une route
        else if(ville[x][y] =='-' || ville[x][y] == '=' ){
            ville[x][y] = t;
            return;
        }
        //personnage dans la maison
        else if(ville[x][y] == 'M'  ){

            System.out.println("personage est dans la maison ");


        }
        //personnage dans l'université
        else if (ville[x][y] == 'U'){
            System.out.println("personage est entree dans l'université");

        }
        //personnage dans le fastFoot
        else if(ville[x][y] =='F'){
            System.out.println("personage est entree dans le Fastfood");

        }
        //personnage en bibiotheque
        else if(ville[x][y] =='b'){
            System.out.println("personage est entree dans la bibiotheque");

        }
        //personnage en bar
        else if(ville[x][y] =='B'){
            System.out.println("personage est entree dans le Bar");


        }
        //case non batiments
        else if(ville[x][y] =='f'){

            System.out.println("personage est entree dans la foret");
            ville[x][y] = t;
            return;

        }
        //personage dans un entendu d'eau
        else if(ville[x][y] =='e'){
            System.out.println("personage est entree dans un etendue d'eau");
            ville[x][y] = t;
            return;

        }
        //case grise
        else if(ville[x][y] == 'X')
        { // si la case est une case grise
            System.out.println("c'est une case grise impossible de s'y rendre ! il faut sortir immédiatement ");
            return;
        }
   
    }


    public char getcasesuiv(personnage perso, int dir) {
    	char n = 0;
    	  switch (dir) {
          //bas
          case 1:
        	  n=this.getCase(perso.getxPerso()+1,perso.getyPerso());
        	  return n;
              
          //haut
          case 2:
        	  n=this.getCase(perso.getxPerso()-1,perso.getyPerso());
        	  return n;
              
          //droite
          case 3:
        	  n=this.getCase(perso.getxPerso(),perso.getyPerso()+1);
        	  return n;
             
          //gauche
          case 4:
        	  n=this.getCase(perso.getxPerso(),perso.getyPerso()-1);
        	  return n;
             
         }
    	 return n;
    }
    
   
    public static void verifPosition(ville avignon,personnage perso, maison batM,université batU,bar batB,bibliotheque batb,fastfood batF,forêt f,etendueEau e) {
	    char position=avignon.getCase(perso.getxPerso(),perso.getyPerso());
	    if(position=='M'){
	        batM.ressourcer(perso);
	    }
	    else if (position=='U') {
	    	batU.passerExamem(perso);
	    }
	    else if(position=='B'){
	        batB.ressourcer(perso);
	        batB.foundCopie(perso);
	    }
	    else if( position=='F'){
	        batF.ressourcer(perso);
	    }
	    else if(position=='b'){
	        batb.ressourcer(perso);
	        batb.foundBook(perso);
	    }
	    else if(position=='f'){
	        f.tomberMalade(perso);
	        System.out.println("Le Personnage malheureusement est tomber Malade -10 sur sa  barre de vie");
	
	    }
	    else if( position=='e'){
	        e.aller(perso);
	    }
	}


    public static void main(String[] args) {
        ville avignon = new ville(10, 10);
        personnage perso= new personnage(1,"V");
        //batiments de la ville
        bar batB = new bar();
        avignon.placer(7, 1, batB.getName());// bar
        université batU = new université();
        avignon.placer(1, 8, batU.getName());//université
        fastfood batF=new fastfood();
        avignon.placer(5, 6, batF.getName());//fastfood
        maison batM =new maison();
        avignon.placer(1, 1, batM.getName());//maison
        bibliotheque batb =new bibliotheque();
        avignon.placer(7, 8, batb.getName());//bibiotheque

        //placement des routes
        avignon.placer(1, 2, '=');//route entre maison et universite
        avignon.placer(1, 3, '=');
        avignon.placer(1, 4, '=');
        avignon.placer(1, 5, '=');
        avignon.placer(1, 6, '=');
        avignon.placer(1, 7, '=');



        avignon.placer(2, 8, '=');
        avignon.placer(3, 8, '=');
        avignon.placer(4, 8, '=');
        avignon.placer(5, 8, '=');

        avignon.placer(6, 8, '=');
        avignon.placer(5, 7, '=');

        avignon.placer(7, 7, '=');//bibiotheque
        avignon.placer(7, 6,'=');
        avignon.placer(7, 5, '=');
        avignon.placer(7, 4, '=');
        avignon.placer(7, 3, '=');
        avignon.placer(7, 2, '=');

        avignon.placer(6, 1, '=');// bar
        avignon.placer(5, 1, '=');
        avignon.placer(6, 1, '=');
        avignon.placer(5, 1, '=');
        avignon.placer(4, 1, '=');
        avignon.placer(3, 1, '=');
        avignon.placer(2, 1, '=');

        //placement des trottoir
        //trottoir entre la maison et le bar
        avignon.placer(1, 0, '-');
        avignon.placer(2, 0, '-');
        avignon.placer(3, 0, '-');
        avignon.placer(4, 0, '-');
        avignon.placer(5, 0, '-');
        avignon.placer(6, 0, '-');
        avignon.placer(7, 0, '-');
        //trottoir entre la maison et l'université

        avignon.placer(0, 1, '-');
        avignon.placer(0, 2, '-');
        avignon.placer(0, 3, '-');
        avignon.placer(0, 4, '-');
        avignon.placer(0, 5, '-');
        avignon.placer(0, 6, '-');
        avignon.placer(0, 7, '-');
        avignon.placer(0, 8, '-');
        //trottoir entre l'université et la bibiotheque

        avignon.placer(1, 9, '-');
        avignon.placer(2, 9, '-');
        avignon.placer(3, 9, '-');
        avignon.placer(4, 9, '-');
        avignon.placer(5, 9, '-');
        avignon.placer(5, 9, '-');
        avignon.placer(6, 9, '-');
        avignon.placer(7, 9, '-');
        //trottoir entre la bibiotheque et le bar

        avignon.placer(8, 8, '-');
        avignon.placer(8, 7, '-');
        avignon.placer(8, 6,'-');
        avignon.placer(8, 5, '-');
        avignon.placer(8, 4, '-');
        avignon.placer(8, 3, '-');
        avignon.placer(8, 2, '-');
        avignon.placer(8, 1, '-');

        //placement des case grises
        avignon.placer(0, 0, 'X');
        avignon.placer(0, 9, 'X');
        avignon.placer(9, 9, 'X');
        avignon.placer(8, 9,'X');
        avignon.placer(4, 7, 'X');
        avignon.placer(4, 6, 'X');
        avignon.placer(3, 7, 'X');
        avignon.placer(3, 6,'X');
        avignon.placer(9, 8, 'X');
        avignon.placer(9, 7, 'X');
        avignon.placer(9, 6, 'X');
        avignon.placer(9, 5,'X');
        avignon.placer(9, 4, 'X');
        avignon.placer(9, 3, 'X');
        avignon.placer(9, 2,'X');
        avignon.placer(9, 1, 'X');
        avignon.placer(9, 0,'X');
        avignon.placer(8, 0, 'X');
        avignon.placer(7, 0, 'X');
        avignon.placer(6, 0,'X');
        avignon.placer(5, 0, 'X');
        avignon.placer(4, 0,'X');
        avignon.placer(3, 0,'X');
        avignon.placer(2, 0, 'X');
        avignon.placer(1, 0,'X');
        avignon.placer(2, 5, 'X');
        avignon.placer(2, 6,'X');
        avignon.placer(2, 7, 'X');
        avignon.placer(3, 5,'X');
        avignon.placer(4, 5,'X');
        avignon.placer(5, 5, 'X');
        avignon.placer(6, 5,'X');
        avignon.placer(4, 4,'X');
        avignon.placer(5, 4, 'X');
        avignon.placer(6, 4,'X');
        avignon.placer(6, 2,'X');
        avignon.placer(6, 3, 'X');
        avignon.placer(6, 6,'X');
        avignon.placer(6, 7, 'X');

        //placement de la forêt
        forêt f= new forêt();
        avignon.placer(2, 2,f.getNom() );
        avignon.placer(2, 3, f.getNom());
        avignon.placer(3, 2, f.getNom());
        avignon.placer(3, 3,f.getNom());
        avignon.placer(2, 4,f.getNom());
        avignon.placer(3, 4,f.getNom());

        //placement des etendues d'eau
        etendueEau e=new etendueEau();
        avignon.placer(4, 2, e.getNom());
        avignon.placer(4, 3,e.getNom());
        avignon.placer(5, 2, e.getNom());
        avignon.placer(5, 3,e.getNom());





        //1 bas 2 haut 3 droite 4 gauche
/*
        for(int i =0 ;i<3;i++) {
            Scanner clavier = new Scanner(System.in);
            System.out.print("deplacer le personnage : 1-bas 2-haut 3-droite 4-gauche 5-afficher Les Stats :");
            int direction = clavier.nextInt();
            perso.deplacerPersonnage(direction);
            avignon.placer(perso.getxPerso(), perso.getyPerso(), 'V');
            avignon.afficher();
        }
        */








        
        int i=0;
        int j=0;
        char cs;
        while(i==0){
        	Scanner clavier = new Scanner(System.in);
            System.out.print("deplacer le personnage :0-stop 1-bas 2-haut 3-droite 4-gauche 5-afficher Les Stats :");
            int direction = clavier.nextInt();
            if (direction==0)i=1;
            else if(direction==5){
            	 System.out.println("Position ligne  :"+perso.getxPerso());
                 System.out.println("Position colonne : "+perso.getyPerso());
                 System.out.println( "moral :"+perso.getMoral());
                 System.out.println("satiete : "+perso.getSatiété());
                 System.out.println( "hydratation :"+perso.getHydratation());
                 System.out.println("vie  :"+perso.getVie());
                 System.out.println( "diplome :"+perso.getDiplome());
                 System.out.println("Pseudo :"+perso.getPseudo());
                 System.out.println("Pourcentage de Reussite :"+perso.getpourcentageDiplome());
            }
            else {
            	 
               avignon.placer(perso.getxPerso(), perso.getyPerso(), 'V');
                 verifPosition(avignon, perso, batM, batU, batB,batb,batF,f, e);
                 avignon.afficher();
                 j++;
            }
            
        }
        
       
       // perso.deplacerPersonnage(3);
 
	       
	   

	       // perso.deplacerPersonnage(3);
	 
		        
        
        System.out.println("Position ligne  :"+perso.getxPerso());
        System.out.println("Position colonne : "+perso.getyPerso());
        System.out.println( "moral :"+perso.getMoral());
        System.out.println("satiete : "+perso.getSatiété());
        System.out.println( "hydratation :"+perso.getHydratation());
        System.out.println("vie  :"+perso.getVie());
        System.out.println( "diplome :"+perso.getDiplome());
        System.out.println("Pseudo :"+perso.getPseudo());
        System.out.println("Pourcentage de Reussite :"+perso.getpourcentageDiplome());

        avignon.placer(perso.getxPerso(),perso.getyPerso(),'V');
        avignon.afficher();
        
        

    }
}


