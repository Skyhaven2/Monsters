package mosters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshmallowMonster myMonster;

	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Hans", 3.0, 2.0, 2, 3, 2, false);
	}

	public void start()
	{
		appView.displayInformation();
	}

	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
}
