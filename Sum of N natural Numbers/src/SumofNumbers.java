public class SumofNumbers {

    public static void main(String[] args) {
        int number = 10;
        int sum = sum(number);
        System.out.println("Sum = " + sum);
    }

    public static int sum(int number) {
        if (number != 0)
            return number + sum(number - 1);
        else
            return number;
    }
}

