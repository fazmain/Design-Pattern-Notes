    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
	import javax.swing.*;
	import java.util.Random;

	public class Game extends JFrame{
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
	    private int[] numChips = {3, 3, 3};
	    private JButton[] buttons = {roll1Button, roll2Button, roll3Button}; 
	    private int centerPotNumChips = 0;
	    private int whoseChipsToMove = 0;
	    public int turn = 1;
	    
	    public Game(){
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
	        
	        this.addRoll1Listener(new Roll1Listener());
	        this.addRoll2Listener(new Roll2Listener());
	        this.addRoll3Listener(new Roll3Listener());
	        this.addMoveChipsListener(new MoveChipsListener());
	        
	        this.add(gamePanel);
	    }
	    
	    public static void main(String args[])
	    {
	    	new Game().setVisible(true);	
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
	    			centerPotNumChips++;
	    		}
	    	}
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
	    
	    class Roll1Listener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	String rollResult = "";
	        	rollResult = rollDice(numChips[0]);
	        	roll1Results.setText(rollResult);
	        	roll1Button.setEnabled(false);
	        	moveChipsButton.setEnabled(true);
	        	whoseChipsToMove = 1;
	        }
	    }
	    
	    class Roll2Listener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	String rollResult = "";
	        	rollResult = rollDice(numChips[1]);
	        	roll2Results.setText(rollResult);
	        	roll2Button.setEnabled(false);
	        	moveChipsButton.setEnabled(true);
	        	whoseChipsToMove = 2;
	        }	
	    }
	    
	    class Roll3Listener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e) 
		    {
		        	String rollResult = "";
		        	rollResult = rollDice(numChips[2]);
		        	roll3Results.setText(rollResult);
		        	roll3Button.setEnabled(false);
		        	moveChipsButton.setEnabled(true);
		        	whoseChipsToMove = 3;
	        }
	    }
	
        class MoveChipsListener implements ActionListener
        {
        	boolean calculatingTurn;
        	int numPlayersChecked;
        	
			public void actionPerformed(ActionEvent e) 
	        {    	
				if (whoseChipsToMove == 1)
				{
					moveChips(1, roll1Results.getText());
				}
				else if (whoseChipsToMove == 2)
				{
					moveChips(2, roll2Results.getText());					
				}
				else if (whoseChipsToMove == 3)
				{
					moveChips(3, roll3Results.getText());					
				}
	        	
	        	oneChips.setText(Integer.toString(numChips[0]));
	        	twoChips.setText(Integer.toString(numChips[1]));
	        	threeChips.setText(Integer.toString(numChips[2]));
	        	centerPot.setText(Integer.toString(centerPotNumChips));
	        	
	        	moveChipsButton.setEnabled(false);
	        	roll1Results.setText("");
	        	roll2Results.setText("");
	        	roll3Results.setText("");
	        	
	        	int winningPlayer = isWinner();
	        	if (winningPlayer > 0)
	        	{
	        		 JOptionPane.showMessageDialog(null, "GAME OVER! Player: "+ winningPlayer+ " Wins!");
	        		 System.exit(0);
	        	}
	        	else 
	        	{
	        		calculatingTurn=true;
	        		numPlayersChecked = 0;
	        		turn = whoseChipsToMove;
	        		while (calculatingTurn  && numPlayersChecked<2)
	        		{
	        			turn = onRight(turn-1)+1;
	        			if (numChips[turn-1] > 0)
	        			{
	        				(buttons[turn-1]).setEnabled(true);
	        				calculatingTurn = false;
	        			}
	        			numPlayersChecked++;
	        		}
	        	}
	        }
        }
  }