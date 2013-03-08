package com.seeburger.bicng.gittests;

/**
 * Git greeter class
 *
 * @author Martin Hristov &gt;m.hristov@seeburger.com&lt;
 */
public class GitGreeter extends AbstractGreeter
{
	public GitGreeter()
	{
		super("");
	}

	private String helloWorldMsg = "Hello Git World! (Updated)";

	@Override
	public void greet()
	{
		System.out.println(helloWorldMsg);
	}
}
