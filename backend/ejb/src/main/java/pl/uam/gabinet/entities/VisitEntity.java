package pl.uam.gabinet.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "visit")
public class VisitEntity extends AbstractBaseEntity {

    private String title;
    private double price;
    private double rating;
    private int releaseDate;


    public VisitEntity(long aId) {
        super(aId);
    }

    public VisitEntity() { }

    public VisitEntity(Long id, String title, double price, double rating, int releaseDate) {
        this(id);
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void update(VisitEntity aVisit) {
        title = aVisit.getTitle();
        price = aVisit.getPrice();
        rating = aVisit.getRating();
        releaseDate = aVisit.getReleaseDate();
    }

}
