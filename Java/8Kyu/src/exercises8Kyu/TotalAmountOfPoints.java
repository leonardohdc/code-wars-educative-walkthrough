package exercises8Kyu;

public class TotalAmountOfPoints {
	public static int points(String[] games) {
      int finalPoints = 0;
    	for(String str : games)
    	{
    		int firstTeam   = Integer.parseInt(str.split(":")[0]);
    		int secondTeam  = Integer.parseInt(str.split(":")[1]);
    		if(firstTeam > secondTeam)
    		{
    			finalPoints += 3;
    		}
    		if(firstTeam == secondTeam)
    		{
    			finalPoints += 1;
    		}
    	}
		return finalPoints;
    }
}
