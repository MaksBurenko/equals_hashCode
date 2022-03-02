package equals;
public class Main {
    public static void main(String[] args) {

        final class ComplexNumber {
            private final double re;
            private final double im;
            private double hash;

            public ComplexNumber(double re, double im) {
                this.re = re;
                this.im = im;
            }
            public double getRe() {
                return re;
            }
            public double getIm() {
                return im;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof ComplexNumber)) return false;

                ComplexNumber number = (ComplexNumber) o;

                if (re != number.re) return false;
                if (im != number.im) return false;
                return true;
            }

            @Override
            public int hashCode() {
                hash = im;
                hash = 31 * hash + re;
                return Double.hashCode(hash);
            }
        }
    }
}