# CS3667 Software Engineering 
# Dr. Nazia Sharmin
# Appalachian State University

# Coins Project - Group E - Sprint 3
# Mitchel Carson, Andy Estrada, Jenna Mena, Carson Taylor

# Sprint 3
## Process Description

1.  Create Metallurgy hierarchy (interface and concrete classes).
2.  Test the concrete Metallurgy implementations of the interface. (The interface does not
need a test because it has no executable code.)
3.  Refactor the Coin class to have a Metallurgy delegate and add the smelt() method that
uses the delegate. Refactor the Coin constructor to set the delegate with the concrete
Metallurgy object passed by the coin subclass and then call its own smelt method to set
the metallurgy String field.
4.  Refactor the concrete coin classes (e.g., Penny) to no longer pass a metallurgy string but
to instead pass a Metallurgy object.
5.  Write a Demo class that adds to its demonstration of our code. We should be able to
create a Penny with a different metallurgy now.

## Metallurgy Strategy Pattern
The code defines a Metallurgy interface with a single smelt() method. Concrete classes like Copper and CuproNickle each implement this interface, returning a different metallurgy string. Every Coin holds a reference (the “smelter” field) to one of these concrete classes, and delegates the smelt() call to it. This way, each coin can change its metallurgy behavior at runtime by swapping out the smelter object, demonstrating the Strategy pattern.


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

