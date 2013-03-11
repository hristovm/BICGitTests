package com.seeburger.bicng.gittests.sports;

import org.junit.Test;

public abstract class SportTest
{
	/**
	 * Sport fixture.
	 */
	private Sport fixture;

	@Test
	public void testPlay()
	{
		getFixture().play();
	}

	public Sport getFixture() {
		return fixture;
	}

	public void setFixture(Sport fixture) {
		this.fixture = fixture;
	}



}
