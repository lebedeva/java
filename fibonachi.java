// числа фибоначи
package project1;

public class fibonachi {
   /* public fibonachi() {
        super(); 
    }*/

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;

        System.out.println(" Числа Фибоначи ");
        System.out.println(lo);
        while (hi <50) {
            System.out.println(hi);
            hi = lo+hi;
            lo = hi-lo;
            }
    }
}
