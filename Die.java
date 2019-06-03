import java.util.Random;
public class Die {
	Random die = new Random();
	int dieValue = 0;
	public int Roll()
	{
		int i;
		i = die.nextInt(6) + 1;
		return i;
	}
	
}

