package Videos_Enum_NestedClass_BuilderPatern_Lamda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class Main {
    public static void main(String[] args) {

        //                                   ENUM
        System.out.println(new TestClass("it's", Enum.SECOND).getAnEnum().number);
        System.out.println(new TestClass("it's", Enum.FIRST).getAnEnum().name);


        //                    nested classes (Може бути статичним)
        @Data
        @AllArgsConstructor
        class Nested {
            private int nested_int;
            private String nested_string;
            private Enum anEnum;

            @AllArgsConstructor
            @Data
            class InNested {
                private String string;
            }
        }

        new Nested(1, "str", Enum.THIRD).new InNested("string from InNested !");




//                                               BUILDER
        Acount.acountBuilder().Name("w").Email("A").ID(10);
        Acount.acountBuilder().Name("w").Email("A");
        Acount.acountBuilder().Name("w");



    }
}


//                                               BUILDER

class Acount {
    private int id;
    private String name;
    private String email;

    public static AcountBuilder acountBuilder() {
        return new AcountBuilder();
    }


    static class AcountBuilder {
        private Acount acount = new Acount();

        public AcountBuilder ID(int id) {
            acount.id = id;
            return this;
        }

        public AcountBuilder Name(String name) {
            acount.name = name;
            return this;
        }

        public AcountBuilder Email(String email) {
            acount.email = email;
            return this;
        }

        public Acount builder() {
            return acount;
        }
    }


}