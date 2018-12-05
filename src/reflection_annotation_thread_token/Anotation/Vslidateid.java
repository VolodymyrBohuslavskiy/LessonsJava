package reflection_annotation_thread_token.Anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(
        {ElementType.FIELD,
        ElementType.LOCAL_VARIABLE,
        ElementType.TYPE,
        ElementType.PARAMETER})

public @interface Vslidateid {

    String massage();

    int defID();
}
