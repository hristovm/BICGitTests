package com.seeburger.bicng.gittests.sports.impl;

import org.junit.Before;

import com.seeburger.bicng.gittests.sports.SportTest;

public class SnowboardingTest extends SportTest
{

	@Before
	public void setUp()
	{
		setFixture(new Boxing());
	}

}