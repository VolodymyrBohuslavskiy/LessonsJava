package Tasks.collections.zoo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
public class zooClub {
    private Map<Person, List<Pet>> club;
}
@AllArgsConstructor
@Data
class Person{
    private String name;
}
@AllArgsConstructor
@Data
class Pet{
    private String petName;
    private String owner;
}