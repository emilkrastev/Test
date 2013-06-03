import java.math.BigDecimal;

public class Service extends Item {

    private double typeOfPayment;

    public double getTypeOfPayment() {
        return typeOfPayment;

    }

    public void setTypeOfPayment(double typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public Service(String name, String description, BigDecimal price, double type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.typeOfPayment = type;
    }

    @Override
    public void print() {
        System.out.println("Service name : ");
        System.out.println(this.name);
        System.out.println("Service Description : ");
        System.out.println(this.description);
        System.out.println("Service Price : ");
        System.out.println(this.price);
        System.out.println("Service payment type : ");
        System.out.println(this.typeOfPayment);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Service))
            return false;
        Service service = (Service) object;
        return (this.name.equals(service.name) && this.description.equals(service.description)
                && this.price.compareTo(service.price) == 0 && this.typeOfPayment == service.typeOfPayment);
    }
}
