public class ProductDB {

    public static Product getProduct(String productCode) {
        Product p = new Product();
        p.setCode(productCode);

        if (productCode.equalsIgnoreCase("java")) {
            p.setDescription("Murach's Java Programming");
            p.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("jsps")) {
            p.setDescription("Murach's Java Servlets and JSP");
            p.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("cs")) {
            p.setDescription("Murach's C# 2015");
            p.setPrice(54.50);
        } else {
            p.setDescription("Unknown");
            p.setPrice(0.0);
        }

        return p;
    }
}
