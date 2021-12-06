package java_collection.hashcodeequals;

public class Circle implements Comparable<Circle> {

    private final int x, y, r;

    public Circle(int x, int y, int r) {
	if (r < 0)
	    throw new IllegalArgumentException("negative radius");
	this.x = x;
	this.y = y;
	this.r = r;
    }

    // Copy constructor. Alternative to clone
    public Circle(Circle original) {
	x = original.x;
	y = original.y;
	r = original.r;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public int getR() {
	return r;
    }

    @Override
    public String toString() {
	return String.format("center=(%d,%d); radius=%d", x, y, r);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + r;
	result = prime * result + x;
	result = prime * result + y;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Circle other = (Circle) obj;
	if (r != other.r)
	    return false;
	if (x != other.x)
	    return false;
	if (y != other.y)
	    return false;
	return true;
    }

    @Override
    public int compareTo(Circle thatCircle) {
	long result = (long) thatCircle.y - this.y;
	if (result == 0)
	    result = (long) thatCircle.x - this.x;
	if (result == 0)
	    result = (long) thatCircle.r - this.r;
	return Long.signum(result);
    }

}
