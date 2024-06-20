What is strategy design pattern ?

Strategy design pattern define a family of algorithms, encapsulate each one, and make them interchangeable.

Strategy design pattern is one of the behavioral design pattern. Strategy pattern is used when we have multiple algorithm for a specific task and client decides what the actual implementation to be used at runtime.

One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.


Defines a family of algorithms, puts each of them in a seperate class, and makes their objects interchangeable.