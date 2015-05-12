public class Knight extends ChessPiece
{
	public Knight(int x, int y, int t)
	{
		super(x,y,t);
	}
	public String move(CoordinatePair p)
	{
		super.pos = p;
		return pos.getPos();
	}
	public void attack(CoordinatePair p){}
	public void destroy(){}
}
