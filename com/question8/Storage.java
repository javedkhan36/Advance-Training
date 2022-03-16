package com.question8;

public class Storage {
	
	private int x;

	public Storage(int X) { 
		x=X;
		}

	public int GetX() { 
		return(x); 
		}

	public Storage(Storage s) { 
		this.x = s.GetX(); 
		}

	}

	class Printer implements Runnable

	{

	private Storage storage;


	Printer(Storage s) { 
		storage = new Storage(s); 
		}


	public void run()

	{

	System.out.println(storage.GetX());

	}

	}

	class Counter implements Runnable

	{

	private int N;

	public Counter(int n) { N=n; }

	public int GetN() { return(N); }


	public void run()

	{

	for (int i=1; i<=N; i++)

	{

	Storage storage = new Storage(i);

	Printer printer = new Printer(storage);

	Thread.yield();

	printer.run();

	}



	}


}
