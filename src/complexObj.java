import java.util.Objects;

public class complexObj {

    double real;
    double imaginary;

//konstruktor

    public complexObj (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
//add funktion

    public complexObj add(complexObj b) {

       double zreal = this.real + b.real;
       double zimaginary = this.imaginary + b.imaginary;
       return new complexObj(zreal, zimaginary);
    }

//multipliceringsfunktion

    public complexObj multiply(complexObj a) {

        double zreal = (this. real * a.real) - (this.imaginary * a.imaginary);

        double zimaginary = (this.real * a.imaginary) + (this.imaginary * a.real);

        return new complexObj(zreal, zimaginary);
    }

//argumentet för det komplexa talet

    public double arg() {

        double angle = Math.atan(this.imaginary / this.real);

        return angle;
    }

//override för komplextal equals komplextal

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        complexObj that = (complexObj) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
