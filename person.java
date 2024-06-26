/* 
 Write a Java program to create a class known as Person with methods called getFirstName()

and getLastName(). create a class Employee extends Person with its own methods

like getSalary(). Create a class Manager extends Employee with its own method getPost().

Create a class citizen extends Person with its own method getCitizenship()

Show single, multi level and hirarchical inheritance.
*/
class Person {
        private String firstName;
        private String lastName;

        // Constructor
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Method to get first name
        public String getFirstName() {
            return firstName;
        }

        // Method to get last name
        public String getLastName() {
            return lastName;
        }
    }

    // Employee class extending Person
    class Employee extends Person {
        private double salary;

        // Constructor
        public Employee(String firstName, String lastName, double salary) {
            super(firstName, lastName);
            this.salary = salary;
        }

        // Method to get salary
        public double getSalary() {
            return salary;
        }
    }

    // Manager class extending Employee
    class Manager extends Employee {
        private String post;

        // Constructor
        public Manager(String firstName, String lastName, double salary, String post) {
            super(firstName, lastName, salary);
            this.post = post;
        }

        // Method to get post
        public String getPost() {
            return post;
        }
    }

    // Citizen class extending Person
    class Citizen extends Person {
        private String citizenship;

        // Constructor
        public Citizen(String firstName, String lastName, String citizenship) {
            super(firstName, lastName);
            this.citizenship = citizenship;
        }

        // Method to get citizenship
        public String getCitizenship() {
            return citizenship;
        }
    }

    // Main class
    class Main {
        public static void main(String[] args) {
            // Single inheritance: Employee class extends Person class
            Employee emp = new Employee("John", "Doe", 50000);
            System.out.println("Employee: " + emp.getFirstName() + " " + emp.getLastName() + ", Salary: $" + emp.getSalary());

            // Multilevel inheritance: Manager class extends Employee class, which extends Person class
            Manager manager = new Manager("Alice", "Smith", 80000, "Senior Manager");
            System.out.println("Manager: " + manager.getFirstName() + " " + manager.getLastName() + ", Salary: $" + manager.getSalary() + ", Post: " + manager.getPost());

            // Hierarchical inheritance: Citizen class extends Person class
            Citizen citizen = new Citizen("Bob", "Johnson", "American");
            System.out.println("Citizen: " + citizen.getFirstName() + ", Citizenship: " + citizen.getCitizenship());

        }
        }