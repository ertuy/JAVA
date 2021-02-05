public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }   

    public Point3d () {
        this(0, 0, 0);
    }

    public double getX () {
        return xCoord;
    }

    public double getY () {
        return yCoord;
    }

    public double getZ () {
        return zCoord;
    }
    
    public void setX (double val) {
        xCoord = val;
    }
    
    public void setY ( double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public Boolean equals(Point3d a) {
        if (this.xCoord != a.getX()) {
            return false;
        }

        if (this.yCoord != a.getY()) {
            return false;
        }

        if (this.zCoord != a.getZ()) {
            return false;
        }

        return true;
    }

    public double distanceTo(Point3d a) {
        double res = Math.sqrt(Math.pow(a.getX() - this.xCoord, 2) + Math.pow(a.getY() - this.yCoord, 2) + Math.pow(a.getZ() - this.zCoord, 2));
        res *= 100;
        res = (int) res;
        res = res / 100;
        return res;
    }
}
