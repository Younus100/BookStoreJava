package com.bookdstore.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class BookOrder {
    @Id
    private Integer orderID;
    private Integer customerID;
    private LocalDateTime orderDate;
    private String shippingAddress;
    private String recipientName;
    private String recipientPhone;
    private String paymentMethod;
    private Float orderTotal;
    private Integer orderStatus;

    @OneToMany(mappedBy = "bookOrder")
    private Set<OrderDetail> orderDetails = new HashSet<>();

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setOrderTotal(Float orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Float getOrderTotal() {
        return orderTotal;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }
}
