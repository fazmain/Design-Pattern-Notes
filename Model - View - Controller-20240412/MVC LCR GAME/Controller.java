package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller {
	
	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		
		this.view.addRoll1Listener(new Roll1Listener());
		this.view.addRoll2Listener(new Roll2Listener());
		this.view.addRoll3Listener(new Roll3Listener());
		this.view.addMoveChipsListener(new MoveChipsListener());
		
		this.view.setVisible(true);
	}
	
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		new Controller(model, view);
	}
	
	class Roll1Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
        	String rollResult = "";
        	rollResult = model.rollDice(model.getNumChips()[0]);
        	view.getRoll1Results().setText(rollResult);
        	view.getRoll1Button().setEnabled(false);
        	view.getMoveChipsButton().setEnabled(true);
        	view.setWhoseChipsToMove(1);
        }
    }
    
    class Roll2Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
        	String rollResult = "";
        	rollResult = model.rollDice(model.getNumChips()[1]);
        	view.getRoll2Results().setText(rollResult);
        	view.getRoll2Button().setEnabled(false);
        	view.getMoveChipsButton().setEnabled(true);
        	view.setWhoseChipsToMove(2);
        }	
    }
    
    class Roll3Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
	    {
	        	String rollResult = "";
	        	rollResult = model.rollDice(model.getNumChips()[2]);
	        	view.getRoll3Results().setText(rollResult);
	        	view.getRoll3Button().setEnabled(false);
	        	view.getMoveChipsButton().setEnabled(true);
	        	view.setWhoseChipsToMove(3);
        }
    }

    class MoveChipsListener implements ActionListener
    {
    	boolean checkingTurn;
    	int numPlayersChecked;
    	
		public void actionPerformed(ActionEvent e) 
        {    	
			if (view.getWhoseChipsToMove() == 1)
			{
				model.moveChips(1, view.getRoll1Results().getText());
			}
			else if (view.getWhoseChipsToMove() == 2)
			{
				model.moveChips(2, view.getRoll2Results().getText());					
			}
			else if (view.getWhoseChipsToMove() == 3)
			{
				model.moveChips(3, view.getRoll3Results().getText());					
			}
        	
        	view.getOneChips().setText(Integer.toString(model.getNumChips()[0]));
        	view.getTwoChips().setText(Integer.toString(model.getNumChips()[1]));
        	view.getThreeChips().setText(Integer.toString(model.getNumChips()[2]));
        	view.getCenterPot().setText(Integer.toString(model.getCenterPotNumChips()));
        	
        	view.getMoveChipsButton().setEnabled(false);
        	view.getRoll1Results().setText("");
        	view.getRoll2Results().setText("");
        	view.getRoll3Results().setText("");
        	
        	int winningPlayer = model.isWinner();
        	if (winningPlayer > 0)
        	{
        		 JOptionPane.showMessageDialog(null, "GAME OVER! Player: "+ winningPlayer+ " Wins!");
        		 System.exit(0);
        	}
        	else 
        	{
        		checkingTurn=true;
        		numPlayersChecked = 0;
        		model.setTurn(view.getWhoseChipsToMove());
        		while (checkingTurn  && numPlayersChecked<2)
        		{
        			model.setTurn(model.onRight(model.getTurn()-1)+1);
        			if (model.getNumChips()[model.getTurn()-1] > 0)
        			{
        				(view.getButtons()[model.getTurn()-1]).setEnabled(true);
        				checkingTurn = false;
        			}
        			numPlayersChecked++;
        		}
        	}
        }
    }
}
