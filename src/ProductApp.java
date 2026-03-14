import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Product Viewer");
        System.out.println("=============================");

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.print("\nEnter product code (java, jsps, cs): ");
            String productCode = sc.nextLine().trim();

            Product product = ProductDB.getProduct(productCode);

            System.out.println("\nProduct Data");
            System.out.println("------------");
            System.out.println("Code:        " + product.getCode());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price:       " + product.getPriceFormatted());

            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine().trim();
        }

        System.out.println("\nGoodbye!");
        sc.close();
    }
}
