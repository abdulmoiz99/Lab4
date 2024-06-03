package Problem1;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Electronics("Iphone", 1999.00, 24, 50);
        products[1] = new Furniture("L Sofa", 500.00, "Leather", 100);
        products[2] = new Clothing("Blue Jeans", 79.99, "Levi's", 20);
        products[3] = new Electronics("Macbook Laptop", 1299.00, 36, 100);
        products[4] = new Furniture("Round Table", 299.99, "Wood", 50);

        for (Product product : products) {
            System.out.println(product);
        }

        double total = sumProducts(products);
        System.out.println("Total sum of all products: " + Math.round(total));
    }

    public static double sumProducts(Product[] products) {
        double sum = 0.0;
        if (products != null) {
            for (Product product : products) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
