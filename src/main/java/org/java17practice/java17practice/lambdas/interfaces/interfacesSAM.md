#  Abstract Method Interfaces (SAM)
 - A single abstract method interface is an interface that has only one abstract method. 
 - It can have more than one static and default methods. 
 - SAM are commonly used with lambda expressions and method references. 

Below are some valid SAM

```
 public interface Athlete {

    void excersice();

    default void exercise(String athlete){
        String message = athlete+" is in the gym, doing some workouts";
        System.out.println("This is a default method "+message);
    }


}
```

## Built in functional interfaces 

 - There is a large number of built in functional interfaces. 
 - Most of these are under the provided in the java.util.function package. 
 - Below is a list of a the core functional interfaces under java.util.function package. 
> **Core Functional Interfaces**

|Functional interface|Return type| Method name  |# of parameters|
|--------------------|-----------|--------------|---------------|
|Supplier<T> |T | get()        |0|
|Consumer<T> |void | accept(T)    |1 (T)|
|BiConsumer<T, U> |void | accept(T, U) |2 (T, U)|
|Predicate<T> |boolean | test(T)      |1 (T)|
|BiPredicate<T, U> |boolean | test(T, U)   |2 (T, U)|
|Function<T, R> |R | apply(T)     |1 (T)|
|BiFunction<T, U, R> |R | apply(T, U)  |2 (T, U)|
|UnaryOperator<T> |T | apply(T)     |1 (T)|
|BinaryOperator<T> |T | apply(T, T)  |2 (T, T)|

 - For the exam, you will need to memorize and remember the table above. 

