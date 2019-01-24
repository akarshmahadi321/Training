import java.io.Serializable;

public class Customer implements Serializable {
    long id;
    long mobile;
    String name;
    String address;

    public Customer(long id, long mobile, String name, String address) {
        this.id = id;
        this.mobile = mobile;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", mobile=" + mobile +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
