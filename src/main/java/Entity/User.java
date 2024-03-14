package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import javax.persistence.Id;
import java.util.List;

@Entity
public class User {

    @Id
    private String id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;

    public User() {
    }
    public User(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
