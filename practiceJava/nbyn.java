public class nbyn {
    public static int[][] nbyn(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        for (int i = 0; i < a;i++) {
            for (int j = 0; j < a;j++) {
                System.out.print(nbyn(a)[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
