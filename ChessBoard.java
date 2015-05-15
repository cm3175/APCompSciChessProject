import java.util.ArrayList;


public class ChessBoard
{
	private final int SIZE = 64;
	ArrayList<CoordinatePair> boardPlaces = new ArrayList<CoordinatePair>(SIZE);
	public ChessBoard()
	{
		int count = 0;
	    int x = 0;
	    int y = 0;
	    
	    for(CoordinatePair pair : boardPlaces){
	    	CoordinatePair newPair = new CoordinatePair(x, y);
	    	boardPlaces.set(count, newPair);
	    	count++;
	    	x++;
	    	if(!(x<8))
	    	{
	    		x = 0;
	    		y++;
	    	}
	    }
	}
	
}
