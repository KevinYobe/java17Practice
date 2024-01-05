# Lambda Expressions
 - A lambda is a block of code that makes your code more concise. 
 - Lambda expressions ONLY work with functional interfaces.
 - You can consider lambda expressions to be an instance of a class that implements a functional interface. 
 - A lambda expression basically implements the method that is defined in the functional interface.
 - A lot is inferred by the compiler from the interface definition. A lambda is the instance that implements the interface and has been stripped down to bare essentials

## Variables in Lambda expressions
### Effectively Final 
 - Lambda expressions have access to variables that are defined in the enclosing scope. However, these variables must be **effectively final**.
 - Effectively final means that once the variable has been assigned, it may not be reassigned. Doing so will cause a compilation error
 - Below is an example: 
`````java
public class Crow {
    private String color;
    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
    }
}
``````
 - This shows that a lambda expression has access to variables that are defined in the enclosed scope. 
 - Below is an example: 
```java
2:  public class Crow {
3:      private String color;
4:      public void caw(String name) {
5:          String volume = "loudly";
6:          name = "Caty";
7:          color = "black";
8:
9:          Consumer<String> consumer = s ->
10:             System.out.println(name + " says " // DOES NOT COMPILE
11:                 + volume + " that she is " + color); // DOES NOT COMPILE
12:         volume = "softly";
13:     }
14: }
```
 - In this example, the method parameter name is not effectively final because it is set on
   line 6. However, the complier error occurs on line 10 when we try to use the variable name. 
 - Also, variable volume is reassigned on line 12. This will throw a compiler error**on line 12** because variable 12 is effectively final. 

### Redeclaring Variables 
 - You cannot redeclare a variable that has been declared in the enclosing scope. See below:
`````java
(a, b) -> { int a = 0; return 5; } // will not compile
``````
 - Above code will not compile because we have redeclared variable a . Consider the example below:
`````java
11: public void variables(int a) {
12:     int b = 1;
13:     Predicate<Integer> p1 = a -> {
14:         int b = 0;
15:         int c = 0;
16:         return b == c; }
17: }
``````
 - There are 3 syntax errors in the code above.
   1. Redeclared a on line 13. 
   2. Redeclared b on line 14. 
   3. Lambda block is not terminated on line 17. 

To review, make sure you’ve memorized table below:

> **Rules for accessing a variable from a lambda body inside a method**

|Variable type|Rule|
|-------------|----|
|Instance variable |Allowed|
|Static variable |Allowed|
|Local variable |Allowed if final or effectively final|
|Method parameter |Allowed if final or effectively final|
|Lambda parameter |Allowed|



