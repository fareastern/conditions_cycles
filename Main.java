import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGuessed = 0; // количество угаданных раз

        // играем
        while (true) {
            System.out.println("Введите год в формате yyyy: ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней в формате yyy: ");
            int enteredDays = scanner.nextInt();
            int correctDays = amountOfDays.checkYear(year);
            if (enteredDays != correctDays){
                break;
            }
            numberGuessed++;
        }

        // выводим количество угаданных раз
        System.out.println("Количество попаданий: "+numberGuessed);
    }
}