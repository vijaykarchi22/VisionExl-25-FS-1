Here's a comprehensive set of assignments and interview questions for Java access modifiers:

###  1. Basic Access Modifier Assignments

1. **Package-Level Access**
   
```java
// Assignment 1: Package Access
package com.example.mypackage;

class Animal {
    String name;          // default access
    void eat() {          // default access
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    void bark() {
        eat();            // Can access default method
        System.out.println(name); // Can access default field
    }
}
```


2. **Protected Access**
  
```java
// Assignment 2: Protected Access
package com.example.mypackage;

public class Vehicle {
    protected String brand;
    protected void startEngine() {
        System.out.println(brand + " engine started");
    }
}

package com.example.otherpackage;

public class Car extends Vehicle {
    void drive() {
        startEngine();     // Can access protected method
        brand = "Toyota";  // Can access protected field
    }
}
```



###  2. Advanced Access Modifier Assignments

1. **Encapsulation Practice**

```java
// Assignment 3: Encapsulation
public class BankAccount {
    private double balance;
    private String accountNumber;
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    protected void updateAccountNumber(String newNumber) {
        accountNumber = newNumber;
    }
}
```


2. **Interface Implementation**

```java
// Assignment 4: Interface Access
public interface Printable {
    void print();         // public by default
}

class Document implements Printable {
    private String content;
    
    @Override
    public void print() { // must be public
        System.out.println(content);
    }
    
    protected void setContent(String content) {
        this.content = content;
    }
}
```



###  3. Interview Questions and Answers

1. **Basic Questions**  - Q: What are the four types of access modifiers in Java?


A: public, private, protected, and default (no modifier)
  - Q: What is the difference between default and protected access?


A: Default access is limited to the same package, while protected adds access for subclasses in other packages
  - Q: Can a private method be overridden?


A: No, private methods cannot be overridden as they are not accessible in subclasses


2. **Intermediate Questions**  - Q: Why should instance variables be private?


A: To maintain encapsulation and prevent direct modification from outside the class
  - Q: What is the access level of interface methods?


A: All interface methods are public by default and must be implemented as public
  - Q: Can a subclass reduce the access level of an overridden method?


A: No, a subclass must provide at least the same level of access as the parent class


3. **Advanced Questions**  - Q: How does Java's access control system support the principle of encapsulation?


A: Through private members and public interfaces, allowing control over what is exposed to other classes
  - Q: What is the relationship between access modifiers and inheritance?


A: Access modifiers determine what members are available to subclasses, with protected members being accessible to all subclasses
  - Q: How do access modifiers affect unit testing?


A: Proper access modifier usage can make code more testable by exposing necessary interfaces while hiding implementation details



###  4. Practical Exercise

```java
// Assignment 5: Access Modifier Design
public class LibrarySystem {
    // Design a library system with appropriate access modifiers
    // Consider:
    // - Book class with title, author, status
    // - Library class with book management
    // - Patron class with borrowing capabilities
    // - Proper encapsulation and access control
}
```

###  5. Best Practices Quiz

1. True/False:
  - Instance variables should always be public
  - Methods in an interface are private by default
  - Protected members are accessible only within the same package
  - Private members can be accessed through reflection


2. Multiple Choice:
  - What is the most restrictive access modifier?


A) public
B) protected
C) default
D) private
  - Which of the following is NOT a valid access modifier?


A) public
B) private
C) protected
D) secure



Would you like me to provide additional examples or elaborate on any specific aspect of these assignments or questions?
