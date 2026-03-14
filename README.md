# Ex7_2 - Product Viewer App

A Java console application that demonstrates **Object-Oriented Programming (OOP)** principles including encapsulation, constructors, getters/setters, and a multi-tiered architecture.

---

## 📋 Description

This application allows a user to look up product information by entering a product code. It is structured using a **three-tiered architecture**:

| Tier | Class | Responsibility |
|---|---|---|
| Presentation | `ProductApp.java` | Handles user input/output via console |
| Business | `Product.java` | Defines the Product object and its data |
| Data | `ProductDB.java` | Simulates retrieving product data |

---

## 🗂️ Project Structure

```
Ex7_2_Product/
├── src/
│   ├── Product.java
│   ├── ProductDB.java
│   └── ProductApp.java
├── bin/
├── .project
└── .classpath
```

---

## 🚀 How to Run

### In Eclipse
1. Import the project: `File → Import → Existing Projects into Workspace`
2. Select the `Ex7_2_Product` folder
3. Right-click `ProductApp.java` → `Run As → Java Application`
4. Enter a product code when prompted

### In Terminal
```bash
cd Ex7_2_Product
javac -d bin src/*.java
java -cp bin ProductApp
```

---

## 💻 Sample Output

```
Welcome to the Product Viewer
=============================

Enter product code (java, jsps, cs): java

Product Data
------------
Code:        java
Description: Murach's Java Programming
Price:       $57.50

Continue? (y/n): n

Goodbye!
```

---

## 🧠 Classes

### `Product.java`
- **Fields (private):** `code`, `description`, `price`
- **Constructors:** default, parameterized, copy constructor
- **Methods:** getters, setters, `getPriceFormatted()`, `printToConsole()`

### `ProductDB.java`
- Static method `getProduct(String code)` that returns a `Product` object
- Simulates a database lookup using if/else logic

### `ProductApp.java`
- Contains `main()` method
- Uses a loop to let user look up multiple products
- Calls `ProductDB.getProduct()` and displays results using `Product` getter methods

---

## 🔑 OOP Concepts Demonstrated

- **Encapsulation** – all fields are `private`, accessed via public getters/setters
- **Constructors** – default, parameterized, and copy constructors
- **Static methods** – used in `ProductDB` for data access
- **Three-tiered architecture** – presentation, business, and data tiers separated into distinct classes

---

## 📚 Course Info

- **Course:** Java Programming
- **Chapter:** 7 – An Introduction to Classes and Objects
- **Exercise:** 7-2
