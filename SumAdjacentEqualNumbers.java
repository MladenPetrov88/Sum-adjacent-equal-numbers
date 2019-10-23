import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");
        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            numbers.add(Double.parseDouble(values[i]));
        }

        int a = 0;
        while (a < numbers.size() - 1) {
            if (numbers.get(a).equals(numbers.get(a + 1))){
                numbers.set(a, numbers.get(a) + numbers.get(a + 1));
                numbers.remove(a + 1);
                a = 0;
            } else {
                a++;
            }
        }

        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }


    }
}
