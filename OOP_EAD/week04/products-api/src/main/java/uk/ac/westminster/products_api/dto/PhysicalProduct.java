package uk.ac.westminster.products_api.dto;

public class PhysicalProduct extends Product{
    private Double weightKg;
    private String dimensions;

    public PhysicalProduct(Long id, String name, double price, Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
