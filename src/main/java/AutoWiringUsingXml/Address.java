package AutoWiringUsingXml;

public class Address {
    private String place;
    private String street;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        System.out.println("this is set ");
        this.place = place;
    }

    public String getStreet() {
        System.out.println("This is from get Address");
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "place='" + place + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
