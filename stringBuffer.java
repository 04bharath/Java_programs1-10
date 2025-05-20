import java.util.*;
public class stringBuffer {
    public static void main(String args[]){
        StringBuffer string1 = new StringBuffer();
        StringBuffer string2 = new StringBuffer("Hello");

        System.out.println("The capacity of string 1 : "+string1.capacity());
        System.out.println("The capacity of string 2 : "+string2.capacity());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String st = scanner.nextLine();
        StringBuffer reversedstring = new StringBuffer(st);
        reversedstring.reverse();
        String upperstring = reversedstring.toString().toUpperCase();
        System.out.println("Reversed and upper case string  :"+upperstring);

        System.out.print("Enter a string : ");
        String appendstring = scanner.nextLine();
        reversedstring.append(appendstring);
        System.out.print("Appended String is :"+ reversedstring);
    }
}
