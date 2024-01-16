#   Terminal Operations
 - Terminal Operations perform an action on the Stream and return a value from the Stream
 - A stream will no longer be usable if a terminal operation os performed on a terminal operation. 
 -  Reductions are a special type of terminal operation where all of the contents of the stream are combined into a single primitive or Object. 
 - Below is a list of the terminal operations: 

**Terminal stream operations**
>
> |Method|What happens for infinite streams| Return value |Reduction|
> |------|---------------------------------|--------------|---------|
> |count() |Does not terminate | long         |Yes|
> |min()<br/>max() |Does not terminate | Optional<T>  | Yes          |
> |findAny()<br/>findFirst() |Terminates | Optional<T>  | No           |
> |allMatch()<br/>anyMatch()<br/>noneMatch() |Sometimes terminates | boolean      | No           |
> |forEach() |Does not terminate | void         | No           |
> |reduce() |Does not terminate | Varies       | Yes          |
> |collect() |Does not terminate | Varies       | Yes          |

### Counting 
 - The `count()` method determines the number of elements in a finite stream. 
 - For an infinite stream, it never terminates. 
 - The `count()` method is a reduction because it looks at each element in the stream and returns a single value. The method signature is as follows:

```java
public long count()
```

&emsp;&emsp;
 - This example shows calling `count()` on a finite stream:

```java
Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
System.out.println(s.count()); // 3
```

### Max and Min
 - The `min()` and `max()` methods allow you to pass a custom comparator and find the
smallest or largest value in a **finite** stream according to that sort order. 
 - Like the `count()` method, `min()` and `max()` hang on an infinite stream because they cannot be sure that a smaller or larger value isn’t coming later in the stream. 
 - Both methods are reductions because they return a single value after looking at the entire stream. The method signatures are as follows:

```java
public Optional<T> min(Comparator<? super T> comparator)
public Optional<T> max(Comparator<? super T> comparator)
```

&emsp;&emsp;
This example finds the animal with the fewest letters in its name:

```java
Stream<String> s = Stream.of("monkey", "ape", "bonobo");
Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
min.ifPresent(System.out::println); // ape
```

&emsp;&emsp;
 - Notice that the code returns an Optional rather than the value. This allows the method to specify that no minimum or maximum was found. 
 - We use the Optional method `ifPresent()` and a method reference to print out the minimum only if one is found. As an
example of where there isn’t a minimum, let’s look at an empty stream:

```java
Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
System.out.println(minEmpty.isPresent()); // false
```

&emsp;&emsp;
Since the stream is empty, the comparator is never called, and no value is present in
the Optional.

**Optional<T> findAny()**
- Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
- Terminates on an infinite stream
- It is not a reduction operation - simply returns any element in the Stream

**Optional<T> findFirst()**
- Returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.
- Terminates on an infinite stream
- It is not a reduction operation - simply returns any element in the Stream

**void forEach(Consumer<? super T> action)**
- Performs an action for each element of this stream.
- Typically used for printing
- It is a reduction 
- For an infinite stream, it does not terminate

**void forEachOrdered(Consumer<? super T> action)**
- Performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order.

**Optional<T> reduce(BinaryOperator<T> accumulator)**
- Performs a reduction on the elements of this stream, using an associative accumulation function, and returns an Optional describing the reduced value, if any.
- Obviously, it is a reduction

**T  reduce(T identity, BinaryOperator<T> accumulator)**
- Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value.

**<U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)**
- Performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions.

**Object[] toArray()**
- Returns an array containing the elements of this stream.

**<A> A[] toArray(IntFunction<A[]> generator)**
- Returns an array containing the elements of this stream, using the provided generator function to allocate the returned array, as well as any additional arrays that might be required for a partitioned execution or for resizing.

**default List<T> toList()**
- Accumulates the elements of this stream into a List.