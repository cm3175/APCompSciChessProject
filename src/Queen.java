public class Queen extends ChessPiece
{
	private final String NAME = "Queen";
	private CoordinatePair pair;
	public Queen(int x, int y, int t)
	{
		super(x,y,t);
	}
	public void destroy(){}
	public String move(CoordinatePair p) 
	{
		super.pos = p;
		return NAME + " to " + pos.getPos();
	}
}
