package AutoWiringAnnotation;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter");
        this.address = address;
    }
    public Employee(Address address) {
        System.out.println("Cons");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
