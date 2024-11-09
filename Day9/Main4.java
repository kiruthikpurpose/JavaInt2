class Product4 {
    private String productName;
    private double price;
    private Manufacturer manufacturer;

    public Product4(String productName, double price, String manufacturerName, String country) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = new Manufacturer(manufacturerName, country);
    }

    public String getProductDetails() {
        return "Product: " + productName + ", Price: $" + price + ", Manufacturer: " + manufacturer.name + " (" + manufacturer.country + ")";
    }

    private class Manufacturer {
        private String name;
        private String country;

        public Manufacturer(String name, String country) {
            this.name = name;
            this.country = country;
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Product4 laptop = new Product4("Laptop", 1500.0, "Dell", "USA");
        System.out.println(laptop.getProductDetails());

        Product4 smartphone = new Product4("Smartphone", 800.0, "Samsung", "South Korea");
        System.out.println(smartphone.getProductDetails());

        Product4 tablet = new Product4("Tablet", 300.0, "Apple", "USA");
        System.out.println(tablet.getProductDetails());
    }
}
