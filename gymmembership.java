import java.util.Scanner;
public class gymmembership {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to gym membership");
        System.out.print("Enter a name :");
        String name = scanner.nextLine();
        System.out.print("Enter a age : ");
        int age = scanner.nextInt();
        System.out.print("is membership active  (true/false) : ");
        boolean isactive  = scanner.nextBoolean();
        System.out.print("Enter the Duration (in months) : ");
        int duration = scanner.nextInt();

        double fee = duration*50.0;

        System.out.println("Member Details");
        System.out.println("Nme :" + name);
        System.out.println("Age :" + age);
        if (isactive == true){
            System.out.println("Member is Active");
            System.out.println("Membership fee : " + fee);
        }else{
            System.out.println("member is Inactive");
        }




    }

}
