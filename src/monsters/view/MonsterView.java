package monsters.view;

import javax.swing.JOptionPane;

import mosters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null,  "Wow a popup!!");
		JOptionPane.showMessageDialog(null,  "I made a monster, its name is: " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getArmCount() + " arms");
		JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getAmountOfHair() + " hairs");
		JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getEyeCount() + " eyes");
		JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getNumberOflegs() + " legs");
		JOptionPane.showMessageDialog(null,  baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getNoseCount() + " noses");
		JOptionPane.showMessageDialog(null,  "The fact that " + baseController.getMyMonster().getName() + " has a belly button is " + baseController.getMyMonster().hasBellyButton());
		
	}
}
