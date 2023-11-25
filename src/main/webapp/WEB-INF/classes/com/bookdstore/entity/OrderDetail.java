package com.bookdstore.entity;


import javax.persistence.*;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "orderid")
    private BookOrder bookOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BookOrder getBookOrder() {
        return bookOrder;
    }

    public void setBookOrder(BookOrder bookOrder) {
        this.bookOrder = bookOrder;
    }

    @ManyToOne
    @JoinColumn(name = "bookid")
    private Book book;
    private Integer quality;
    private Float subTotal;



    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }



    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }


    public Integer getQuality() {
        return quality;
    }

    public Float getSubTotal() {
        return subTotal;
    }
}
