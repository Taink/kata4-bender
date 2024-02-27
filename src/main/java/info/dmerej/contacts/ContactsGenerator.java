package info.dmerej.contacts;

import java.util.stream.Stream;

public class ContactsGenerator {
  public Stream<Contact> generateContacts(int count) {
    var contacts = Stream.<Contact>builder();
    for (int i = 0; i < count ; i++) {
      contacts.add(new Contact(String.format("Nom-%d", i + 1), String.format("email-%d@tld", i + 1)));
    }
    return contacts.build();
  }
}
