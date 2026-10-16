package uk.ac.westminster.products_api.dto;

public class DigitalProduct extends Product {
    private String dowloadUrl;
    private Double fileSizeMB;

    public DigitalProduct(Long id, String name, double price, String dowloadUrl, Double fileSizeMB) {
        super(id, name, price);
        this.dowloadUrl = dowloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDowloadUrl() {
        return dowloadUrl;
    }

    public void setDowloadUrl(String dowloadUrl) {
        this.dowloadUrl = dowloadUrl;
    }

    public Double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(Double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public void applyDiscount() {
        price = 0.0;
    }
}
