# Function 
 - A Function is responsible for transforming a variable of a particular type into another type and returning it. 
 - A BiFunction takes a two parameteres with potentially different types and returns another different parameter. 
 - Below is the difinition for both Function and BiFunction. 
`````java
@FunctionalInterface
public interface Function<T, R> {
R apply(T t);
// omitted default and static methods
}

@FunctionalInterface
public interface BiFunction<T, U, R> {
R apply(T t, U u);
// omitted default method
}
``````

 - T is the input type, and R will be the return type 
 - Also for a BiFunction T and U are the input types, and R is the return type. 
`````java
public class BiFunctionTest {
    public static void main(String[] args) {
        String sentence = "My age is ";
        int age = 23;
        String full = concatenate(sentence, age,(x,y)->x.concat(y.toString()));
        System.out.println(full);

    }

    private static <T, U, R> R concatenate(T t, U u, BiFunction<T,U, R> biFunction){
        return biFunction.apply(t, u);
    }
}
``````