package W02D01Fasy;

import java.time.*;

public class Time {

    private LocalTime t;

    public void setTimeNow(){
        this.t = LocalTime.now();
    }

    public LocalTime getTime(){
        return this.t;
    }

    public String printTime(){
        return String.valueOf(this.t.getHour()) + " hours, "+ String.valueOf(this.t.getMinute()) + " minutes and " + String.valueOf(this.t.getSecond()) + " seconds.";
    }

    public void addSeconds(long s){
        this.t = this.t.plusSeconds(s);
    }

    public void addTime(long h, long m, long s){
        this.t = this.t.plusHours(h);
        this.t = this.t.plusMinutes(m);
        this.t = this.t.plusSeconds(s);
    }

}
