public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point vertex1, Point vertex2, Point vertex3) {
    v1 = vertex1;
    v2 = vertex2;
    v3 = vertex3;
  }

  public Triangle (double d1, double d2, double d3,
                   double d4, double d5, double d6) {
    Point p1 = new Point (d1, d2);
    Point p2 = new Point (d3, d4);
    Point p3 = new Point (d5, d6);
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }

  public getPerimeter () {
     return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  }

  public Point getVertex(int num) {
      if (num == 0) {
          return v1;
      } else if (num == 1) {
          return v2;
      } else {
          return v3;
      }
  }

  public void setVertex(int num, Point P) {
      if (num == 0) {
          v1 = new Point(P);
      } else if (num == 1) {
          v2 = new Point(P);
      } else {
          v3 = new Point(P);
      }
  }
  public String toString() {
      return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
  }
}
