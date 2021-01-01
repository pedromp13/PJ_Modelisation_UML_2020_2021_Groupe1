package application;

public class ville {
        public int n;//nombre colonne

        public int m;//nombre de ligne

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
            ville[x][x] = t;
        }
        else
        {
            System.out.print("Erreur, cet emplacement n'est pas vide.");
            return;
        }


    }



}
