package modos;

public class PrincipalModo1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t0 = new Thread(new ThreadSoma(10, 20));
		Thread t1 = new Thread(new ThreadSubtracao(10, 20));
		Thread t2 = new Thread(new ThreadProduto(10, 20));
		
		t0.start();
		t1.start();
		
		t2.start();
		
		Thread t3 = new Thread(new InfoThread());
		
		t3.start();
		
	}

}
