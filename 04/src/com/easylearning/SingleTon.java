package com.easylearning;

public class SingleTon {
	
  private static SingleTon instance = new SingleTon();
	
   private SingleTon(){}
   
   public static SingleTon getInstance() {
	   return instance;
   }
}


