package core;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =10; // for the number of series to print
        int n1=0;
        int n2 = 1;
        int n3;
        System.out.print(n1+" "+ n2);
        for(int i =0;i<n;i++){
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);

        }

    }
}
