package info.dmerej.contacts;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactsGenerator {
  public Stream<Contact> generateContacts(int count) {
    // TODO: generate a *lot* of contacts instead of just 3
    Contact[] contacts = new Contact[]{
      new Contact("Alice", "alice@aol.com"),
      new Contact("Bob", "bob@gmail.com"),
      new Contact("Eve", "eve@fastmail.com"),
    };
    return Arrays.stream(contacts);
  }
}
