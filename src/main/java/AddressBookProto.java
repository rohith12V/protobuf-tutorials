import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import tutorial.AddressBookProtos.AddressBook;
import tutorial.AddressBookProtos.Child;
import tutorial.AddressBookProtos.Child.PhoneNumber;

public class AddressBookProto {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        // least dependant to most dependant
        PhoneNumber.Builder phoneNumber = PhoneNumber.newBuilder();
        Child.Builder child = Child.newBuilder();
        AddressBook.Builder addressBook = AddressBook.newBuilder();


        phoneNumber.setNumber("+918638389");
        child.setName("Rohith")
                .setId(123)
                .setEmail("reddyrohith")
                .addPhones(phoneNumber);
        addressBook
                .addPeople(child)
                .addPeople(child);

        String jsonString = JsonFormat.printer().print(addressBook);
        System.out.println(jsonString);
    }
}
