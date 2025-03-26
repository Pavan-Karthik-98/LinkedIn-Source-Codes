class IPhone {  
    // Properties (attributes)  
    String model;  
    double price;  
    String color;  

    // Constructor (initializes the object)  
    public IPhone(String model, double price, String color) {  
        this.model = model;  
        this.price = price;  
        this.color = color;  
    }  

    // Method (behavior)  
    void displayInfo() {  
        System.out.println("iPhone " + model + " | Price: $" + price + " | Color: " + color);  
    }  
}  

// Creating an object (instance of the class)  
IPhone myPhone = new IPhone("15 Pro", 999.99, "Titanium Black");  
myPhone.displayInfo();  