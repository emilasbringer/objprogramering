
public class complex {
    public static void main(String[] arg) {


        complexObj a = new complexObj(3.0, 2.0);
        complexObj b = new complexObj(4.0, 1.0);

        System.out.println(a.real);
        System.out.println(b.imaginary);

        complexObj c = a.add(b);
        complexObj d = new complexObj(7, 3);

        System.out.println(c.real + " " + c.imaginary);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }
        System.out.println(a.real + " " + a.imaginary);

        c = a.multiply(b);
        d = new complexObj(10, 11);

        System.out.println(c.real + " " + c.imaginary);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till 3+2i är " + a.arg());
        if (a.arg() == Math.atan(2.0 / 3)) {
            System.out.println("arg() funkar!!");
        }

    }
}

