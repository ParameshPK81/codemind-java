import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

    public static boolean isHappy_number(int num)
    {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(num))
        {
            int value = 0;
            while (num > 0)
            {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return num == 1;
    }

    public static void main(String[] args)
    {
        int num = new Scanner(System.in).nextInt();
        System.out.println(isHappy_number(num) ? "True" : "False");
    }
}