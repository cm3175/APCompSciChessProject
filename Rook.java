import java.util.Random;

public class Rook extends ChessPiece
{
	private final String NAME = "Rook";
	public Rook(int x, int y, int t)
	{
		super(x,y,t);
	}
	public String move(CoordinatePair p)
	{
		
		super.pos = p;
		return NAME + " to " + pos.getPos();
	}
	public void destroy()
	{

		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;
	}
}
