import static java.lang.Math.sqrt;

public class Complex {
    public Complex() {
        this(0, 0);
    }

    public Complex(final double realPart, final double imagePart) {
        this.real = realPart;
        this.image = imagePart;
    }

    public final Complex multiply(final Complex other) {
        return new Complex(real * other.real - image * other.image, real
                * other.image + other.real * image);
    }

    public final Complex multiply(final double multiplier) {
        return new Complex(real * multiplier, image * multiplier);
    }

    public final Complex sqr() {
        return this.multiply(this);
    }

    public final Complex add(final Complex other) {
        return new Complex(real + other.real, image + other.image);
    }
    
    public static Complex absComplex(final Complex other) {
        return new Complex(other.real < 0 ? --other.real : other.real,
                other.image < 0 ? -other.image : other.image);
    }

    public static double abs(final Complex complex) {
        return sqrt(absSqr(complex));
    }

    public static double absSqr(final Complex complex) {
        return complex.real * complex.real + complex.image * complex.image;
    }

    private double real, image;
}