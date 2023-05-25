package com.pp2;

public class TestTh extends Thread {
	private String nombre;
	private int retardo;
	
	public TestTh (String S, int d) {
		nombre = S;
		retardo = d;
	}
	
	public void run () {
		try {
			sleep (retardo) ;
			
		} catch (InterruptedException e) {
			System.out.println( "Fin programa");
		}
		
		System.out.println( "Hola Mundo! "+ nombre +" "+ retardo);
	}

}
