package org.collection;

//Create a class named "Product" with fields like prodId, prodName, category and price.
//        Create List of products and display total of all those products that comes
//        under "electronics" category

public class product {
    private int productId;
    private String prodName;
    private String category;
    private double price;

    public product(int productId, String prodName, String category, double price) {
        this.productId = productId;
        this.prodName = prodName;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "productId=" + productId +
                ", prodName='" + prodName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
