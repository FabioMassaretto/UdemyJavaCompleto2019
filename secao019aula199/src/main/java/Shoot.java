import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Shoot {
    interface Target {
        boolean needToAim(double angle);
    }

    static void prepare(double angle, Target t) {

        boolean ready = t.needToAim(angle); // k1
        System.out.println(ready);
    }

    public static void main(String[] args) {

        String d = "54321";
        d = d.substring(4);
        System.out.println(d.charAt(0));
        LocalTime ti = LocalTime.now();
        ti.getHour();
        System.out.println(ti.getHour());

        String[] array = {"1", "2", "3", "4"};

        for (int i = 0; i < 4; i++){
            //System.out.println(array[i]);
        }
        //prepare(45, d -> d > 5 || d < -5);// k2
    }
}