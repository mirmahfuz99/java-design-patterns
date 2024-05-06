Composite Design Pattern: 

Composite is a structural design pattern. Composite lets client treat individual 
objects object (leaf) and compositions of objects (composite) uniformly. 

Composite have four participants: Component, Leaf, Composite and Client.

The indent of commposite is to compose objects into tree structure to represent part-whole hierarchies. If object is Leaf node, request is handled directly if object is composite, it forward request to child .