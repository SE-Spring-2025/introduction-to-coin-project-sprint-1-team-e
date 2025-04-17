# CS3667 Software Engineering 
# Dr. Nazia Sharmin
# Appalachian State University

# Coins Project - Group E - Sprint 5
# Mitchel Carson, Andy Estrada, Jenna Mena, Carson Taylor

# Sprint 5
## Process Description

1. Write the manufacture() template method.
2. Write the process step methods (some are abstract, some are not).
3. Double check access (public, private, protected, final, etc.) to make sure that others who
use our Coin class can not misuse our class.
4. Update tests as appropriate.
5. Write a Demo class that adds to its demonstration of our code. We should be able to
choose different coin creations and see the dashboards change automatically.

The Template Design Pattern lets you define the outline of an algorithm in a base class and allow subclasses to fill in the details.

### Template Design Pattern

1. **BaseAbstractTemplateClass**: The base abstract class that defines the methods to be implemented by each subclass. 
   
2. **Subclasses**: Subclasses override the abstract methods defined in the base class to define custom implementations

### Benefits:

- **Code Reuse**: Subclasses resuse the methods already defined in the main template class, avoiding code duplication.
- **Improves Workflow**: The base class handles overall workflow, while subclasses only focus on the customizable parts.
- **Constistent Algorithm Structure**: Ensures all subclasses follow the same processing steps

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

