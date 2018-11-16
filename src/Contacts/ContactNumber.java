package Contacts;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ContactNumber {
  private   String type, number;
}
