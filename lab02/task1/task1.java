package lab02.task1;

public class task1 {
    public static void main(String[] args) {
        Line line1 = new Line(1,1 );
        Line line2 = new Line(-1,3);

        System.out.println(line1.intersection(line2));
    }
}
