## Intermediate Operations 

- Intermediate Operations transform data into another stream. 
- Java has several intermdiate operations, as listed below

**1. Stream<T> distict()**
- Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.

**2. dropWhile(Predicate<? super T> predicate)**
- Returns, if this stream is ordered, a stream consisting of the remaining elements of this stream after dropping the longest prefix of elements that match the given predicate.

**3. filter(Predicate<? super T> predicate)**
- Returns a stream consisting of the elements of this stream that match the given predicate.

**4. flatMap(Function<? super T,? extends Stream<? extends R>> mapper)**
- Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.

**5. flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)**
- Returns an DoubleStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.

**6. flatMapToInt(Function<? super T,? extends IntStream> mapper)**
- Returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.

**7. flatMapToLong(Function<? super T,? extends IntStream> mapper)**
- Returns an LongStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.

**8. limit(long maxSize)**
- Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.


**9. map(Function<? super T,? extends R> mapper)**
- Returns a stream consisting of the results of applying the given function to the elements of this stream.

**10. mapMulti(BiConsumer<? super T,? super Consumer<R>> mapper)**
- Returns a stream consisting of the results of replacing each element of this stream with multiple elements, specifically zero or more elements.

**11. mapMulti(BiConsumer<? super T,? super Consumer<R>> mapper)**
- Returns a stream consisting of the results of replacing each element of this stream with multiple elements, specifically zero or more elements.

**12. mapMultiToDouble(BiConsumer<? super T,? super DoubleConsumer> mapper)**
- Returns a DoubleStream consisting of the results of replacing each element of this stream with multiple elements, specifically zero or more elements.


**13. mapMultiToInt(BiConsumer<? super T,? super IntConsumer> mapper)**
- Returns an IntStream consisting of the results of replacing each element of this stream with multiple elements, specifically zero or more elements.


**14. mapMultiToLong(BiConsumer<? super T,? super LongConsumer> mapper)**
Returns a LongStream consisting of the results of replacing each element of this stream with multiple elements, specifically zero or more elements.


**15. mapToDouble(ToDoubleFunction<? super T> mapper)**
Returns a DoubleStream consisting of the results of applying the given function to the elements of this stream.

**16. mapToInt(ToIntFunction<? super T> mapper)**
Returns an IntStream consisting of the results of applying the given function to the elements of this stream.


**17. mapToLong(ToLongFunction<? super T> mapper)**
Returns a LongStream consisting of the results of applying the given function to the elements of this stream.


**18 peek(Consumer<? super T> action)**
Returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.


**19. skip(long n)**
Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.

**20. sorted()**
Returns a stream consisting of the elements of this stream, sorted according to natural order.

**21. sorted(Comparator<? super T> comparator)**
Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.

**22. takeWhile(Predicate<? super T> predicate)**
Returns, if this stream is ordered, a stream consisting of the longest prefix of elements taken from this stream that match the given predicate.