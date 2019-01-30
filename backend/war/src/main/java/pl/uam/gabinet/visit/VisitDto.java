package pl.uam.gabinet.visit;


import pl.uam.gabinet.entities.VisitEntity;

import java.io.Serializable;

public class VisitDto implements Serializable {

    private Long id;
    private String title;
    private double price;
    private double rating;
    private int releaseDate;

    public VisitDto() {

    }

    public VisitDto(long aId) {
        id = aId;
    }

    public VisitDto(Long id, String author, String title, double price, double rating, int releaseDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public VisitDto(VisitEntity visitEntity) {
        this.id = visitEntity.getId();
        this.title = visitEntity.getTitle();
        this.price = visitEntity.getPrice();
        this.rating = visitEntity.getRating();
        this.releaseDate = visitEntity.getReleaseDate();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisitDto visitDto = (VisitDto) o;

        return id != null ? id.equals(visitDto.id) : visitDto.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
