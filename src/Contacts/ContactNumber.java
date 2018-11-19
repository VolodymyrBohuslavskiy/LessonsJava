package Contacts;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class ContactNumber {
    private ArrayList<ContactNumber> contactNumbers;
}
