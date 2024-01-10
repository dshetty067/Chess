package Chess;
import java.util.*;

import static java.lang.Math.*;

public class bishop {
    public static int bishops(int r,int c,int n){
        return min(r-1,c-1)+min(r-1,n-c)+min(n-r,c-1)+min(n-r,n-c);

    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the order of the chessboard :");
        int n=s.nextInt();
        System.out.println("Enter the row and column in which the bishop is present :");
        int r=s.nextInt();
        int c=s.nextInt();
        System.out.println("No of boxes/squares in the which bishop can move is : "+bishops(r,c,n));



    }

}
