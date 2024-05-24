import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkingWith2dArray {
   // tic-tac toy using 2D Array
   /* [
                   c0  c1  c2
           row #0 [ - , - , -]
           row #1 [ - , - , -]
           row #2 [ - , - , -]
   ]*/
    public static void main(String[] args) {
        char[][] bord = new char[3][3] ; //[number of rows][number of columns]
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++ ){
                bord[i][j] = '-' ;
            }
        }
        bord[0][0] = 'x' ;
        bord[1][0] = 'x' ;
        bord[2][0] = 'x' ;
        System.out.println(Arrays.deepToString(bord));
        // another way to deal with 2D Array
        char[][] SecondBord = new char[][]{
                new char[]{'x' , '-', '-'},
                new char[]{'x' , '-', '-'},
                new char[]{'x' , '-', '-'}

        };
        System.out.println(Arrays.deepToString(SecondBord));
    }
}
