# javase8demo

*****************
Exceptions
*****************

Exception class is the superclass of all other exceptions and it extends Throwable class.

In Java, java.lang.Exception class is the superclass of all exception objects. These objects contain the stack trace and all information regarding the exception.

The runtime environment (JRE) produces and throws the exception object whenever an exception occurs. The instant after an exception object is thrown, the program stops the execution. If the exception is not taken care of, then it is propagated to the calling environment. It can be either a runtime system or a calling method.

example:--an exception is generated inside the divide() method. Since the divide() method doesn't take care of it, the exception propagates to its calling environment, which is the main() method. The main() method also doesn't take care of it, and the exception propagates to its calling environment, which is the runtime.

When the runtime environment (JRE) receives the exception, it terminates the program and shows the stack trace.

Handling exceptions involves using the try-catch block for constructing an exception handler.

try {
    // Code that may throw exceptions
  
 
}
catch(Exception1 e1) {
    // Code for handling Exception1
}
catch(Exception2 e2) {
    // Code for handling Exception2
}
finally {
    // Will be discussed soon
}

The try block contains the code which may throw some exception. The try block is followed by single or multiple catch blocks or a finally block.

A catch block is an exception handler that can handle the exception specified as its argument. A catch block may accept Throwable objects or its subclasses objects.

If the suitable catch block is not found, the exception remains unhandled and propagated.

If no exception gets thrown from the try block, their subsequent catch blocks are ignored.

Best practice: The finally clause should normally have a code that does not throw exceptions. If the finally clause does throw an exception, one should log it or handle it and never allow it to bubble out.

Java allows us to explicitly generate or throw exceptions using the throw keyword:
example:-
Exception e = new Exception();
throw e;

Any  Throwable object type can be thrown.

We can customize the exception messages:
throw new Exception("The divisor should not be zero"); 

example:-
public static void divide(int x, int y) {
       try {       
           if(y == 0)
           throw new Exception("The divisor should not be zero");
           int z = x/y;
           System.out.println(z);   
       }
       catch(Exception e) {
           System.out.println(e.getMessage()); 
       }
}

Checked Exceptions either should be handled within the catch block or declared in the throws clause of a method. Exception and its subclasses are Checked Exceptions.

Checked exceptions occur at compile time, and should be handled or declared for propagation.

Unchecked exceptions occur at runtime, and need not be handled or declared for propagation.

*****************
User-Defined Exceptions
*********************

1)By extending the Exception class, we can define a user defined exception class:
public class MyDivException extends Exception { }
2)Using parameterized constructor:
public MyDivException(String message) {
super(message);
}
 
example:-
public static void divide(int x, int y) throws MyDivException {
       if(y == 0)
           throw new MyDivException("The divisor should not be zero"); 
       int z = x/y;
       System.out.println(z);
}
 By extending the RuntimeException class the custom exception becomes unchecked.
*****************
Enums
*****************

--An enum is a non-primitive data type that contains a fixed set of constants.
--All the constants are static and final implicitly.
--All enums implicitly extend java.lang.Enum class.
Since enums are reference data types, like class or interface, and hence, --we can define constructors, methods, and variables in an enum.

*****************
Abstract
*****************

--An abstract class cannot be instantiated using the new keyword.
The subclass of an abstract class can be only instantiated if it provides the implementation for all the abstract methods.
--If a class has at least one abstract method, then the class must be declared as abstract.
--If the subclass does not implement all the abstract methods, then the subclass must also be declared as abstract.
An abstract class can also have concrete methods i.e. methods with implementation.
--An abstract class reference can be assigned an object of its subclass, thereby achieving run-time polymorphism.
---All the abstract methods have been overridden in the subclass with their own implementations.

*****************
Interface
*****************

--An interface defines a contract for a class.
--Objects can't be created for interface and an interface cannot have private or protected members.
--In an interface, all methods are implicitly public and abstract and variables are implicitly public, static, and final.
--The class which implements the interface has to provide definitions for all abstract methods.
 --If at least one abstract method of the interface has not been overridden by the class that implemented the interface, make it abstract.
--Inheritance is possible in an interface and it supports multiple inheritance.

*****************
package
*****************

--a package is a grouping mechanism in Java that contains all related classes and interfaces.
--The package is a folder that contains all these related classes and interfaces.
--They also restrict access to certain classes and interfaces. We will study this later in this course.

--Without packages, we will end up having a huge amount of code that is not categorized properly. Hence it will be difficult to search and reuse them. Packaging helps in the functional grouping of the Java code.

--It is a good practice to make interfaces or classes which can be reused to save time, effort and to ensure consistency.

--An interface or class can be reused multiple times by multiple programs.

*****************
Java libraries
*****************

Java comes with a good set of API (Application programming interface). API is a set of all classes that are all a part of the JDK. It includes all Java packages, classes, and interfaces. These prewritten classes provide tremendous support to a developer while developing an application

1.Object class
--Object class is the implicit super class of all Java classes
--The methods in the Object class are inherited by all Java classes and they can be overridden
--A method which takes an object reference as a parameter and will accept any object as the parameter

boolean equals(object)-->	Compares two objects for equality
Class getClass()-->	Returns the Class to which the object belongs
int hashCode()-->	Represents a unique ID for the object
String toString()-->	Gives the String representation of any object


3.equals() method


--By default equals() from the Object class uses memory address to compare Object. (just like ==)
--According to the business requirement, this equals() method inherited by any class from the Object class can be overridden.

4.hashCode() method

--In Java, the hash table data structure is used in many classes for improving performance.
--To store/handle an object in the hash table, a hash code (32 bit number) is generated by the hashCode() method.
--Default implementation of hashCode() derives hash code value by using the memory address of the object.
--hashCode() from object class can be overridden according to the business requirement.
--String Class's overridden hashCode() derives hash code by taking the content of the string.

*****************
Wrapper Classes
*****************

--Java automatically converts primitives into wrapper objects and vice versa
--Autoboxing features help avoid explicit calls to the constructor
--Similarly, unboxing avoids an explicit call to methods like intValue which returns the value of the Integer as an int
--Wrapper class has methods that help convert one type of data to another data type.
--A numeric value stored in the format of a String variable can be modified to any data type by using parseXXX() like parseInt(), parseDouble().

//String Class

--String is an immutable sequence of characters and also an object.
--Some useful methods of String class are: equals(), split(), indexOf(),trim(), length().
----example---
**********String username = "Jeena  
Here username is represented as a String literal.String literals are created in a pool section of the heap memory.

************String username = new String("Jeena")
---Here username is represented as a String object. If we create another String: String name = new String("Jeena"); then both name and username point to two different objects in the memory.

---Always remember that string literals are not eligible for garbage collection throughout the application. On the other hand, String objects can be garbage collected.

*****************
generics
*****************

Generics are used for creating interfaces, methods, and classes that specify the object type on which they work as a parameter.

They were introduced in Java 5, and provide the following advantages:

Compile-time type checking is done

Casting is eliminated

Can implement Generic algorithms

The syntax for a generic class is :
class class-name<type-parameter-list> { }

type parameter is defined by a single letter of capital and is usually one of the E (element), T (type), K (key), N(number) and V (value).

A generic type of value can be returned by a generic method.

A generic method can be present in a non-generic class.

Generics in Java allow wildcard constructs to denote a family of types. They can be categorized as follows:

? extends T - Upper-bounded wildcard which supports types that are T or its sub-types.

? super T - Lower-bounded wildcard which supports types that are T or its super-types.

? - Unbounded wildcard which supports all types.

We know arrays have advantages like

Type checking is done at Compile time

Ability to hold objects as well as primitive type data

However, they can not grow and shrink dynamically. In addition, they do not have an integrated algorithm for sorting or searching.

To overcome these disadvantages, Java gives us the Collections Framework

The collections framework offers many interfaces and classes for manipulating and representing collections. Introduced in J2SE 1.2, it regulates the way we access data and store using collections. All these are in java.util package.

The framework has the following advantages:

Ready to use classes and algorithms

Better program speed and quality

Reduced programming effort

Collections.sort() will work on any kind of element which implements the Comparable interface.
Usually, the in-built Java classes like String, Date, etc. implement the Comparable interface, and hence, sort() works on them.

This means that sort() will not work on user-defined classes on its own. As in our case, the Course class will need to implement the Comparable interface.

The Comparable Interface is a part of the java.lang package. It has a single method compareTo() which should return a negative, zero or a positive number based on the comparison.

TreeSet and TreeMap classes automatically use the compareTo() method to sort elements when they are added.
So the objects of classes overriding compareTo() will automatically be sorted if they are added to TreeSet or TreeMap

Best practice: Implement the Comparable interface to custom types, when their elements are added to collections which will sort elements by natural ordering ex: TreeSet and TreeMap. It also helps to sort elements in a List collection based on the natural ordering of the elements.

Since our Course class already implements compareTo() to sort according to the courseName, we'll need an additional component to define another comparison logic.

This can be done with Comparator Interface.

A class can implement the Comparator interface to define a comparison logic in its compare() method. An object of this is passed along with a list to the sort() method.

The Comparator interface is a part of the java.util package. It has a single method compare() that needs to return a negative, zero or a positive number based on the comparison.

A regular expression is a sequence of characters that form a search pattern. It is mainly used in pattern matching for searching and editing.
Regular expressions are most widely used for validating details entered in a form.

The regex API is distributed under the java.util.regex package and provides classes to work with regular expressions.

This regex API is used by the String class in four methods:
matches(), split(), replaceFirst(), replaceAll()

The regex API gives us the following:

MatchResult interface

Matcher class

Pattern class

PatternSyntaxException class

Best practice: It's preferred to use Pattern and Matcher classes than String.matches, as it compiles the regular expression each time they are called.
The Pattern and Matcher classes are the most widely used.

*****************
Inner Class
*****************

A class can host another class called inner class.
An inner class can contain member methods and member variables just as any other class.
Members of an instance of the inner class can access an instance of an outer class because an inner class is just another member of the outer class. Inner classes can also access the outer class's private members.
An inner class can be static.
An inner class can have private, protected, public, or package access.
 
If we can access the inner class from outside then why can't we create normal class instead of creating an inner class?
An inner class is a logical group of classes that are used in one place, i.e. if a class is used mostly by only one other class keep them together which leads to more maintainable code that is easily readable. It also increases encapsulation because inner classes can be declared private.
According to our scenario, the Grade class can be used by the Manager class only. So we put them together and make the inner class private so that it cannot be accessed from outside.

FileReader and FileWriter

*****************
Character Streams
*****************

Character Streams read data from the source and write data to the destination in the form of characters (16 bit Unicode).

All character stream classes are derived from the following two abstract classes:

java.io.Reader: Used for reading data in the form of characters

java.io.Writer: Used for writing data in the form of characters

*****************
Buffered Streams
*****************

When data is read and written, a byte or character at a time, it is a very expensive operation due to frequent disk access.
This can be optimized by buffering a group of bytes or characters together and then making use of them.

Buffering helps to store an entire block of values into a buffer, and then make the data available for use.
There are four buffered stream classes:

BufferedInputStream and BufferedOutputStream help in creating buffered byte streams

BufferedReader and BufferedWriter are used to create buffered character stream
*****************
Stream Chaining
*****************

The process of passing a FileReader instance to a BufferedReader object is called chaining.

The OutputStreamWriter class can be used for this. It converts character stream data to byte stream data by wrapping the OutputStream. 

*****************
Random Access File
*****************
There is a requirement to write the Edford university's name at the end of all the files that are specific to the university. This calls for inserting content into existing files.

For such requirements, where you need random access inside the file, Java provides RandomAccessFile.

The java.io.RandomAccessFile class denotes a random access file that behaves similar to a large sized array of bytes which is stored in the file system.
It offers a seek feature that can take us directly to a particular position in the file.

Unlike InputStream and OuputStream classes of java.io package, RandomAccessFile can be used for performing both read and write operations. Also, it inherits neither InputStream nor OutputStream. In fact, it implements both DataInput and DataOutput interfaces.

*****************
Serialization
*****************
The process that converts an object into a stream/series of bytes is called Serialization.
For any object to be serialized, the concerned class must implement the java.io.Serializable interface.
Serializable is simply a marker interface (has no body) that is used to "mark" Java classes to support serialization.

Serialization can be achieved by using the ObjectOutputStream class.

*****************
Deserialization
*****************

Deserialization is the process that reads an object from a stream/series of bytes.
ObjectInputStream can also be involved in this process.

*****************
FunctionalInterface
*****************

The interface who contains only one abstract method
but can have mulitple default and static method is called functional interface.

ex: - Runnable --> run(), Callable --> call(), Comparable --> compareTo(), Comparator --> compare(), 
these interfaces have only one abstract method



*****************
Consumer<T>
*****************

Consumer<T> is an in-built functional interface in java 8
Consumer consume the input and doesn't return anything

In Consumer object need to be consumed i.e take as input, and some operation is to
be performed on the object without returning any result;



*****************
 <<T>> Supplier
*****************

Supplier is an in-built functional interface in java 8

Supplier return the output and doesn't take any anything


*****************
Predicate<T>
*****************

Predicate is an in-built functional interface in java 8
Predicate return true if input match the predicate otherwise false

*****************
static keyword
*****************


1) static method can be call directly with method name
2) we can't override the static method


*****************
Stream API
*****************

1) Stream API is used to process collections of objects.
2) A sequence of objects that supports various methods which can be
pipelined to produce the desired result.
3) A stream is not a data structure instead it takes input from Collections, 
Arrays or I/O channels.
4) Stream doesn't change the original structure, they only provide the result as 
 per the pipelined methods.

# Why we can Stream

Functional Programming
Code Reduce
Bulk Operation

# Difference between java 8 map() and flatMap()

                           map()                                    flatMap()
1) It processes stream of values                          It processes stream of stream of values
2) It does only mapping                                   It performs mapping as well as flattening
   3) It's mapper function produces single value          It's mapper function produces multiple values for 
   for each input value.                                  each input.
4) It is a One-To-One mapping                             It is a One-To-Many mapping

















