package org.example;

public class SingletonPatternExample {
    // The unique instance of the Singleton class
    private static SingletonPatternExample instance;

    // Private constructor to prevent instance creation outside the class
    private SingletonPatternExample() {
    }

    // Public method to access the unique instance
    public static SingletonPatternExample getInstance() {
        // If the instance has not been created yet, create it
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    // Instance methods
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

    public static void main(String[] args) {
        // Get the Singleton instance
        SingletonPatternExample singleton = SingletonPatternExample.getInstance();

        // Execute some method on the Singleton instance
        singleton.doSomething();
    }
}
