package com.enigma.watchstore.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "WatchDetailEntity")
@Table(name = "watch_detail")
public class WatchDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")

    private Integer id;

    @Column(name = "product_name")
    private String productName;

    @Column
    private String description;

    @Column
    private Integer price;

    @Column
    private Integer stock;

    public WatchDetailEntity() {
    }

    public WatchDetailEntity(String productName, String description, Integer price, Integer stock) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public WatchDetailEntity(Integer id, String productName, String description, Integer price, Integer stock) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "StudentEntity [description=" + description + ", id=" + id + ", price=" + price + ", productName="
                + productName + ", stock=" + stock + "]";
    }

}