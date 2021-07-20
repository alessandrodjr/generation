package br.com.atividade;

public class Atividade1 {

	public static void main(String[] args) throws InterruptedException {
		
		int i;
		
		for(i = 1000; i < 2000; i++) {
			
			if(i % 11 == 5) {
				System.out.println(i);
			Thread.sleep(100);
				
			}
		}

	}

}
