[🇧🇷️](https://github.com/iFallenHunt/ChallengeFlowControl/blob/main/README-PT.md)

# Counting Program with Custom Exception

This Java project demonstrates a simple counting mechanism with custom exception handling to validate input parameters.

## Description

This project takes two integer parameters via the terminal and prints a sequence of numbers based on the difference between these two parameters. If the first parameter is greater than the second, it throws a custom exception (`validParametersException`).

## Features

* Reads two integer parameters from the terminal.
* Validates that the first parameter is less than or equal to the second parameter.
* Prints a sequence of incremented numbers based on the parameters.
* Throws a custom exception (InvalidParametersException) if validation fails.

## How to Use

* Clone the repository to your local machine.
* Navigate to the project directory.
* Compile and run the Counter.java file using a Java compiler.
* Follow the on-screen instructions to input the parameters.

## Requirements

* Java Development Kit (JDK) installed on your machine.

Usage Example

1. Compile the program:
```
javac Accountant.java 
```

2. Run the program:

```
java Accountant
```

3. Input the first and second parameters as prompted.


## Example Output

```
Enter the first parameter:
12
Enter the second parameter:
30
Printing number 1
Printing number 2
...
Printing number 18

```

If the first parameter is greater than the second:

```
Enter the first parameter:
30
Enter the second parameter:
12
The second parameter must be greater than the first
```

Files

* Counter.java: Contains the main logic for reading input and printing the sequence.
* InvalidParametersException.java: Custom exception class for handling invalid parameters.

License

This project is licensed under the MIT License.

See the [LICENSE](https://github.com/iFallenHunt/ChallengeFlowControl/blob/main/LICENSE) file for details.
