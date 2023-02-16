In databases, the * character is sometimes used to represent 
wildcard characters.
They may be substituted for any set of characters. 
For instance, if you search a database of first and last names 
for "* Jones",
your computer returns a list of all names in the database with 
the last name Jones.

For this assignment you will input a String that contains a 
single * character, then a second String. 
The * will be replaced by the second String. 

So for example, if the user enters the Strings "d*g" and "in", 
the program outputs ding.

The original String must contain only letters of the alphabet 
(capital or lowercase) and a single *. 
Any additional *'s can be treated as an invalid characters. 
The replacement String may be any legal String in Java.

If the first String does not contain a *, "Error: no *" should be output.

If the first String contains anything other than letters of the 
alphabet or *, then "Error: Incorrect characters" should be printed. 

If the first String does not have a * you do not have to check 
for incorrect characters, only "Error: no *" should be output.

Sample Run 1:

    Enter the first String:
    D*g
    Enter the replacement String:
    in
    Ding

Sample Run 2

    Enter the first String:
    $Wild*$
    Enter the replacement String:
    Card
    Error: Incorrect characters
    
Level 4 Stretch:
    
The original String must contain only letters of the alphabet 
(capital or lowercase) and *'s. 
All instances of * will be replaced by the second String. 
The replacement String may be any legal String in Java.

If the first String does not contain a * "Error: no *" should be output.

If the first String contains anything other than letters of the 
alphabet or * then "Error: Incorrect characters" should be printed. 

If the first String does not have at least one * you do not have 
to check for incorrect characters, only "Error: no *" should be output.

Sample Run 3:

    Enter the first String:
    D*g*
    Enter the replacement String:
    in
    Dingin
    
