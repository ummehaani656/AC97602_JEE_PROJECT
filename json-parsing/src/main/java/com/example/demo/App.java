package com.example.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyJsonParser parser=new MyJsonParser();
        Product obj=new Product(101, "Sony TV", 24500);
        String jsonResp=parser.convertToJson(obj);
        System.out.println(jsonResp);
        System.out.println("convert JSON to java");
        System.out.println(parser.jsonToJava(jsonResp));
        		
        
    }
}
