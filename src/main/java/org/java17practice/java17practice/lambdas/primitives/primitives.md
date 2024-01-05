## Functional Interfaces for Primitives
Remember when we told you to memorize Table 8.4 with the common functional interfaces?
Did you? If you didn’t, go do it now. We’ll wait. We are about to make it more involved.
There are also a large number of special functional interfaces for primitives. These are useful
in Chapter 10 when we cover streams and optionals. <br />

&emsp;&emsp;
Most of them are for the double, int, and long types. There is one exception, which is
BooleanSupplier. We cover that before introducing the functional interfaces for double,
int, and long.

### &emsp;&emsp; 1. Functional Interfaces for boolean
BooleanSupplier is a separate type. It has one method to implement:

```java
@FunctionalInterface
public interface BooleanSupplier {
    boolean getAsBoolean();
}
```

&emsp;&emsp;
It works just as you’ve come to expect from functional interfaces. Here’s an example:

```java
12: BooleanSupplier b1 = () -> true;
13: BooleanSupplier b2 = () -> Math.random() > .5;
14: System.out.println(b1.getAsBoolean()); // true
15: System.out.println(b2.getAsBoolean()); // false
```

&emsp;&emsp;
Lines 12 and 13 each create a BooleanSupplier, which is the only functional interface
for boolean. Line 14 prints true, since it is the result of b1. Line 15 prints true or false,
depending on the random value generated.

### &emsp;&emsp; 2. Functional Interfaces for double, int, and long
Most of the functional interfaces are for double, int, and long. Table 8.6 shows the
equivalent of Table 8.4 for these primitives. You probably won’t be surprised that you have
to memorize it. Luckily, you’ve memorized Table 8.4 by now and can apply what you’ve
learned to Table 8.6.

> **Table 8.6**: Common functional interfaces for primitives

|Functional interfaces|Return type|Single abstract method| # of parameters |
|---------------------|-----------|-----------------------|-----------------|
|DoubleSupplier |double |getAsDouble() | 0               |
|IntSupplier |int |getAsInt() | 0               |
|LongSupplier |long |getAsLong() | 0               |
|DoubleConsumer |void |accept| 1 (double)      |
|IntConsumer |void |accept| 1 (int)         |
|LongConsumer |void |accept| 1 (long)        |
|DoublePredicate |boolean |test| 1 (double)      |
|IntPredicate |boolean |test| 1 (int)         |
|LongPredicate |boolean |test| 1 (long)        |
|DoubleFunction |R |apply| 1 (double)      |
|IntFunction |R |apply| 1 (int)         |
|LongFunction |R |apply| 1 (long)        |
|DoubleUnaryOperator |double |applyAsDouble| 1 (double)      |
|IntUnaryOperator |int |applyAsInt| 1 (int)         |
|LongUnaryOperator |long |applyAsLong| 1 (long)        |
|DoubleBinaryOperator |double |applyAsDouble| 2 (double, double)|
|IntBinaryOperator |int |applyAsInt| 2 (int, int)    |
|LongBinaryOperator |long |applyAsLong| 2 (long, long)   |

&emsp;&emsp;
There are a few things to notice that are different between Table 8.4 and Table 8.6:

- Generics are gone from some of the interfaces, and instead the type name tells us what
  primitive type is involved. In other cases, such as IntFunction, only the return type
  generic is needed because we’re converting a primitive int into an object.
- The single abstract method is often renamed when a primitive type is returned.

&emsp;&emsp;
In addition to Table 8.4 equivalents, some interfaces are specific to primitives. Table 8.7
lists these. <br />

> **Table 8.7** Primitive-specific functional interfaces

|Functional interfaces|Return type|Single abstract method| # of parameters |
|---------------------|-----------|-----------------------|-----------------|
|ToDoubleFunction<T>|double|applyAsDouble| 1 (T)           |
|ToIntFunction<T>|int|applyAsInt| 1 (T)|
|ToLongFunction<T>|long|applyAsLong| 1 (T)|
|ToDoubleBiFunction<T,U>|double|applyAsDouble| 2 (T, U)|
|ToIntBiFunction<T,U>|int|applyAsInt| 2 (T, U)|
|ToLongBiFunction<T,U>|long|applyAsLong| 2 (T, U)|
|DoubleToIntFunction|double|applyAsInt| 1 (double)|
|DoubleToLongFunction|double|applyAsLong| 1 (double)|
|IntToDoubleFunction|int|applyAsDouble| 1 (int)|
|IntToLongFunction|int|applyAsLong| 1 (int)|
|LongToDoubleFunction|long|applyAsDouble| 1 (long)|
|LongToIntFunction|long|applyAsInt| 1 (long)|
|ObjDoubleConsumer<T>|void|accept| 2 (T, double)|
|ObjIntConsumer<T>|void|accept| 2 (T, int)|
|ObjLongConsumer<T>|void|accept| 2 (T, long)|

&emsp;&emsp;
We’ve been using functional interfaces for a while now, so you should have a good grasp
of how to read the table. Let’s do one example just to be sure. Which functional interface
would you use to fill in the blank to make the following code compile?

```java
var d = 1.0;
______ f1 = x -> 1;
f1.applyAsInt(d);
```

&emsp;&emsp;
When you see a question like this, look for clues. You can see that the functional interface
in question takes a double parameter and returns an int. You can also see that it has a single
abstract method named applyAsInt. The DoubleToIntFunction and ToIntFunction
functional interfaces meet all three of those criteria.