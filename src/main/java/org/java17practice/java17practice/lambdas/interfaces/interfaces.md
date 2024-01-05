#Interfaces

## What are interfaces

 - When you define an interface, you are specifying what the interface does , without specifying how it does that
 - Essentially, an interface is a contract that specifies what is to be done, without specifying how it is done. 
 - You sign the contract when you implement the interface using the keyword **implements**. 
 - The java compiler will ensure that all the concrete methods of an interface are implemented. 
 - You can only extend one class, but you can implement more than one interface.
 - Interfaces are implicitly abstract
 - All variables in an interface must be public, static and final.(Interfaces can only declare constants)

## Interface Concrete Methods 
 - You can inherit concrete methods from a class. 
 - Concrete methods in an interface are either static methods or default methods. 

## Rules for Interfaces 
 - You can implement multiple interfaces on a **class**
 - You can not implement an interface on another interface
 - You can not extend an interface on a class **implement** it!!
 - An interface can have 0 or more abstract methods. Where an abstract method is defined, the implementing class must provide an implementation for the abstract method. 
 - An interface can have 0 or more default and static methods.




