package com.seeburger.bicng.gittests.sports.impl;

import com.seeburger.bicng.gittests.sports.SnowSport;

/**
 *
 * TODO short description for Snowboarding.
 * <p>
 * Long description for Snowboarding.
 *
 * @author Martin Marchev
 */
public class Snowboarding implements SnowSport
{

	@Override
	public void play()
	{
		System.out.println("Snowboarding");
	}

	@Override
	public void playWithSomebody(String somebodysName) {
		// TODO Auto-generated method stub

	}


	@Override
	public void slideOnTheSnow()
	{
		System.out.println("I'm sliding over/onToThe snow...");
		System.out.println("making some chane in snowowbarding impl.");
	}

	@Override
	public void selectProtectorsToWear()
	{
		// TODO implement that
		// wear all kind of protectors.
		System.out.println("Select all kind of protectors.");
		System.out.println("foobar");
	}

}
