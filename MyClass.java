public class MyClass {
    private static int instanceCount = 0; // Static variable to count instances
    private String name;

    public MyClass(String name) {
        this.name = name;
        instanceCount++; // Increment the instance count when an instance is created
    }

    public String getName() {
        return name;
    }

    public static int getInstanceCount() {
        return instanceCount; // Static method to access the instance count
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Instance 1");
        MyClass obj2 = new MyClass("Instance 2");
        MyClass obj3 = new MyClass("Instance 3");

        System.out.println("Number of instances created: " + MyClass.getInstanceCount());
        System.out.println("Instances created:");
        System.out.println("1. " + obj1.getName());
        System.out.println("2. " + obj2.getName());
        System.out.println("3. " + obj3.getName());
    }
}
