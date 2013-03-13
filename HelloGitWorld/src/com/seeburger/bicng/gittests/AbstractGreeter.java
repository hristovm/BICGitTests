package com.seeburger.bicng.gittests;

public abstract class AbstractGreeter implements Greeter
{
	/**
	 * The greeting to be used.
	 */
	private String greeting;

	public AbstractGreeter(String greeting)
	{
		this.greeting = greeting;
	}

	public String getGreeting()
	{
		return greeting;
	}



}
