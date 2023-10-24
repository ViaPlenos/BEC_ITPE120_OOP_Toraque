public class Instance {
    private static int instanceCount = 0;
    private String name;

    public Myclass2(String name) {
        this.name = name;
        instanceCount++;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Instance Count: " + instanceCount);
        System.out.println();
    }

    public static void main(String[] args) {
        StaticVariableDemo obj1 = new StaticVariableDemo("Object 1");
        StaticVariableDemo obj2 = new StaticVariableDemo("Object 2");
        StaticVariableDemo obj3 = new StaticVariableDemo("Object 3");

        // Display information for each instance
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
    }
}
