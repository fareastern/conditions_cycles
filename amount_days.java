public class amount_days {
    public static int checkYear (int year) {
        int correctYear = 0;
        if (year % 400 == 0) {
            correctYear = 366;
        } else if (year % 100 == 0) {
            correctYear = 365;
        } else if (year % 4 == 0) {
            correctYear = 366;
        } else {
            correctYear = 365;
        }
        return correctYear;
    }
}