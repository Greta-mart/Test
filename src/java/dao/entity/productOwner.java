package dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Product_owner")
public class productOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Product_ownerID")
    private long id;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "Lastname", nullable = false)
    private String lastName;

    @Column(name = "CompaneName", nullable = false)
    private List<contact> contactList;

    public productOwner(String firstName, String lastName, List<contact> contactList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactList = contactList;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<contact> getContactList() {
        return contactList;
    }

    private void setContactList(List<contact> contactList) {
        this.contactList = contactList;
    }
}