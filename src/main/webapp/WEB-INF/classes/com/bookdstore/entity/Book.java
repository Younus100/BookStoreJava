package com.bookdstore.entity;



import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Column(name = "description")
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;

    @OneToMany(mappedBy = "book", orphanRemoval = true)
    private Set<Review> reviews = new LinkedHashSet<>();

    @Column(name = "price")
    private Float price;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "image")
    private Blob image;

    @Column(name = "isbn")
    private String isbn;

    private LocalDate publishDate;
    private LocalDateTime lastupdatetime;
    private Integer categotyId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "book", orphanRemoval = true)
    private Set<OrderDetail> orderDeteils = new LinkedHashSet<>();

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<OrderDetail> getOrderDeteils() {
        return orderDeteils;
    }
    public void setOrderDeteils(Set<OrderDetail> orderDeteils) {
        this.orderDeteils = orderDeteils;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDateTime getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(LocalDateTime lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getCategotyId() {
        return categotyId;
    }

    public void setCategotyId(Integer categotyId) {
        this.categotyId = categotyId;
    }
}