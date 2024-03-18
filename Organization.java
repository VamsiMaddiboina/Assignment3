class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor to initialize the properties
    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    // Method to print the object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    // Overriding the clone() method to create a copy of the object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Main method for demonstration
    public static void main(String[] args) {
        try {
            Organization org = new Organization("001", "Tech Corp", "123 Tech Street");
            Organization orgClone = (Organization) org.clone();

            // Printing details of the original object
            System.out.println("Original Organization:");
            org.printDetails();

            // Printing details of the cloned object
            System.out.println("\nCloned Organization:");
            orgClone.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
