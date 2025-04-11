public class PrimitiveOperations {
    public static void main (String[] args) {
        int val1 = 20;
        double val2 = 1.5;
        double product = val1 * val2;

        double myDouble = (double) val1;
        int myFloat = (int) val2;

        char v = 'V';
        char lowerV = (char) (v + 32);

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(product);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(v);
        System.out.println(lowerV);
    }
}
// Status: Complete!
