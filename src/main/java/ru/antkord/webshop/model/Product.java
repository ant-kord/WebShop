package ru.antkord.webshop.model;

import javax.persistence.*;

/**
 * Created by ant-kord on 06.01.2016.
 */
@Entity
@Table(name = "product")
public class Product extends NamedEntity{

    @Column(name = "description")
    private String description;

    @Column(name = "article")
    private String article;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private CatalogType type;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "maker_id")
    private Maker maker;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "isSymbolYear")
    private boolean isSymbolYear;

    @Column(name = "isNew")
    private boolean isNew;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CatalogType getType() {
        return type;
    }

    public void setType(CatalogType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isSymbolYear() {
        return isSymbolYear;
    }

    public void setIsSymbolYear(boolean isSymbolYear) {
        this.isSymbolYear = isSymbolYear;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
