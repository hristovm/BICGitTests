package com.seeburger.bicng.gittests.sports.impl;

import com.seeburger.bicng.gittests.sports.SnowSport;

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

}
