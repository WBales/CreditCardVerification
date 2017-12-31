# CreditCardVerification
Final project from programming II. Tests a file of strings made of digits for specific requirements related to credit card production.

The purpose of this project was to highlight not only the concepts learned throughout the course, but also the advanced concepts in the last chapter. I realize that this is not the most elegant or efficient way of solving the problem, but it met all of the basic and bonus requirements of the assignment. Some of the things that I was required to use specifically for this assignment include: polymorphism, inheritance, superclasses and subclasses, command line arguments, exception handling, passing objects back and forth from methods, proper documentation, and clearly commented code.

This program begins by creating the necessary objects in the CardDemo. I designed the program to include a parent class named card, with each child class being a card manufacturer. Each child class contains the specific manufacturing requirements in its method checkSub which overrides the parent class method. Each child class, or manufacturer, contains its own dataList, validList, and invalidDataList. There is an additional static list named invalidList.

The program receives the files, and as it processes the file, any lines that have invalid characters get added the the invalidData list. Then the data is checked to see if it is within the range of correct number of digits per potential credit card number. If this fails the value is added to the invalidList. I chose these two first as they are the least in-depth, and should remove as many incorrect numbers before Luhn's algorithm is run.

The data is then compared to Luhn's algorithm. If it passes this last step, it is potentially a credit card number and is added to the dataList. If it fails, then it is added to the invalidList.

Then each number in the dataList is compared to the manufacturer requirements located in each child class until a match it found. If a match is found, the number is added to that manufacturers validList. If no matches are found, the number is added to the invalidList.

A requirement of the assignment was to not have any input/output statements. They were all to be gated begind exceptional handling. The final part of the project outputs to a file all of the data in the manufacturers validList data fields. A different file contains the values in the invalidList and the invalidDataList.
