# Predicate

 - A predicate is a functional interface that has one abstract method, test. 
 - Below is the signature for the test method: 
```
   boolean test(T t);
```
 - It takes in a typed parameter, T and returns a bolean result.
 - Predicate also has three default methods: 
````
Predicate<T> negate(),
Predicate<T> and(),
Predicate<T> or(),
````

Below is sample implementation of the Predicate functional interface
```
public class Main {

    public static void main(String[] args) {
        Integer in = Integer.parseInt("5");
        Integer in2 = Integer.parseInt("11");
        Integer in3 = Integer.parseInt("5");
        Integer in4 = Integer.parseInt("0");

        Predicate<Integer> predicate = integer -> integer%2==0;
        System.out.println("Even test for "+ in + "  "+ check(in, predicate));
        //Using predicate or
        System.out.println("Even or not equal to 0 " + in2 + "  " + predicate.or(integer -> integer!=0).test(in4));
        //Using predicate and
        System.out.println("Even and greater than 5 " + in2 + "  " + predicate.and(integer -> integer>5).test(in2));
    }

    public static <T> boolean check(T t, Predicate<T> predicate){
       return predicate.test(t);
    }
}
```

