package dao.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Items")
public class items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ItemsID")
    private long id;

    @Column(name = "Title", nullable = false)
    private String title;

    private List<categorieTypes> categorieTypesList;

    @Column(name = "Count", nullable = false)
    private int count;

    @Column(name = "Price", nullable = false)
    private double price;

    @Column(name = "StoringDate", nullable = false)
    private Date storingDate;

    public items(String title, List<categorieTypes> categorieTypesList, int count, double price, Date storingDate) {
        this.title = title;
        this.categorieTypesList = categorieTypesList;
        this.count = count;
        this.price = price;
        this.storingDate = storingDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public List<categorieTypes> getCategorieTypesList() {
        return categorieTypesList;
    }

    private void setCategorieTypesList(List<categorieTypes> categorieTypesList) {
        this.categorieTypesList = categorieTypesList;
    }

    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public Date getStoringDate() {
        return storingDate;
    }

    private void setStoringDate(Date storingDate) {
        this.storingDate = storingDate;
    }
}
