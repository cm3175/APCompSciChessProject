public class Pawn extends ChessPiece
{
	CoordinatePair pair;
	private final String NAME = "Pawn";
	public Pawn(int x, int y, int t)
	{
		super(x,y,t);
	}
	public String move(CoordinatePair p)
	{
		if(this.pos.getX() == p.getX() && this.pos.getY() + 1 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(((this.pos.getX() +1 == p.getX() || this.pos.getX() - 1 == p.getX()) && this.pos.getY() == p.getX()))
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else
		{
			return "YOU CANNOT MOVE THAT WAY!";
		}
	}
	public void destroy(){}
	public void promote(){}
}
