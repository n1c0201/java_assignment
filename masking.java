public class masking{
    public static void main(String[] args) {
        //ascii to digit
        int mask = '\u000F';
        int a = '1';
        int b = a & mask;
        System.out.println(b);
        //digit to ascii
        int mask2 = '\u0030';
        int c = 1;
        int d = c | mask2;
        System.out.println(d);

    }
}