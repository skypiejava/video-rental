package uk.co.teamstag.videorental.domain;

import java.io.Serializable;

public class Product implements Serializable {

    private String description;
    private Double price;
    private String title;
    private String genre;
    private String esbRating;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Price: " + price);
        return buffer.toString();
    }
}
