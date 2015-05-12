public class King extends ChessPiece
{
	private final String NAME = "King";
	public King(int x, int y, int t)
	{
		super(x,y,t);
	}
	public void destroy(){}
	public boolean isInCheck()
	{
		return false;
	}
	public boolean isInCheckmate()
	{
		return false;
	}
	public String move(CoordinatePair p)
	{

		super.pos = p;
		return NAME + " to " + pos.getPos();
	}
}