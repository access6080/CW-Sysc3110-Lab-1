import java.util.ArrayList;

public class AddressBook extends BuddyInfo {
    private final ArrayList<BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }

    public void printAddressBook() {
        for (BuddyInfo record : addressBook){
            System.out.println(record.getName() + "\n" +  record.getAddress() + "\n" + record.getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        BuddyInfo homer = new BuddyInfo("Homer", "1900 Capwood", "123-456-7898");
        book.addBuddy(homer);
        book.printAddressBook();
    }
}
