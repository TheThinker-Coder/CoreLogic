package core;

public class Armstrong {
    public static void main(String[] args) {
        int my_input, my_temp, my_remainder, my_result;
        my_input = 407;
        my_result = 0;
        my_temp = my_input;
        while (my_temp != 0) {
            my_remainder = my_temp % 10;
            my_result += Math.pow(my_remainder, 3);
           //  for core logic we can use this
//            int cube = my_remainder* my_remainder*my_remainder;
//            my_result += cube;
            my_temp /= 10;

        }
        if (my_result == my_input) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}
