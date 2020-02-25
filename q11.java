import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter some numbers.");

        for (int i = 0; i < n; i++)
            numbers.add(scanner.nextInt());
        System.out.println(numbers.stream().map(e -> e * 2).mapToInt(e -> e).average());
    }
}
