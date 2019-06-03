
public class Player extends Die{
	
	public int Ones;
	public int Twos;
	public int Threes;
	public int Fours;
	public int Fives;
	public int Sixes;
	public int UpperTempTotal;
	public int UpperBonus;
	public int UpperTotal;
	public int ThreeOfAKind;
	public int FourOfAKind;
	public int FullHouse;
	public int SmallStraight;
	public int LargeStraight;
	public int Yahtzee;
	public int Chance;
	public int LowerGrandTotal;
	public int GrandTotal;
	
	public int dice[];

	public Player()
	{
		Ones = 0;
		Twos = 0;
		Threes = 0;
		Fours = 0;
		Fives = 0;
		Sixes = 0;
		UpperTempTotal = 0;
		UpperBonus = 0;
		UpperTotal = 0;
		ThreeOfAKind = 0;
		FourOfAKind = 0;
		FullHouse = 0;
		SmallStraight = 0;
		LargeStraight = 0;
		Yahtzee = 0;
		Chance = 0;
		LowerGrandTotal = 0;
		GrandTotal = 0;
		dice = new int[5];
	}
	
	public void setOnes(int i)
	{
		Ones = i;
	}
	
	public int getOnes()
	{		
		return Ones;
	}
	
	public void setTwos(int i)
	{
		Twos = i;
	}
	
	public int getTwos()
	{
		return Twos;
	}
	
	public void setThrees(int i)
	{
		Threes = i;
	}
	
	public int getThrees()
	{
		return Threes;
	}

	public void setFours(int i)
	{
		Fours = i;
	}
	
	public int getFours()
	{
		return Fours;
	}
	
	public void setFives(int i)
	{
		Fives = i;
	}
	
	public int getFives()
	{
		return Fives;
	}
	
	public void setSixes(int i)
	{
		Sixes = i;
	}
	
	public int getSixes()
	{
		return Sixes;
	}
	
	public void setUpperTempTotal(int i)
	{
		UpperTempTotal = i;
	}
	
	public int getUpperTempTotal()
	{
		return UpperTempTotal;
	}
	
	public void setUpperBonus(int i)
	{
		UpperBonus = i;
	}
	
	public int getUpperBonus()
	{
		return UpperBonus;
	}
	
	public void setUpperTotal(int i)
	{
		UpperTotal = i;
	}
	
	public int getUpperTotal()
	{
		return UpperTotal;
	}
	
	public void set3OfAKind(int i)
	{
		ThreeOfAKind = i;
	}
	
	public int get3OfAKind()
	{
		return ThreeOfAKind;
	}
	
	public void set4OfAKind(int i)
	{
		FourOfAKind = i;
	}
	
	public int get4OfAKind()
	{
		return FourOfAKind;
	}
	public void setFullHouse(int i)
	{
		FullHouse = i;
	}
	
	public int getFullHouse()
	{
		return FullHouse;
	}
	
	public void setSmallStraight(int i)
	{
		SmallStraight = i;
	}
	
	public int getSmallStraight()
	{
		return SmallStraight;
	}
	
	public void setLargeStraight(int i)
	{
		LargeStraight = i;
	}
	
	public int getLargeStraight()
	{
		return LargeStraight;
	}
	
	public void setYahtzee(int i)
	{
		Yahtzee = i;
	}
	
	public int getYahtzee()
	{
		return Yahtzee;
	}
	
	public void setChance(int i)
	{
		Chance = i;
	}
	
	public int getChance()
	{
		return Chance;
	}
	
	public void setLowerGrandTotal(int i)
	{
		LowerGrandTotal = i;
	}
	
	public int getLowerGrandTotal()
	{
		return LowerGrandTotal;
	}
	
	public void setGrandTotal(int i)
	{
		GrandTotal = i;
	}
	
	public int getGrandTotal()
	{
		return GrandTotal;
	}
}
