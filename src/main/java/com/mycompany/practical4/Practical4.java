package com.mycompany.practical4;

class Animal {
  protected String brand = "Pitbul";        // Animal attribute
  public void bark() {                    // Animal method
    System.out.println("hoof, hoof!");
  }
}

class Animal extends Dog {
  private String dogName = "Tyga";    // dog attribute
  public static void main(String[] args) {

    // Create a myDog object
    Dog mydog = new Dog();

    // Call the bark() method (from the Animal class) on the myDog object
    myDog.bark();

    // Display the value of the brand attribute (from the Animal  class) and the value of the modelName from the Dog class
    System.out.println(myDog.brand + " " + myDog);
            
            
            
            
            
            
            
            
            
            
    
            
