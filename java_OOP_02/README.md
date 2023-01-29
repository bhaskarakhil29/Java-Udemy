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
- Other classes should not change the data of the current class directly. They have to do it through the behaviour of the current class i.e., through methods like getters and setters.
- Encapsulation helps to set valid state to the objects through setting validations in the setter methods. Refer [MotorBike Example](oop/MotorBike.java)
- Not only getters and setters, we can include multiple methods that operates on the data of the object. Eg:- increaseSpeed(), decreaseSpeed() etc. Refer [More Operations on the Object](oop/MotorBike.java)
- [Example Code](oop/MotorBike.java)
