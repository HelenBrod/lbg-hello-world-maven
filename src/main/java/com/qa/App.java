package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        // Use ctrl/ to get the comment syntax for an inline comment and add in your comment
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        system.out.println(sayHelloToSomeone("Scooby Doo"));
        system.out.println(sayGoodbye("Charlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayGoodbye("World"));
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(String name){
        return "Goodbye " + name;
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
