import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product extends Item {
    private String manufacturer;
    private Date dateOfManufacture;

    public Product() {
        this.name = null;
        this.description = null;
        this.price = new BigDecimal(0);
        this.manufacturer = null;
    }

    public Product(String name, String description, BigDecimal price, String manufacturer, Date date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = date;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void print() {
        System.out.println("Product Name : ");
        System.out.println(this.name);
        System.out.println("Product description : ");
        System.out.println(this.description);
        System.out.println("Product price : ");
        System.out.println(this.price);
        System.out.println("Product manufacturer : ");
        System.out.println(this.manufacturer);
        System.out.println("Product Created : ");
        System.out.println(this.dateOfManufacture);

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Product))
            return false;
        Product product = (Product) object;
        return ((this.price.compareTo(product.price) == 0) && this.name.equals(product.name)
                && this.description.equals(product.description) && this.manufacturer.equals(product.manufacturer)
                && this.dateOfManufacture.equals(product.dateOfManufacture));
    }
}
