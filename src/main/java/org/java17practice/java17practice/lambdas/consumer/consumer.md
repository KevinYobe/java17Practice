# Consumer
 - A Consumer takes in a parameter and does not return anything from the parameter. 
 - A BiConsumer takes in two parameters and does not return anything


Below is the definition of a consumer and BiConsumer:
````java
@FunctionalInterface
public interface Consumer<T> {
void accept(T t);

}
// omitted default methods

@FunctionalInterface
public interface BiConsumer<T, U> {
void accept(T t, U u);

}
// omitted default methods

````

- A common example of a consumer is println;

`````java
Consumer<String> c1 = System.out::println;
Consumer<String> c2 = x -> System.out.println(x);

c1.accept("Praise"); // Annie
c2.accept("Adriel"); // Annie
``````
Below is a classic example of a consumer and supplier: 

````java
public class ConsumerTest<T> {
    public static void main(String[] args) {
        ArrayList<String> strings =new ArrayList<>();
        ArrayList<Integer> integers =new ArrayList<>();
        addElementToConsumer(31, integers::add);
        addElementToConsumer("Kevin", strings::add);

        Integer integer = getElements(()->integers.get(0));
        String string = getElements(()->strings.get(0));

        System.out.println(integer);
        System.out.println(string);
    }

    public static <T> void addElementToConsumer(T element, Consumer<T> consumer){
        consumer.accept(element);
    }

    public static <T> T getElements(Supplier<T> supplier){
        return supplier.get();
    }
}
````

# BiConsumer 
 - A BiConsumer is the same as a consumer, except that it takes 2 parameters, which may be of different types.
#### Classic example:
````java

public class BiConsumerTest {
    public static void main(String[] args) {
        Map<Integer, String> cities = new HashMap<>();
        addValues(1, "Harare", cities::put);
        addValues(1, "Gaborone", cities::put);
        System.out.println(cities);
    }
    
    public static <T, U> void addValues(T key, U value, BiConsumer<T, U> biConsumer){
        biConsumer.accept(key, value);
    }
    
    
}
````

 - Consumer also has a default method, andThen(). 




