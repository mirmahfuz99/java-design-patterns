What is observer ?

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify 
multiple objects about any events happen to the object thay're observing.

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.


Applicability
- When a change to one object requires changing others, and you don't know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.