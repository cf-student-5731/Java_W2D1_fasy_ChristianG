package chris;

public class Time {
    int h, m, s;
    public Time(int hours, int minutes, int seconds) {
        this.h = hours;
        this.m = minutes;
        this.s = seconds;
    }
    public void addSeconds(int seconds) {
        s = s + seconds;
    }
    public void addTime(int hours, int minutes, int seconds) {
        h = h + hours;
        m = m + minutes;
        s = s + seconds;
    }
    private void prettifyTime() {
        h = h + m / 60 + s / 3600;
        m = (m + s / 60) % 60;
        s %= 60;
    }
    public void printTime() {
        prettifyTime();
        System.out.println("Time is " + h + " hours, " + m + " minutes and " + s + " seconds.");
    }
}
