import java.util.Scanner;

public class testings{
    public static void main(String[] args) {
        MyUtilities m = new MyUtilities();
        Scanner input = new Scanner(System.in);
        m.enterValues();
        m.splitLargest();
        m.shiftRight();
        int[][] myArray = {{1, 2, 3}, 
        {2, 1, 4}, 
        {3, 4, 1}};
        System.out.println("\n");
        m.symm_check(myArray);
        System.out.println("Please input the size of the magic square: (ODD ONLY)");
        int a = input.nextInt();
        m.alakazamSquare(a);
    }
}