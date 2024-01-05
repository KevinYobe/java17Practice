# Supplier 

 - A supplier is a functional interface that has only one abstract method, get();
 - A supplier is used when you want to generate or supply values without taking any input. 

``````java
T get();
``````
 - You can create a LocalDate object using the factory method now(). This example shows how to use a Supplier to call this factory:
````java
Supplier<LocalDate> s1 = () -> LocalDate.now();

LocalDate d1 = s1.get();

System.out.println(d1); //It will print the current date. 
````
We can also use a Supplier to create a new instance of a class. Below is an example for a StringBuilder class. 

````java
Supplier<StringBuilder> s2 = () -> new StringBuilder();
````






