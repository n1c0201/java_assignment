import java.util.Scanner;

public class Demos {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        int b = a.length;
        for (int i = 0; i < b; i++){
            a[i] = (b - i);


        }
        for (int i = 0; i < b; i++){
            System.out.print(a[i]);
        }
    }

}
