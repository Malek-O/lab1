
package javaapplication24;



public abstract class Product {

    private int id;
    private double price;
    private String name;
    private static int quantity;
    private float weight;

    public Product(int id, double price, String name, float weight) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.weight = weight;
        this.quantity++;
    }

    public void applySaleDiscount(double percentage) {
        this.price = this.price - ((percentage / 100) * this.price);
    }

    public final void addToShoppingCart() {
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public static int getTotalQuantity() {
        return Product.quantity;
    }

    public void getSellableStatus() {
        System.out.println("This product is sellable");
    }

    public String toString() {
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name
                + "\tPrice: SR" + this.price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
