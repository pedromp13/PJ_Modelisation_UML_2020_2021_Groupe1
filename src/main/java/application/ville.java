package application;

public class ville {
        private int n;//nombre de ligne

        private int m;//nombre de colonne

        private char [][] ville;

        // Constructeur

        public ville(int longueur, int largeur) {

            this.n = longueur;
            this.m = largeur;

            ville = new char[n][m];

            for(int i = 0; i < n ; i++) {

                for(int j = 0 ; j < m; j++) {

                    ville[i][j] = '.';
                }
            }

        }

        // pour acceder a une case

        public char getCase(int l, int c) {

            return ville[l][c];

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


    }
}
