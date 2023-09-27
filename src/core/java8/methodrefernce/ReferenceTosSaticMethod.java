package core.java8.methodrefernce;

@FunctionalInterface
interface CalculatorInterface<A, B> {
    A sumMethod(B val1, B val2);
}

class MyInteger {
    static int sum(Integer i1, Integer i2) {
        return (i1 + i2);
    }
}

public class ReferenceTosSaticMethod {
    public static void main(String[] args) {

        System.out.println("1 - Find sum of two numbers using > reference to static method ");
        System.out.println("2 - Here MyInteger::sum is a reference to "
                + "> static method sum"
                + "> of class MyInteger");

        // Use var to infer the type
      //  var sum = MyInteger::sum;

        // Call sumMethod
       // Integer sumResult = sum.sumMethod(2, 3);
       // System.out.println("sumResult = " + sumResult); // 5
    }
}
