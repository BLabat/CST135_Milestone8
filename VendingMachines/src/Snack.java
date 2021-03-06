//subclass of Product
public abstract class Snack extends Product implements Comparable<Product> {

    //sets variables
    double weight;
    int calories;
    String brand;

    //default method with no constructors
    Snack() {
    }

    //sets all variables using constructors
    public Snack(String name, String brand, double price, double weight, int calories, String image, int quantity, String productID) {
        super.setName(name);
        super.setPrice(price);
        this.setWeight(weight);
        this.setCalories(calories);
        this.setBrand(brand);
        super.setImage(image);
        super.setQuantity(quantity);
        super.setProductID(productID);
    }


    //getters and setters
    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    protected void setCalories(int calories) {
        this.calories = calories;
    }

    public String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return super.getName();
    }

    public double getPrice() {
        return super.getPrice();
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

    public int compareTo(Product other) {
        if (getName().toUpperCase().compareTo(other.getName().toUpperCase()) > 0) {
            return 1;
        } else if (getName().toUpperCase().compareTo(other.getName().toUpperCase()) < 0) {
            return -1;
        } else if (getPrice() > other.getPrice()) {
            return 1;
        } else if (getPrice() < other.getPrice()) {
            return -1;
        } else return 0;
    }

    //toString method
    public String toString() {
        return name.toUpperCase() + " " + weight + " " + calories + " " + quantity + " " + productID;
    }
}