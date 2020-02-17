package app.demo;

/*Program 5-Write a program to accept name and age of a person from the command                    

 prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.

 Display proper error messages. 

 The program must exit gracefully after displaying the error message in case the arguments passed are not proper. 

 (Hint : Create a user defined exception class for handling errors.)  

*/


import java.util.Scanner;

class Userdefinedexceptionage extends Exception{

public String toString() {

return ("Age must be >=18 and <60");

}

}

public class ProperAge {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter Name : ");

        String name = sc.nextLine();
        System.out.println("Please Enter Age  : ");

int age = sc.nextInt(); ;

if(age>=18 && age<60)

System.out.println(name+" has proper Age");

else

try {

throw new Userdefinedexceptionage();

}

catch(Userdefinedexceptionage exception) {

exception.printStackTrace();

}

         }

         }