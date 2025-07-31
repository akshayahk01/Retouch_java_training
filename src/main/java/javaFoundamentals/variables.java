package javaFoundamentals;

public class variables {

    // 🔸 Instance Variable (non-static, belongs to object)
    int instanceVar = 10;

    // 🔸 Static Variable (shared across all objects)
    static int staticVar = 20;

    public void display() {
        // 🔸 Local Variable (inside method, temporary)
        int localVar = 5;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Create object to access instance method
        variables obj = new variables();
        obj.display();

        // Access static variable directly
        System.out.println("Accessing Static Variable (from main): " + staticVar);
    }
}
