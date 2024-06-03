package Problem1;

public class Electronics extends Product {
    private int warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }

    @Override
    public String toString() {
        return "Electronics:- productName:" + getProductName() + ", price:" + getPrice() + ", warranty:" + warranty
                + " months, warrantyCost:" + warrantyCost;
    }
}

