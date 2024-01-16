# Streams 
 - A stream in java is an organised sequence of data. 
 - Stream pipelines are the operations that are run on the stream to produce a result. 
 - A stream pipeline consists of operations that are run on the pipeline to produce a result. 

## Pipeline Flow
 - A stream consits of 3 parts, which are:-

**1. Source**: Where the stream comes from
**2. Intermediate Operations**: Transform the stream into another stream
**3. Terminal Operation: Produce** a result. A stream can only be used once, so the stream is no longer valid after the terminal operation.
- A stream does not store data. Rather, data is generated upfront, and as needed.
- Streams, thus, are lazy evaluated. This means that data is only generated when needed, i.e. when there is a terminal operation in the stream. 
- Computation on source data is only done when the terminal operation is initiated. No terminal operation = no computation
- Lazy evaluation also means that Stream will stop processing the data at the earliest convenience. 

## Streams and Concurrency

- Unless the source was explicitly designed for concurrent modification (such as a ConcurrentHashMap), unpredictable or erroneous behavior may result from modifying the stream source while it is being queried

## Collections vs Streams 
- Collections and streams have some similarities but have different goals. 
- Collections are concerned with efficient access and management of data elements
- Streams provide a means to directly access their data elements.
- Streams therefore are mainly concerned with the source and aggregate computational methods that wil be performed on the source


## Creating a Stream 

### Finite Streams

1. You can create a Stream from an array using the Static method Arrays.stream(data);
````java
Double[] doubleNums = {1.1, 2.0, 3.5, 4.5, 990.1};

Arrays
        .stream(doubleNums)
        .forEach(System.out::println);
````
2. From a collection
````java
List<String> list = List.of("Kevin ", "Praise ", "Adriel ", "Adriella " );
Stream<String> stream = list.stream();
stream.forEach(System.out::println);
````
3. Using the Stream.of() method. 
`````java
Stream<Double> doubleStream = Stream.of(10.5, 11.5);
        doubleStream.forEach(System.out::println);
``````
4. From a file 
 - The Files.lines method returns a stream. Example below
`````java
        Path path = Paths.get("file.txt");
        try(Stream<String> stream1 = Files.lines(path)){
            stream1.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
``````

5. You can use a builder to create a new Stream
 - A builder will take Object only as the parameter type.

`````java
        Stream<Object> builderStream = Stream.builder()
                .add("Kevin Hart")
                .add("Gabriel Iglesius")
                .add("Nijo")
                .build();
        builderStream.forEach(System.out::println);
``````

6. Using Stream.concat() method

````java
        Stream<Double> doubleStream1 = Stream.of(10.12, 11.5);
        Stream<Double> doubleStream2 = Stream.of(10.5, 11.5);

        Stream<Double> concatStreams = Stream.concat(doubleStream1, doubleStream2);
````
        
        

7. Using Stream.empty() to create an empty Stream. 


### Infinite Streams
 - We can generate infite streams with Java using 2 methods of the Stream class: 
1. Stream.generate();
2. Stream.iterate method. 

`````java
        Stream<Double> doubleStream3 = Stream.iterate(1.1, n->n*2);
        doubleStream3
                .limit(30)
                .forEach(System.out::println);

        Stream<Double> integerStream = Stream.generate(()->Math.random());
``````
