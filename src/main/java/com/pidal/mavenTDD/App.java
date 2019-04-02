package com.pidal.mavenTDD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Calculadora c = new Calculadora();
        
        c.suma(3, 5);
        System.out.println(c.getResult());
        
        
        c.clear();
        
        c.division(5, 0);
        
        System.out.println(c.getResult());
    }
}
