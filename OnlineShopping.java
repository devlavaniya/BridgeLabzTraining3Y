package BridgeLabzTraining3Y.work;

public class Onlineshopping {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean moreCustomers = true;

        while (moreCustomers) { // multiple customers
            System.out.println("\n=== Welcome to amazon ===");
            System.out.println("Product Menu:");
            System.out.println("1. Laptop   - Rs.50000");
            System.out.println("2. Mobile   - Rs.20000");
            System.out.println("3. Headphones - Rs.1500");
            System.out.println("4. Keyboard - Rs.1200");
            System.out.println("5. Mouse    - Rs.800");
            System.out.println("5. shirt    - Rs.200");
            System.out.println("5. trouser    - Rs.600");
            System.out.println("5. shoes    - Rs.1000");

            int total = 0;
            int itemsCount;

            
            do {
                System.out.print("\nEnter number of items you want to buy (at least 1): ");
                itemsCount = sc.nextInt();
            } while (itemsCount < 1);

            // Add items using for loop
            for (int i = 1; i <= itemsCount; i++) {
                System.out.print("Select product number for item " + i + ": ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        total += 50000;
                        System.out.println("Laptop added.");
                        break;
                    case 2:
                        total += 20000;
                        System.out.println("Mobile added.");
                        break;
                    case 3:
                        total += 1500;
                        System.out.println("Headphones added.");
                        break;
                    case 4:
                        total += 1200;
                        System.out.println("Keyboard added.");
                        break;
                    case 5:
                        total += 800;
                        System.out.println("Mouse added.");
                        break;
                    case 6:
                        total += 200;
                        System.out.println("shirt added.");
                        break;  
                    case 7:
                        total += 600;
                        System.out.println("trouser added.");
                        break;
                    default:
                        System.out.println("Invalid choice! Skipping...");
                }
            }

            
            if (total > 5000) {
                System.out.println("\nTotal before discount: Rs." + total);
                total = total - (total * 10 / 100);
                System.out.println("10% discount applied!");
            }

            System.out.println("Final Bill Amount: Rs." + total);
            System.out.println("Thank you for shopping!\n");

            // Ask if another customer
            System.out.print("Serve next customer? (yes/no): ");
            String next = sc.next();
            if (!next.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }
        System.out.println("\nStore closed. Have a nice day!");
    }
    
}
