//Subclass of Snack
public class Chips extends Snack {

    //declare variables
    private String flavor;
    private String type;

    //default method with no constructors
    public Chips() {
    }

    //sets all variables using constructors
    Chips(String name, String brand, double price, String flavor, String type,
          double weight, int calories, String image, int quantity, String productID) {

        super.setName(name);
        super.setWeight(weight);
        super.setCalories(calories);
        super.setPrice(price);
        super.setBrand(brand);
        this.setFlavor(flavor);
        this.setType(type);
        super.setImage(image);
        super.setQuantity(quantity);
        super.setProductID(productID);
    }

    //getters and setters
    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return this.flavor;
    }

    protected void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getName() {
        return super.getName();
    }

    public double getPrice() {
        return super.getPrice();
    }

    public double getWeight() {
        return super.getWeight();
    }

    public int getCalories() {
        return super.getCalories();
    }

    public String getBrand() {
        return super.getBrand();
    }

    public String getImage() {
        return super.getImage();
    }

    public int getQuantity() {
        return super.getQuantity();
    }

    public String getProductID() {
        return super.getProductID();
    }

    //toString method
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15.2f%-12s%-12s%-12.2f%-12d%-12d%-12s", brand, name, price, flavor, type,
                weight, calories, quantity, productID);
    }
}