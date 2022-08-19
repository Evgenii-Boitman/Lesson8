import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new Robot("Vasya", "body1", "head1"));
        robots.add(new Robot("Kolya", "body1", "head1"));
        robots.add(new Robot("Oleg", "body1", "head1"));
        robots.add(new Robot("Vasya", "body2", "head2"));
        robots.add(new Robot("Kolya", "body2", "head2"));
        robots.add(new Robot("Oleg", "body2",  "head2"));
        robots.add(new Robot("Vasya", "body3", "head3"));
        robots.add(new Robot("Kolya", "body3", "head3"));
        robots.add(new Robot("Oleg", "body3", "head3"));


        System.out.println(robots);

    }

}


