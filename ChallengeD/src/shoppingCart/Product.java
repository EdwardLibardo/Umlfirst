package shoppingCart;

public class Product {
    private String sku;
    private String name;
    private String description;

    // Defininmos el constructor
    public Product(String sku, String name, String description) {
        this.sku = sku;
        this.name = name;
        this.description = description;
    }
    //Se crean lo métodos Get
    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //Se crean los metodos Set

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
