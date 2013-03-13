package com.seeburger.bicng.gittests.sports.impl;

import org.junit.Before;

import com.seeburger.bicng.gittests.sports.SportTest;

/**
 * Boxing implementation.
 *
 * @author Martin Hristov &lt;m.hristov@seeburger.com&gt;
 */
public class BoxingTest extends SportTest
{

	@Before
	public void setUp()
	{
		setFixture(new Boxing());
	}

}
