package com.pidal.mavenTDD;

public class Calculadora {
	
	private int result = 0;
	
	public void suma(int a, int b) {
		this.result += (a + b);
	}

	public void resta(int a, int b) {
		this.result += (a - b);
	}

	public void clear() {
		this.result = 0;
	}
	
	public int getResult() {
		return result;
	}
	
	public void division(int a, int b)
	{
		try {
			if(b == 0) {
				throw new NoFuncionaException();
			}
			result =  a/b;
		} catch(NoFuncionaException e) {
			System.out.println("No funciona...");
		}
		catch(Exception e) {
			result =  a/1;
			System.out.println("Ojo que va dividido por 1");
		} 
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
