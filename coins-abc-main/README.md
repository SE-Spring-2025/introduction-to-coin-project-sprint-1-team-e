# CS3667 Software Engineering 
# Dr. Nazia Sharmin
# Appalachian State University

# Coins Project - Group E - Sprint 4
# Michele Carson, Andy Estrada, Jenna Mena, Carson Taylor

# Sprint 4
## Process Description

1. Explore the CelsiusConverter codes.
2. Create a CoinCounts class that is composed inside of the Coin class. 
3. Add a "total coins" dashboard observer that watches the CoinCounts object.
4. Add a "quarter counter" dashboard observe that watches the CoinCounts object.
6. Write a Demo class that adds to its demonstration of our code. We should be able to choose different coin creations and see the dashboards change automatically.

The Observer Design Pattern is a behavioral pattern that defines a one-to-many dependency between objects. When the state of one object (called the subject or observable) changes, all its dependents (observers) are notified and updated automatically. This pattern is a key part of implementing distributed event handling systems.

### Observer Design Pattern

1. **Subject/Observable**: The object that maintains a list of its dependents (observers) and notifies them of state changes.
   
2. **Observer**: An interface or abstract class defining the update method that gets called when the Subject's state changes.
   
3. **ConcreteSubject**: Implements the Subject interface, maintains state, and sends notifications to observers when state changes.
   
4. **ConcreteObserver**: Implements the Observer interface and defines how to respond to Subject updates.

### Benefits:

- **Loose coupling**: Subjects don't need to know anything about their observers beyond that they implement an interface.
- **Support for broadcast communication**: One update in the Subject can propagate to all registered observers.
- **Dynamic relationships**: Observers can be added or removed at runtime.

## Executing Terminal Commands via make (makefile)

make clean

make compile

# Run the Demo

make demo

# Run the Tests

make test

# Run 'Checkstyle'

make check

# tips
- Connect to the student server via asusecure or tunnelblick (see EnviornmentSetup.pdf for details)
- Use the make commands in your terminal.
- Ensure your current directory is COINS-ABC-MAIN.
- Use the clean and compile command before trying the demo or testing.

