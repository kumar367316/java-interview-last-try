package com.core.thread;

class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println("Even Nbr is:" + i);
		}

	}

}

public class ThreadPrintEvenOddNumberSequentially {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Thread t = new Thread(new ThreadRunnable());
			t.start();
			t.join();

			for (int j = 1; j < 10; j++) {
				if (j % 2 != 0) {
					System.out.println("odd number is:" + j);
				}
			}
		} catch (InterruptedException ex) {
			System.out.println("Thread Class Exception:" + ex.getMessage());
		}
	}

}
