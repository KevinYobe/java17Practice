# BiPredicate Functional Interface

 - The BiPredicate functional interface takes in two parameters of different types and return a boolean value. 
 - Below is the method signature for the BiPredicate test method
~~~~
boolean test(T t, U u);
~~~~
 - BiPredicate also has 3 methods offered by Predicate: 
~~~~
BiPredicate<T> negate(),
BiPredicate<T> and(),
BiPredicate<T> or(),
````
~~~~

Below is sample implementation of the Predicate functional interface:
~~~
public class BiPredicateMain<T, U> {
    public static void main(String[] args) {
        String str = "This";
        Integer len = 4;
        System.out.println("Checking if the entered number equal to the string length  " + negated(str, len, (s, i) ->s.length()==i));
    }

    public static <T, U> boolean check(T t, U u, BiPredicate<T, U> biPredicate){
        return biPredicate.test(t, u);
    }
    public static <T, U> boolean negated(T t, U u, BiPredicate<T, U> biPredicate){
        return biPredicate.negate().test(t, u);
    }
}
~~~
