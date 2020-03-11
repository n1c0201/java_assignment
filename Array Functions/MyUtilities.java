import java.util.Scanner;

public class MyUtilities{
    Scanner input = new Scanner(System.in);
    int poscount = 0, negcount = 0, oddcount = 0, evencount = 0, zerocount = 0;
    int totalsum = 0, totalproduct = 1;
    int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    int second_largest = Integer.MIN_VALUE, largest2 = Integer.MIN_VALUE;
    int b[] = new int[10];
    int c[] = new int[10];  
    int a[] = new int[20];
    boolean palindrome = true;
    public void enterValues(){
        System.out.println("Input 20 numbers");
        
        for(int i = 0; i < 20; i++){
            a[i] = input.nextInt();
        }
        for(int i = 0; i < 20; i++){
            System.out.print(a[i] + " ");
        
        }
        
    }
    public void numberCheck(){
        System.out.println("\nNumber 2:");
        System.out.println("Input a number to check if it is in the array:");
        int checker = input.nextInt();
        boolean check = false;
        for(int i = 0; i < 20; i++){
            if(a[i] == checker){
                check = true;
            }
        }
        if (check == true){
            System.out.println(checker + " is in the array");
        }
        else{
            System.out.println(checker + " is not in the array");
        }
    }
    public void specialNumbers(){
        for(int i = 0; i < 20; i++){
            if(a[i] > 0){
                poscount += 1;
            }
            if(a[i] < 0){
                negcount += 1;
            }
            if(a[i] % 2 == 0){
                evencount += 1;
            }
            else{
                oddcount += 1;
            }
            
            if(a[i] == 0){
                zerocount += 1;
            }
        }

        System.out.println("Number 3:");
        System.out.println("Number of positive integers " + poscount);
        System.out.println("Number of negative integers " + negcount);
        System.out.println("Number of odd integers " + oddcount);
        System.out.println("Number of even integers " + evencount);
        System.out.println("Number of zeroes " + zerocount);
    }

    public void sumprodNumber(){
        for(int i = 0; i < 20; i++){
            totalsum += a[i];
            totalproduct = totalproduct * a[i];
        }
        System.out.println("Number 4:");
        System.out.println("The total sum of the numbers are: " + totalsum);
        System.out.println("The total product of the numbers are: " + totalproduct);

        
    }

    public void largesmallNumber(){
        for(int i = 0; i < 20; i++){
            if(a[i] > largest){
                largest = a[i];
            }
            if(a[i] < smallest){
                smallest = a[i];
            }
        }
        System.out.println("Number 5:");
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
    public void palindromeNumber(){
        for (int i = 0; i < 20; i++){
            if(a[i] != a[20 - 1 - i]){
                palindrome = false;
            }
        }
        System.out.println("Number 6:");
        if(palindrome == false){
            System.out.println("The array is not the same read from the front and back");
        }
        else{
            System.out.println("The array is the same read from the front and back");
        }
    }
    public void splitArray(){
        System.out.println("\nNumber 7:");
        for(int i = 0; i < 10; i++){
            b[i] = a[i];
            c[i] = a[i + 10];
        }
        System.out.println("First Array: ");
        for(int i = 0; i < 10; i++){
            System.out.print(b[i] + " ");
        
        }
        System.out.println("\nSecond Array");
        for(int i = 0; i < 10; i++){
            System.out.print(c[i] + " ");
        }
    }
    public void splitLargest(){
        for(int i = 0; i < 20; i++){
            if(a[i] > largest2){
                second_largest = largest2;
                largest2 = a[i];
            }
            else if(a[i] > second_largest){
                second_largest = a[i];
            }
        }
        System.out.println("\nNumber 8:");
        System.out.println("");
        for(int i = 0; i < 20; i++){
            if(a[i] == largest2){
                System.out.print(second_largest + " " + (largest2 - second_largest + " "));
            }
            else{
                System.out.print(a[i] + " ");
            }
        }
    }
    public void shiftRight(){
        System.out.println("\nNumber 9:");
        int temp = a[19];
        for(int i = 19; i > 0; i--){
            a[i] = a[i-1];
        }
        a[0] = temp;

        for(int i = 0; i < 20; i++){
            System.out.print(a[i] + " " );
        }
    }
    public void sortAscend(){
        int temp2;
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 20 - i - 1; j++){
                if(a[j] > a[j + 1]){
                    temp2 = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp2;
                }
            }
        }
        
        System.out.println("\nNumber 10:");
        for(int i = 0; i < 20; i++){
        System.out.print(a[i] + " ");
        }
    }

}