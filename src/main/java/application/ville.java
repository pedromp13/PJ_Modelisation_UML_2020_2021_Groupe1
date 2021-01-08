package application;

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
        //placer un element dans batiment
    public void placer(int x, int y, char t) {

        // Test si on se trouve bien dans la grille.
        if(x < 0 || y < 0 || x > n || y > m) {

            System.out.print("Erreur de placement.");
            return;
        }

        if(ville[x][y] == '.') // on place l'element t
        {
            ville[x][y] = t;
            return;
        }
        else if(ville[x][y] == 'x')
        { // si la case est une case grise
            System.out.println("c'est une case grise impossible de s'y rendre");
            return;
        }
        else
        {
            System.out.print("Erreur, cet emplacement n'est pas vide.");
             return;
        }


    }





}
class Test {
    public static void main(String[] args) {
        ville avignon = new ville(10, 10);
        personnage perso= new personnage(1,"P");
        //batiments de la ville
        avignon.placer(7, 1, 'B');// bar
        avignon.placer(1, 8, 'U');//université
        avignon.placer(5, 6, 'F');//fastfood
        avignon.placer(1, 1, 'M');//maison
        avignon.placer(7, 8, 'b');//bibiotheque
        //avignon.placer(perso.getxPerso(),perso.getyPerso(),'S');
        //placement des routes
        avignon.placer(1, 2, '=');//route entre maison et universite
        avignon.placer(1, 3, '=');
        avignon.placer(1, 4, '=');
        avignon.placer(1, 5, '=');
        avignon.placer(1, 6, '=');
        avignon.placer(1, 7, '=');

        avignon.placer(1, 8, '=');//université
        avignon.placer(2, 8, '=');
        avignon.placer(3, 8, '=');
        avignon.placer(4, 8, '=');
        avignon.placer(5, 8, '=');
        avignon.placer(5, 8, '=');
        avignon.placer(6, 8, '=');

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
        avignon.placer(4, 7, 'X');
        avignon.placer(4, 6, 'X');
        avignon.placer(3, 7, 'X');
        avignon.placer(3, 6,'X');
        //placement de la forêt
        avignon.placer(2, 2, 'f');
        avignon.placer(2, 3, 'f');
        avignon.placer(3, 2, 'f');
        avignon.placer(3, 3,'f');
        avignon.placer(2, 4, 'f');
        avignon.placer(3, 4,'f');
        //placement des etendues d'eau
        avignon.placer(4, 2, 'e');
        avignon.placer(4, 3,'e');
        avignon.placer(5, 2, 'e');
        avignon.placer(5, 3,'e');













        perso.deplacerPersonnage(3);// gauche
        perso.deplacerPersonnage(3);// gauche
        perso.deplacerPersonnage(3);
        perso.deplacerPersonnage(3);
        perso.deplacerPersonnage(2);
        perso.deplacerPersonnage(1);//bas


      //  perso.deplacerPersonnage(4);

        //avignon.placer(perso.getxPerso(),perso.getyPerso(),'S');
        System.out.println( "ligne "+perso.getxPerso());
        System.out.println("colonne "+perso.getyPerso());
        avignon.afficher();
        

    }
}

