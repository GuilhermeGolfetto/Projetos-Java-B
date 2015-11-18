package br.com.treinaweb.java.app;

import br.com.treinaweb.java.threads.TabuadaRunnable;

public class Programa {

	public static void main(String[] args) {
		TabuadaRunnable tabuadaDo5 = new TabuadaRunnable(5);
		TabuadaRunnable tabuadaDo6 = new TabuadaRunnable(6);

		Thread tr5 = new Thread(tabuadaDo5);
		Thread tr6 = new Thread(tabuadaDo6);
		
		tr5.start();
		try {
			tr5.join(3000);
			tr5.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			return;
		}
		tr6.start();
		System.out.println("Threds Iniciadas: "); //vem antes
	}

}
