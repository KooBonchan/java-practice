public class Coordinate {
  private double x = 0;
  private double y = 0;

  public Coordinate (){};
  public Coordinate (double x, double y) {this.x = x;this.y = y;}
  public Coordinate (Coordinate c) {this(c.getX(), c.getY());}
    // Cool way, c++ always considers similar thing?



  public double getX() {return x;}
  public double getY() {return y;}
  public void setX(double x) {this.x = x;}
  public void setY(double y) {this.y = y;}
  public void set(double x, double y){this.x = x; this.y = y;}
  public void move(double dx, double dy){
    this.x += dx;
    this.y += dy;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || this.getClass() != obj.getClass()) return false;
    Coordinate neighbor = (Coordinate) obj;
    return x == neighbor.getX() && y == neighbor.getY();
  }

  @Override
  public String toString() {
    return String.format("(%.3f %.3f)", x, y);
  }
}
