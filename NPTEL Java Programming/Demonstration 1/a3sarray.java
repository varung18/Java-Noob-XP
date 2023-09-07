public class a3sarray {
    public static void main (String[] args) {
        System.out.println("The program begins as follows: ");
        int my3darray [] [] [] = new int [3] [4] [5];
        int i, j, k;
        for(i = 0; i<3;i++) {
            for(j = 0; j<3;j++) {
                for(k = 0; k<3;k++) {
                    my3darray [i][j][k] = i*j*k;
                }
            }
        }

        for(i = 0; i<3;i++) {
            for(j = 0; j<4;j++) {
                for(k = 0; k<5;k++) {
                    System.out.print(my3darray[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
