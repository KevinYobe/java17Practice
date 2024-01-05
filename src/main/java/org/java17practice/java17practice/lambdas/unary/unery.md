# Unery Operator
 - UneryOperator and BineryOperator are special cases of the Function.
 - The take in an input,, and transforms it into a return value with the same type as the input
 - UnaryOperator transforms value into one of the same time. 
 - Below is the definition of the functional interfaces:
 
 ````java
 @FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    // omitted static method
}

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
    // omitted static methods 
}
 ````




































