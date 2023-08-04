# ExceptionHandling


- Exception is an object occured at runtime to disturb the normal flow of execution.

There are 5 ways to handle exceptions - 

1. try

2. catch

3. finally

4. throw

5. throws


Note:

Any number divisible by 0 is 0. In programming, the compiler will generate an "ArithmeticException" error.



If the application contains exceptions - 

1. program terminated abnormally

2. rest of the application is not executed


#### Try and Catch Block

Syntax:

try{

}

catch(Exception-name){

}


__

Exception code is code that may or may not raise an exception.


- When an exception rised to the try block, the 'catch()' block will handle the exception.


#### Ex:

class Test{

    public static void main(String[] args){

      System.out.println("Application starts!");

      Scanner s = new SCanner(System.in);

      try{

         System.out.println("Enter a number...");

         int num = s.nextInt();

         System.out.println(10/num);
          
      }

      catch(ArithmeticException e){

        System.out.println("AE handling code" + (10/10));

       }    

     System.out.println("Rest of application");

    }

}



***********************

#### Once we handle the exception - 

1. program will be terminated normally

2. Rest of the application is executed


- The exception in try block, catch block should match and then normal termination. If they do not match then it will generate an error.

- We can also have multiple catch blocks. A 'try block' can have multiple exceptions. Therefore, we can use multiple catch blocks.

  Ex:

  package com.pnc.exception;

import java.util.*;

public class Exception {

	public static void main(String[] args) {
 
		
		System.out.println("Application starts!");
  
		Scanner s = new Scanner(System.in);
   
		
		try {
  
			System.out.println("Enter a number");
   
			int num = s.nextInt();
   
			System.out.println(10/num);
   
		}
		catch(ArithmeticException e){
  
			System.out.println("AE handing code" + (10/10));
   
		}
  
		catch(InputMismatchException ime){
  
			System.out.println("Enter valid number" + ime);
   
		}
		
		System.out.println("Rest of application");
  

	}

}


1. We have different messages because of different way to handle the exceptions. So, we use multiple catch blocks.

2. We have different exceptions but the same messages. So, we an use one catch block.

   The root class of exception is 'Exception'. 'ArithmeticException' can only handle arithmetic. To handle all exceptions we can use the root class 'Exception'.


   package com.pnc.exception;

import java.util.*;

public class Exception {

	public static void main(String[] args) {
		
		System.out.println("Application starts!");
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int num = s.nextInt();
			System.out.println(10/num);
		}
		catch(Exception e){
			System.out.println("Handle all exceptions";
   			System.out.println("you got exception" + e);
		}
		System.out.println("Rest of application");

	}

}


## There are 3 types of Exceptions - 

1. Checked exception

2. Unchecked exception

3. errors

 #### Checked Exception

 • Checked exception is caused from the develepors mistake.  

 Ex:

 package com.pnc.bank;

import java.io.*;


public class FileNotFound {

	public static void main(String[] args) {
		
		try {
  
			FileInputStream fis = new FileInputStream("abc.txt");
   
		}
  
		catch(FileNotFoundException e){
  
			System.out.println("not available");
   
		}
	}

}

If the develepor cant find the file, then we will get FileNotFoundException. 

 - Whenever we get a checked error, we have to handle the error if we are the develepor.



 #### Unchecked Exception

• Unchecked exceptions is caused from the end user's inputs.

Example:

Code:

package com.pnc.bank;

public class Exception {

	public static void main(String[] args) {
 
		char a = "aruna".charAt(12);
  
		System.out.println(a);

	}


}

Error:

Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12

	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
 
	at java.base/java.lang.String.charAt(String.java:1515)
 
	at com.pnc.bank.Exception.main(Exception.java:7)
 

//We can’t find the index of 12 because aruna does not have 12 characters. So, we will get “StringIndexOutOfBoundsException”.



#### Errors

• Errors are caused due to the lack of System resources. System resources are basically memory in the computer. 

- We cant handle errors.


An example of an error is 'StackOverFlowError'. 'StackOverFlowError' is caused whenever the memory keeps stacking up and it never stops(like a loop). 


##### Difference between Errors and Exceptions

1. Exceptions are caused due to the end user's inputs or the develepors mistake.

2. Errors are caused due to the lack of System resources.



 
   
