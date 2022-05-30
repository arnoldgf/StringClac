import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String word_1 = in.nextLine();
        System.out.print("Введите второе слово: ");
        String word_2 = in.nextLine();
        System.out.print("Введите арифметический оператор: ");
        String operator = in.next();

        if (true) {
            String result;
            if (Objects.equals(operator, "+")) {
                result = word_1 + word_2;
                System.out.print("Результат сложения чисел " + word_1 + " и " + word_2 + " равно " + result);
            } else if (Objects.equals(operator, "-")) {
                String newStr = word_1.replaceAll(word_2, "");
                System.out.print("Результат вычитания равен: " + newStr);
            } else if (Objects.equals(operator, "*")) {
                String s = word_1 + (word_1).repeat(Integer.parseInt(word_2));
                System.out.print(s);
            } else if (Objects.equals(operator, "/")){
                
            }
        } else System.out.print("Ошибка");
    }
}
