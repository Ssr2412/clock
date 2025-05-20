package com.prueba.clock;


public class RegresiveClock {
	private int minutes;
	private int seconds;
	
	public RegresiveClock(int min,int sec) {
		setSeconds(sec);
		setMinutes(min);
	}
	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if(minutes>=0 && minutes<=60) {
			this.minutes = minutes;
		}else {
			System.out.println("Fuera de rango: minutos debe estar entre 0 y 60");
		}
		
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		if(seconds>=0 && seconds<=60) {
			this.seconds = seconds;
		}else {
			System.out.println("Fuera de rango: segundos debe estar entre 0 y 60");
		}
	}
	
	public void regresive() {
		int regresionSeconds=getSeconds()-1;
		setSeconds(regresionSeconds);
		int regresionMinutes=getMinutes();
		if(regresionSeconds<0) {
			setMinutes(regresionMinutes-1);
			setSeconds(60);
		}
	}
	
	public void printTime() {
		System.out.println("Segundos:"+ seconds + " Minutos:" + minutes);
	}
	
}
