package chris;

public class Date {
    int day, month, year;
    public Date(int day, int month, int year) {
        this.day = Math.min(day, 31);
        this.month = Math.min(month, 12);
        this.year = year;
    }
    public void printDate() {
        System.out.println(day + ". " + spellOutMonth(month) + " " + year);
    }
    private String spellOutMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "December";
        }
    }
}
