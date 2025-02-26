public class amountOfDays {
    public static int checkYear (int year) {

        // не использую проверку на 100, т.к. по логике это будет излишняя проверка + тернарный оператор короче
        return (year % 400 == 0 || year % 4 == 0) ? 366 : 365;

        /* Код по условию задания:
        if (year % 400 == 0 || ) {
            System.out.println("Количество дней: 366");
        } else if (year % 100 == 0) {
            System.out.println("Количество дней: 365");
        } else if (year % 4 == 0) {
            System.out.println("Количество дней: 366");
        } else {
            System.out.println("Количество дней: 365");
        }
        */

    }
}