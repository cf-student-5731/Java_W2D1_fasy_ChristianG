package W02D01Fasy;

import java.util.Date;

public class DateClass {

    private Date d = new Date();

    public void mySetDate(){
        this.d.setDate(10);
    }

    public Date myGetDate(){
        return this.d;
    }

//    public String printTime(){
//        return String.valueOf(this.t.getHour()) + " hours, "+ String.valueOf(this.t.getMinute()) + " minutes and " + String.valueOf(this.t.getSecond()) + " seconds.";
//    }

}
