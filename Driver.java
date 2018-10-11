public class Driver {
    public static void main(String[] args) {
        Point P1 = new Point (1.0,2.0);
        Point P2 = new Point (3.0,4.0);
        Point P3 = new Point (1.0,5.0);

        Triangle ABC = new Triangle (P1, P2, P3);

        System.out.println ( P1.distanceTo(P2) );
        System.out.println ( P1.distanceTo(P3) );
        System.out.println (P1);
        System.out.println (ABC);
    }
}
