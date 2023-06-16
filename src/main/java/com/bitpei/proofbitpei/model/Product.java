package com.bitpei.proofbitpei.model;

import javax.persistence.*;

// POJO - Pain Old Java Object
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "url_Image", nullable = false)
    private String urlImage;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "active")
    private boolean active;


    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    public Product(String name, String brand, String description, String urlImage, double price, User createdBy) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.urlImage = urlImage;
        this.price = price;
        this.createdBy = createdBy;
    }

    public Product() {

    }
    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", price=" + price +
                ", createdBy=" + createdBy +
                '}';
    }
}//class Producto

