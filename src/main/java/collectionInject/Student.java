package collectionInject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private List<String> phone;
    private Set<String> address;
    private Map<String,String> college;

    public Student(List<String> phone, Set<String> address, Map<String, String> college) {

        this.phone = phone;
        this.address = address;
        this.college = college;
    }

    public Student() {
    }



    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCollege() {
        return college;
    }

    public void setCollege(Map<String, String> college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", phone=" + phone +
                ", address=" + address +
                ", college=" + college +
                '}';
    }
}
