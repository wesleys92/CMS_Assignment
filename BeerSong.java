
public class BeerSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 99; i > 0; i--)
		{
			Ninety_Nine_Bottles_of_Beer(i);
		}
	}
	
	public static void Ninety_Nine_Bottles_of_Beer(int num)
	{
		if ((num - 1) == 0)
		{
			System.out.println(num + " bottle of beer on the wall, " + num + " bottle of beer");
			System.out.println("take one down, pass it around, no more bottles of beer on the wall.");			
		}
		else if ((num - 1) == 1)
		{
			System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer");
			System.out.println("take one down, pass it around, " + (num - 1) + " bottle of beer on the wall.");			
		}
		else
		{
			System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer");
			System.out.println("take one down, pass it around, " + (num - 1) + " bottles of beer on the wall.");			
		}
	}

}