## Practice Questions Set 1 (Input & Output)

Hint: Use the following statements for taking input in a program-
```java
import java.util.Scanner;  //   to import the Scanner class inside your program

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // to create an object of the Scanner class
        // write your code here
        scanner.close();  // write this line at the end of the main method
    }
}
```

---

- Write a program in Java to accept a `String` value from the user and print a welcome message in the format given below.  

###### Sample Input
```
Sartaaj
``` 
###### Sample Output
```
Welcome, Sartaaj!
```

---

- Write a program in Java that accepts two `String` type values and generate the output in the required format.  


###### Sample Input  
```
GLA Mathura
```

###### Sample Output  
```
GLA University Mathura
```

--- 

- Write a program in Java to accept two integers and print the following -  
  * the sum of the two numbers
  * the difference of the two numbers (subtract the smaller number from the larger number)
  * the product of the two numbers
  * the quotient and the remainder of the two numbers after division
  
###### Sample Input
```
12 3
``` 

###### Sample Output
```
12 + 3 = 15
12 - 3 = 9
12 * 3 = 36
12 / 3 = 4
12 % 3 = 0
``` 

---

- Write a program in Java to accept a number from the user and to check whether the number if positive, negative or zero.  

###### Sample Input
```
45
```

###### Sample Output
```
Positive
```

---

- Write a program in Java to accept a number from the user and to check whether the number if odd or even.  

###### Sample Input
```
45
```

###### Sample Output
```
Odd
```

---

- Write a program in Java to accept two `char` type values from the user and display them in alphabetical order.  

###### Sample Input
```
e a
```

###### Sample Output
```
a e
```

---

- Write a program in Java to accept a `char` type value from the user and   
    * print 'alphabet' if the character is an alphabet  
    * print 'digit' if the character is a digit  
    * print 'special character' if the character is anything else  
    
###### Sample Input
```
4
```

###### Sample Output
```
digit
```

---

- Write a program in Java to accept two values from the user.  
    * the first value will be a `String`, for gender, either "male" or "female"    
    * the second value will be an `int`, for age
    
    If the gender is female and the age is between 1 and 58 (both inclusive), the rate of interest will be 8.2%.  
    
    If the gender is female and the age is between 59 and 100 (both inclusive), the rate of interest will be 9.2%.  
    
    If the gender is male and the age is between 1 and 58 (both inclusive), the rate of interest is 8.4%.  
    
    If the gender is male and the age is between 59 and 100 (both inclusive), the rate of interest is 10.5%.  
    
    Print the rate of interest for the input values.
    
###### Sample Input
```
male 25
```

###### Sample Output
```
8.4%
```

---

- Write a program in Java to accept a character from the user. Then,  
    * if the character is in lower-case, print the character in upper-case.
    * if the character is in upper-case, print the character in lower-case.
    
###### Sample Input
```
a
```

###### Sample Output
```
A
```

---

- Write a program in Java to accept an integer from the user and print the name of the month corresponding to the number.  
The values can only be from the range (1, 12), if the value falls out of the range, print `Invalid Number`.

###### Sample Input
```
1
```

###### Sample Output
```
January
```

---

- Write a program in Java to accept two numbers from the user `a` and `b` such that `a <= b`.
    Print all the even numbers between `a` and `b`.
    
###### Sample Input
```
2 5
``` 

###### Sample Output
```
4
```

---

- Write a program in Java to accept a number from the user and to check whether the number is prime.

###### Sample Input
```
7
```

###### Sample Output
```
7 is a prime number.
```

---

- Write a program in Java to print the sum of all the digits of a number.

###### Sample Input
```
123
```

###### Sample Output
```
6
```

---

- Write a program in Java to accept a number from the user and to check whether the number is a palindrome.

###### Sample Input
```
110011
```

###### Sample Output
```
110011 is a palindrome.
```

---

