# OOP vs Structured Programming

### Structured Programming

- Thinking in terms of Procedures/methods/functions

### Object Oriented Programming

- Thinking about Objects that involve to solve the problem.
- A **Class** is a logical entity or a template where as an **object** is a physical entity or an instance of a class
- An Object has
  - State: Its Data
  - Behaviour: Its Operations
- What is the Data they need(**State**)
- What are the actions they perform(**Behaviour**)
- **Fields** are the elements that make up the object state. Object behavior is implemented through **Methods**
- Eg: Object(**Aeroplane**). Data (**airlineName**, **type**, **position**). Actions (**takeOff()**,**land()**,**cruise()**).

### Encapsulation

- At the heart of encapsulation, is the need to protect object's state. From whom? Other objects.
- Only class members should have the access to class's instance variables.
- Other classes should not change the data of the current class directly. They have to do it through the behaviour of the current class i.e., through methods like getters and setters etc.
- Encapsulation helps to set valid state to the objects through setting validations in the setter methods. Refer [MotorBike Example](oop/MotorBike.java)
- Not only getters and setters, we can include multiple methods that operates on the data of the object. Eg:- increaseSpeed(), decreaseSpeed() etc. Refer [More Operations on the Object](oop/MotorBike.java)
- [Example Code](oop/MotorBike.java)

### Abstraction

- Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
- In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

### Constructors

- Constructors are the special methods which are invoked while creating the object using "new" keyword.
- We defined a single-argument constructor for MotorBike , whose definition looks like this:
  ` public MotorBike(int speed){ /* Constructor Code Goes Here */ }`
- The constructor is a method, whose name is the same as the class name. All Java rules for a method apply to constructors as well. Constructor cannot be directly called.
- A constructor is always invoked when a class object is created, using the new keyword. A constructor for a class could accept zero, one or more than one arguments.
- A default constructor is the one which doesn't have any arguements and if not specified, JVM automatically creates while creating an object.
