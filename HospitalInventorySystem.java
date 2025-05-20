import java.util.*;

class Pharmacy {
    public int id;
    public String name;
    public int qty;
    public int price;

    public Pharmacy(int id, String name, int qty, int price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}

public class HospitalInventorySystem {
    private ArrayList<Pharmacy> inventory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    void addItem() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        inventory.add(new Pharmacy(id, name, qty, price));
        System.out.println("Item added.");
    }

    void updateItem() {
        System.out.print("ID to update: ");
        int id = sc.nextInt();
        for (Pharmacy p : inventory) {
            if (p.id == id) {
                System.out.print("New Qty : ");
                p.qty = sc.nextInt();
                System.out.print("New price : ");
                p.price = sc.nextInt();
                System.out.println("Updated.");
                return;
            }
        }
        System.out.println("Not found.");
    }

    void removeItem() {
        System.out.print("ID to remove: ");
        int id = sc.nextInt();
        if (inventory.removeIf(p -> p.id == id))
            System.out.println("Removed.");
        else
            System.out.println("Not found.");
    }

    void displayItems() {
        System.out.println("\nInventory:");
        for (Pharmacy item : inventory) {
            System.out.println(item.id + " | " + item.name + " | Quantity: " + item.qty + " | Price: " + item.price);
        }
    }

    void searchItem() {
        System.out.print("ID to search: ");
        int id = sc.nextInt();
        for (Pharmacy p : inventory) {
            if (p.id == id) {
                System.out.println("Found: " + p);
                return;
            }
        }
        System.out.println("Not found.");
    }

    public static void main(String[] args) {
        HospitalInventorySystem system = new HospitalInventorySystem();
        while (true) {
            System.out.print("\n1.Add 2.Update 3.Remove 4.Display 5.Search 6.Exit\nChoice: ");
            switch (sc.nextInt()) {
                case 1 -> system.addItem();
                case 2 -> system.updateItem();
                case 3 -> system.removeItem();
                case 4 -> system.displayItems();
                case 5 -> system.searchItem();
                case 6 -> { System.out.println("Bye!"); return; }
                default -> System.out.println("Invalid.");
            }
        }
    }
}