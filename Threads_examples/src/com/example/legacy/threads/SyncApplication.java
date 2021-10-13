package com.example.legacy.threads;

public class SyncApplication {

	public static void main(String[] args) {
      new PrintStreamTask("Idly","sambar");
      new PrintStreamTask("Pizza","Coke");
      new PrintStreamTask("Chole","kulche");
      new PrintStreamTask("Tea","Biscuit");

	}

}
