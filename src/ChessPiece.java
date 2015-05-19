
public class ChessPiece
{
	private int team;
	protected CoordinatePair pos;
	protected int num;
	public ChessPiece(int x, int y, int t, int n)
	{
		pos = new CoordinatePair(x, y);
		team = t;
		num = n;
	}
	public String move(CoordinatePair p)
	{
		pos = p;
		return pos.getPos();
	}
	public void destroy() {
	}
	public int getTeam() 
	{
		return team;
	}
}
