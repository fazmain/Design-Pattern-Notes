package mvc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class Model extends JFrame{
    private int[] numChips = {3, 3, 3};
    private int centerPotNumChips = 0;
    public int turn = 1;
    
    public int[] getNumChips() {
    	return numChips;
    }
    public int getTurn() {
    	return turn;
    }
    public void setTurn(int turn) {
    	this.turn = turn;
    }
    
    public Model(){
    	
    }
    
    public String rollDice(int numDice)
    {
    	String result = "";
    	
    	if (numDice > 3) 
    	{
    		numDice = 3;
    	}
    	if (numDice == 0)
    	{
    		return "";
    	}
    	
    	for (int count=0; count<numDice; count++)
    	{
    		Random rand = new Random();
    		int  n = rand.nextInt(6) + 1;
    		String newRoll;
    		
    		newRoll = "*";
    		if (n == 1)
    		{
    			newRoll = "L";
    		}
    		else if (n == 2)
    		{
    			newRoll = "R";
    		}
    		else if (n == 3)
    		{
    			newRoll = "C";
    		}
  
    		result = result + newRoll;
    	}
    	return result;
    }
    
    void moveChips(int playerNum, String diceResult)
    {
    	playerNum--;
    	if (diceResult.length() == 0)
    	{
    		return;
    	}
    	
    	for (int count=0;count<diceResult.length(); count++)
    	{
    		if (diceResult.charAt(count) == 'L')
    		{
    			(numChips[playerNum])--;
    			(numChips[onLeft(playerNum)])++;
    		}
    		else if (diceResult.charAt(count) == 'R')
    		{
    			(numChips[playerNum])--;
    			(numChips[onRight(playerNum)])++;
    		}
    		else if (diceResult.charAt(count) == 'C')
    		{
    			(numChips[playerNum])--;
    			setCenterPotNumChips(getCenterPotNumChips() + 1);
    		}
    	}
    }
    
    int onLeft(int player)
    {
    	return (player==0?2:player-1);
    }
    
    int onRight(int player)
    {
    	return (player==2?0:player+1);
    }
    
    public int isWinner()
    {
    	int numWithChips = 0, hasChips=-1;
    	for (int index=0; index<3;index++)
    	{
    		if (numChips[index] > 0)
    		{
    			hasChips = index+1;
    			numWithChips++;
    			if (numWithChips > 1)
    			{
    				return -1;
    			}
    		}
    	}
    	return hasChips;
    }
	public int getCenterPotNumChips() {
		return centerPotNumChips;
	}
	public void setCenterPotNumChips(int centerPotNumChips) {
		this.centerPotNumChips = centerPotNumChips;
	}
}