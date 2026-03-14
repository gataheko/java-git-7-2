import java.text.NumberFormat;

public class Product {

    // private instance variables (encapsulation / data hiding)
    private String code;
    private String description;
    private double price;

    // default constructor
    public Product() {
        code = "";
        description = "";
        price = 0.0;
    }

    // parameterized constructor
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // copy constructor
    public Product(Product p) {
        this.code = p.code;
        this.description = p.description;
        this.price = p.price;
    }

    // getters
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    // setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // utility method
    public void printToConsole() {
        System.out.println(code + " | " + description + " | " + getPriceFormatted());
    }
}
