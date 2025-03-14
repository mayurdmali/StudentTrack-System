# **StudentTrack System Using Collection Framework**

## **Project Description**
The **StudentTrack System** is a Java-based application designed to efficiently manage student records using the **Collection Framework**. This system eliminates the need for a database by leveraging **ArrayList** to store and manipulate student data dynamically.

## **Key Features**

- **Add Student Details:**
  - Allows users to add new students with details like **ID, Name, Age, and Marks**.
  - Uses an `ArrayList` to store student records.

- **Search & Retrieve Student Details:**
  - Search for a student using **ID or Name**.

- **Display All Students:**
  - Show a list of all registered students in a structured format.

## **Technology Used**

- **Programming Language:** Java  
- **Concepts:** Collection Framework (`ArrayList`), OOPs (Encapsulation, Inheritance), Exception Handling  
- **Architecture:** Layered Architecture (Entity, DAO, Service, Controller, and Client Layers)

## **Project Structure**

1. **Entity Layer:** Represents the `Student` class with attributes like ID, name, age, and marks.
2. **DAO Layer (Data Access Object):** Manages data storage and retrieval using `ArrayList`.
3. **Service Layer:** Implements business logic for managing student records.
4. **Controller Layer:** Handles user requests and communicates between the service and client.
5. **Client Layer:** Provides the user interface for interacting with the system.

## **Advantages**

✅ No external database required, reducing complexity  
✅ Easy to modify and extend features  
✅ Modular code structure using **Layered Architecture**  
✅ Improved separation of concerns for better maintainability  

## **How to Run the Project**
1. Clone this repository:
   ```sh
   git clone https://github.com/mayurdmali/StudentTrack-System.git
   ```
2. Navigate to the project directory:
   ```sh
   cd StudentTrack-System
   ```
3. Compile and run the Java program:
   ```sh
   javac StudentTrack.java
   java StudentTrack
   ```

## **Contributing**
Feel free to contribute to this project by adding new features or optimizing the code. Submit a pull request with your updates!

---

🚀 **Happy Coding!**
