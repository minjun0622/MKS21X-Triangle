public class Point{
  private double x;
  private double y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point( Point p) {
     Point point = new Point( p.getX(), p.getY());
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public String toString(){
    return "(" + getX() + "," + getY() + ")";
  }

  public double distanceTo(Point p) {
    double dx = Math.pow(  this.getX() - p.getX(), 2) ;
    double dy = Math.pow(  this.getY() - p.getY(), 2) ;
    return Math.sqrt( dx + dy);
  }

  public double distance(Point p1, Point p2) {
    double dx = ((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()));
    double dy = ((p1.getY() - p2.getY()) * (p1.getX() - p2.getX()));
    return Math.sqrt(dx + dy);
  }
}
