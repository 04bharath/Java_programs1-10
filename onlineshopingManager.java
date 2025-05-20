import java.util.*;
class Product{
    String name;
    int price;
    String catogery;

    public Product(String name , int price,String catogery){
        this .name = name;
        this.price = price;
        this.catogery =catogery;
    }
}
public class onlineshopingManager{
    private Vector<Product> invertory = new Vector<>();
    static Scanner sc = new Scanner(System.in);

    void additem(){
        sc.nextLine();
        System.out.print("Enter a item name :");
        String name = sc.nextLine();
        //sc.nextLine();
        System.out.print("Enter a price of item : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a catagery item : ");
        String catogery = sc.nextLine();
        invertory.add(new Product(name,price,catogery));
    }
    void removeitem(){
        sc.nextLine();
        System.out.print("Enter the remove item name : ");
        String name = sc.nextLine();
        for(int i=0;i<=invertory.size();i++){
            if (invertory.get(i).name.equalsIgnoreCase(name)){
                invertory.remove(i);
                System.out.println("Removed");
            }else {
                System.out.println("Name not found");
            }
        }
    }
    void displayitem(){
        System.out.println("Product details ");
        for (Product p :invertory){
            System.out.println("Name : "+ p.name +"|" + "Price : "+ p.price+ "|"+"Catogery : "+p.catogery);
        }
    }
    public static void main(String args[]){
        onlineshopingManager system = new onlineshopingManager();
        while(true){
            System.out.println("1.Add  2.remove 3.Display 4.Exit");
            System.out.print("Enter the chooic : ");
            switch (sc.nextInt()){
                case 1 -> system.additem();
                case 2 -> system.removeitem();
                case 3 -> system.displayitem();
                case 4 -> {System.out.println("Bye");return;}
                default -> System.out.println("Invalid choocic");
            }
        }
    }
}