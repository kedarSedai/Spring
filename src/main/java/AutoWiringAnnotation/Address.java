package AutoWiringAnnotation;

public class Address {
    private String place;
    private String city;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "place='" + place + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
