import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class Yahtzee extends Player{
	
	public JTextArea taTitle;
	public JTextArea taPlayer;
	public JLabel lPlayer;
	public JTextArea taUpper;
	public JLabel lUpper;
	public JTextArea taOnes;
	public JLabel lOnes;
	public JTextArea taTwos;
	public JLabel lTwos;
	public JTextArea taThrees;
	public JLabel lThrees;
	public JTextArea taFours;
	public JLabel lFours;
	public JTextArea taFives;
	public JLabel lFives;
	public JTextArea taSixes;
	public JLabel lSixes;
	public JTextArea taUpperTempTotal;
	public JLabel lUpperTempTotal;
	public JTextArea taUpperBonus;
	public JLabel lUpperBonus;
	public JTextArea taUpperTotal;
	public JLabel lUpperTotal;
	
	public JTextArea taLower;
	public JLabel lLower;
	public JTextArea ta3OfAKind;
	public JLabel l3OfAKind;
	public JTextArea ta4OfAKind;
	public JLabel l4OfAKind;
	public JTextArea taFullHouse;
	public JLabel lFullHouse;
	public JTextArea taSmallStraight;
	public JLabel lSmallStraight;
	public JTextArea taLargeStraight;
	public JLabel lLargeStraight;
	public JTextArea taYahtzee;
	public JLabel lYahtzee;
	public JTextArea taChance;
	public JLabel lChance;
	
	public JTextArea taUpperGrandTotal;
	public JLabel lUpperGrandTotal;
	public JTextArea taLowerGrandTotal;
	public JLabel lLowerGrandTotal;
	public JTextArea taGrandTotal;
	public JLabel lGrandTotal;
	
	public JApplet yahtzee;
	public JPanel yahtzeePanel;
	
	public JLabel die1;
	public JLabel die2;
	public JLabel die3;
	public JLabel die4;
	public JLabel die5;
	
	public JCheckBox hold1;
	public JCheckBox hold2;
	public JCheckBox hold3;
	public JCheckBox hold4;
	public JCheckBox hold5;
	
	public Player player1;
	public Player player2;
	public Player player3;
	public Player player4;
	public Player player5;
	
	public Yahtzee()
	{
		taTitle = new JTextArea("Yahtzee");
		taPlayer = new JTextArea();
		lPlayer = new JLabel("Player");
		taUpper = new JTextArea();
		lUpper = new JLabel("Upper Section");
		taOnes = new JTextArea();
		lOnes = new JLabel("Ones");
		taTwos = new JTextArea();
		lTwos = new JLabel("Twos");
		taThrees = new JTextArea();
		lThrees = new JLabel("Threes");
		taFours = new JTextArea();
		lFours = new JLabel("Fours");
		taFives = new JTextArea();
		lFives = new JLabel("Fives");
		taSixes = new JTextArea();
		lSixes = new JLabel("Sixes");
		taUpperTempTotal = new JTextArea();
		lUpperTempTotal = new JLabel("Upper Temp Total");
		taUpperBonus = new JTextArea();
		lUpperBonus = new JLabel("Upper Bonus");
		taUpperTotal = new JTextArea();
		lUpperTotal = new JLabel("Upper Total");
		
		taLower = new JTextArea();
		lLower = new JLabel("Lower Section");
		ta3OfAKind = new JTextArea();
		l3OfAKind = new JLabel("3 of a Kind");
		ta4OfAKind = new JTextArea();
		l4OfAKind = new JLabel("4 of a Kind");
		taFullHouse = new JTextArea();
		lFullHouse = new JLabel("Full House");
		taSmallStraight = new JTextArea();
		lSmallStraight = new JLabel("Small Straight");
		taLargeStraight = new JTextArea();
		lLargeStraight = new JLabel("Large Straight");
		taYahtzee = new JTextArea();
		lYahtzee = new JLabel("Yahtzee");
		taChance = new JTextArea();
		lChance = new JLabel("Chance");
		
		taUpperGrandTotal = new JTextArea();
		lUpperGrandTotal = new JLabel("Upper Grand Total");
		taLowerGrandTotal = new JTextArea();
		lLowerGrandTotal = new JLabel("Lower Grand Total");
		taGrandTotal = new JTextArea();
		lGrandTotal = new JLabel("Grand Total");
		
		die1 = new JLabel();
		die2 = new JLabel();
		die3 = new JLabel();
		die4 = new JLabel();
		die5 = new JLabel();
		
		hold1 = new JCheckBox();
		hold2 = new JCheckBox();
		hold3 = new JCheckBox();
		hold4 = new JCheckBox();
		hold5 = new JCheckBox();
		
		yahtzee = new JApplet();
		yahtzeePanel = new JPanel();
		
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
		player4 = new Player();
		player5 = new Player();
	}

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		Die die4 = new Die();
		Die die5 = new Die();
		player1.dice[0] = die1.Roll();
		player1.dice[1] = die2.Roll();
		player1.dice[2] = die3.Roll();
		player1.dice[3] = die4.Roll();
		player1.dice[4] = die5.Roll();
		System.out.println(player1.dice[0] + "");
		System.out.println(player1.dice[1] + "");
		System.out.println(player1.dice[2] + "");
		System.out.println(player1.dice[3] + "");
		System.out.println(player1.dice[4] + "");
		
		player1.dice[4] = die5.Roll();
		System.out.println(player1.dice[4] + "");
	}

}
