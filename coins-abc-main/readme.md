# CS3667 Software Engineering - Dr. Nazia Sharmin - Appalachian State University
# Coins Project - Group E 
# Mitchel Carson, Andy Estrada, Jena Mena, Carson Taylor
---------------------------------------------------------------------
## Sprint 2

## Process Description

1. Refactor Coin as an abstract class.
2. Create a two-level coin hierarchy with Coin at the top and concrete classes Dollar, HalfDollar, Quarter, Dime, Nickel, and Penny extending Coin. These classes must pass checkstyle and all unit tests.
3. Update CoinTest to support changes in the Coin class.
4. Write JUnit test classes for each concrete coin class (e.g., DimeTest, PennyTest, etc.).
5. Write a Demo class that demonstrates our code satisfies the customer requirements.


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
Use the make commands in your terminal.
Ensure your current directory is COINS-ABC-MAIN.
Use the clean and compile command before trying the demo or testing.

