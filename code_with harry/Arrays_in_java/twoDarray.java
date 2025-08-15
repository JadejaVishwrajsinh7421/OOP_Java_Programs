public class twoDarray {
    public static void main(String [] args) {

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
