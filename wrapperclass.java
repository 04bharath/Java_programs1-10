import java.util.Scanner;
public class wrapperclass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a int  number 1 :");
        int a = scanner.nextInt();
        System.out.print("Enter a int number 2 :");
        int b = scanner.nextInt();
        int c = a + b;
        Integer d = c;
        int v = d;
        // Double
        System.out.print("Enter a double number 1 :");
        double e = scanner.nextDouble();
        System.out.print("Enter a double number 2 : ");
        double f = scanner.nextDouble();
        double g = e + f;
        Double h = g;
        double i = h;
        // float
        System.out.print("Enter a float number 1 :");
        float m = scanner.nextFloat();
        System.out.print("Enter a float number 2 : ");
        float n = scanner.nextFloat();
        float o = m + n;
        Float p = o;
        float q = p;
        //Boolen
        System.out.print("Enter a Boolean value (true/false): ");
        boolean r = scanner.nextBoolean();
        Boolean ab = r;
        boolean ac = ab;
        // Character
        Character aa = Character.valueOf('R');
        char aaa = aa.charValue();



        System.out.println("Auto Boxing Integer is : " + d);
        System.out.println("UnBoxing int is " + v);

        System.out.println("Auto Boxing Double  is : " + h);
        System.out.println("UnBoxing  double is " + i);

        System.out.println("Auto Boxing Float  is : " + p);
        System.out.println("UnBoxing  float is " + q);

        System.out.println("Auto Boxing Boolean  is : " + ab);
        System.out.println("UnBoxing  boolean is " + ac);

        System.out.println("Auto Boxing Character  is : " + aa);
        System.out.println("UnBoxing  Character is " + aaa);


        }
    }
