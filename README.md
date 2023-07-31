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
