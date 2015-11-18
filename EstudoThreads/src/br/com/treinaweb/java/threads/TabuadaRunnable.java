package br.com.treinaweb.java.threads;

public class TabuadaRunnable implements Runnable{

	private int numero;
	
	public TabuadaRunnable(int numero){
		this.numero = numero;
	}
	
	@Override
	public void run() {
		//primeiro a ser chamado
		for(int i = 0;i<=10;i++){
			if(Thread.interrupted()){
				return;
			}
			System.out.printf("%d X %d = %d %n",numero,i,numero*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
