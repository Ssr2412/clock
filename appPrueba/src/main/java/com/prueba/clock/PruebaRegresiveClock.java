package com.prueba.clock;


public class PruebaRegresiveClock {
	public static void main(String[] args) {
		RegresiveClock rg= new RegresiveClock(60,60);
		while(rg.getMinutes()!=0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rg.regresive();
			rg.printTime();
		}
	}
}
