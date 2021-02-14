package com.enigma.watchstore.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "WatchDetailEntity")
@Table(name = "watch_detail")
public class WatchDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @Column(name = "product_name")
    private String productName;

    @Column
    private String description;

    @Column
    private Integer price;

    @Column
    private Integer stock;

    @ManyToOne(targetEntity = WatchSeriesEntity.class)
    @JoinColumn(name = "series_id", referencedColumnName = "id")
    private WatchSeriesEntity series;

    public WatchDetailEntity() {
    }

    public WatchDetailEntity(String productName, String description, Integer price, Integer stock,
            WatchSeriesEntity series) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.series = series;
    }

    public WatchDetailEntity(String id, String productName, String description, Integer price, Integer stock,
            WatchSeriesEntity series) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.series = series;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
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

    public WatchSeriesEntity getSeries() {
        return series;
    }

    public void setSeries(WatchSeriesEntity series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "WatchDetailEntity [description=" + description + ", id=" + id + ", price=" + price + ", productName="
                + productName + ", series=" + series + ", stock=" + stock + "]";
    }

}