class IPhone {
    String model;
    double price;

    // Default constructor (auto-added if none exists)
    // public IPhone() { } 

    // Parameterized constructor
    public IPhone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using parameterized constructor
        IPhone myPhone = new IPhone("15 Pro", 999);
        myPhone.displayInfo();
    }
}