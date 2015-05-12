
public class ChessPiece
{
	private int team;
	protected CoordinatePair pos;
	public ChessPiece(int x, int y, int t)
	{
		pos = new CoordinatePair(x, y);
		this.team = t;
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
