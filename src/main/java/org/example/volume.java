
class Shape {
    double getVolume() { return 0; }
}


class Cube extends Shape {
    private double s;
    Cube(double s) { this.s = s; }
    @Override double getVolume() { return s * s * s; }
}


class Cuboid extends Shape {
    private double l, w, h;
    Cuboid(double l, double w, double h) { this.l = l; this.w = w; this.h = h; }
    @Override double getVolume() { return l * w * h; }
}


class Cylinder extends Shape {
    private double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    @Override double getVolume() { return Math.PI * r * r * h; }
}

public class volume {
    public static void main(String[] args) {
        // Just create the object and print the result immediately
        System.out.println("Cube Volume: " + new Cube(5).getVolume());
        System.out.println("Cuboid Volume: " + new Cuboid(2, 4, 6).getVolume());
        System.out.println("Cylinder Volume: " + new Cylinder(3, 5).getVolume());
    }
}