package mvc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class View extends JFrame{
    private JLabel player1Label = new JLabel("Player #1");
    private JLabel player2Label = new JLabel("Player #2");
    private JLabel player3Label = new JLabel("Player #3");
    private JTextField oneChips = new JTextField(5);
    private JTextField twoChips = new JTextField(5);
    private JTextField threeChips = new JTextField(5);
	private JButton roll1Button = new JButton("ROLL #1");
	private JButton roll2Button = new JButton("ROLL #2");
	private JButton roll3Button = new JButton("ROLL #3");
    private JTextField roll1Results = new JTextField(8);
    private JTextField roll2Results = new JTextField(8);
    private JTextField roll3Results = new JTextField(8);
    private JLabel centerPotLabel = new JLabel("Center Pot ==>");
    private JTextField centerPot = new JTextField(8);
    private JButton moveChipsButton = new JButton("Move Chips");
    private JButton[] buttons = {roll1Button, roll2Button, roll3Button}; 
    
    public JTextField getRoll1Results() {
    	return roll1Results;
    }
    public JTextField getRoll2Results() {
    	return roll2Results;
    }
    public JTextField getRoll3Results() {
    	return roll3Results;
    }
    public JButton getRoll1Button() {
    	return roll1Button;
    }
    public JButton getRoll2Button() {
    	return roll2Button;
    }
    public JButton getRoll3Button() {
    	return roll3Button;
    }
    public JButton getMoveChipsButton() {
    	return moveChipsButton;
    }
    public JTextField getOneChips() {
    	return oneChips;
    }
    public JTextField getTwoChips() {
    	return twoChips;
    }
    public JTextField getThreeChips() {
    	return threeChips;
    }
    public JTextField getCenterPot() {
    	return centerPot;
    }
    
    private int whoseChipsToMove = 0;
    
    public View(){
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(0,3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 250);
        
        roll2Button.setEnabled(false);
        roll3Button.setEnabled(false);
        moveChipsButton.setEnabled(false);
        gamePanel.add(player1Label);
        player1Label.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(player2Label);
        player2Label.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(player3Label);
        player3Label.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(oneChips);
        oneChips.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(twoChips);
        twoChips.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(threeChips);
        threeChips.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(roll1Button);
        gamePanel.add(roll2Button);
        gamePanel.add(roll3Button);
        gamePanel.add(roll1Results);
        roll1Results.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(roll2Results);
        roll2Results.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(roll3Results);
        roll3Results.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(centerPotLabel);
        gamePanel.add(centerPot);
        centerPot.setHorizontalAlignment(JTextField.CENTER);
        gamePanel.add(moveChipsButton);
        
        oneChips.setText("3");
        twoChips.setText("3");
        threeChips.setText("3");
        centerPot.setText("0");
        
        this.add(gamePanel);
    }
    
    public static void main(String args[])
    {
    	new View().setVisible(true);	
    }
    
    void addRoll1Listener(ActionListener listenForRoll1){
        roll1Button.addActionListener(listenForRoll1);
    }
    
    void addRoll2Listener(ActionListener listenForRoll2){
        roll2Button.addActionListener(listenForRoll2);
    }
    
    void addRoll3Listener(ActionListener listenForRoll3){
        roll3Button.addActionListener(listenForRoll3);
    }
    
    void addMoveChipsListener(ActionListener listenForMoveChips)
    {
    	moveChipsButton.addActionListener(listenForMoveChips);
    }
    
    int onLeft(int player)
    {
    	return (player==0?2:player-1);
    }
    
    int onRight(int player)
    {
    	return (player==2?0:player+1);
    }

	public int getWhoseChipsToMove() {
		return whoseChipsToMove;
	}

	public void setWhoseChipsToMove(int whoseChipsToMove) {
		this.whoseChipsToMove = whoseChipsToMove;
	}
	public JButton[] getButtons() {
		return buttons;
	}
	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}
}
