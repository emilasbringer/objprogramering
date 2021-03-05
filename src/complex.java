 public class complex {
        public static void main (String[] arg) {


            complexObj a = new complexObj(3.0,2.0);
            complexObj b = new complexObj(4.0,1.0);

            System.out.println(a.real);
            System.out.println(b.imaginary);



            complexObj c = a.add(b);
            complexObj d = new complexObj(7,3);

            System.out.println(c);
            if (c.equals(d)) {
                System.out.println("add funkar!!");
            }
/*
            c = a.multiply(b);
            d = new complexnr(10,11);

            System.out.println(c);
            if (c.equals(d)) {
                System.out.println("multiply funkar!!");
            }
*/


        }
    }
