package Tasks.composition.composition_plus_array;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public  class Prinz {
private Popelushka tufelkaOwner;

private Popelushka GetPopelushka(){
    return this.tufelkaOwner;
}

}
