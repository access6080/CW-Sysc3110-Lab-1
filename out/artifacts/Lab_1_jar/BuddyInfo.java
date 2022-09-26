public class BuddyInfo {
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public String getName() {
        return name;
    }
    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {

        BuddyInfo homer = new BuddyInfo("Homer", "1900 Capwood", "123-456-7898");
        System.out.println("Hello " + homer.getName());
    }
}
