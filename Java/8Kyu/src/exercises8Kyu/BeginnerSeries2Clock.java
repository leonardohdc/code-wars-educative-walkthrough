package exercises8Kyu;

public class BeginnerSeries2Clock {
	public static void main(String[] args) {
		Past(8, 53, 30);
	}
 	public static long Past(int h, int m, int s) 
	{
		return h*3600000 + m*60000 + s*1000;
	}
}
