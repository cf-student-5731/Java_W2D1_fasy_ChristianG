package W02D01Fasy;
import java.util.concurrent.TimeUnit;

public class Clock {

    public static void main(String[] args) {
        int amountOfInstances = 4;

        Time[] t = new Time[amountOfInstances];

        for (int i=0; i<amountOfInstances; i++){
            t[i] = new Time();
            t[i].setTimeNow();
            System.out.println(t[i].getTime());
            try
            {
                Thread.sleep(1333);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

        for(Time i : t){
            System.out.println(i.printTime());
        }


        DateClass d = new DateClass();
        d.mySetDate();
        System.out.println(d.myGetDate());

        Time t2 = new Time();
        t2.setTimeNow();
        System.out.println("============================");
        System.out.println(t2.printTime());
        System.out.println("----------------------------");
        t2.addSeconds(190);
        System.out.println(t2.printTime());
        System.out.println("----------------------------");
        t2.addTime(2, 90, 70);
        System.out.println(t2.printTime());
    }
}
