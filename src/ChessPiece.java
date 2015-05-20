import java.util.Random;


public class ChessPiece
{
	private int team;
	protected CoordinatePair pos;
	protected int num;
	private String name;
	public ChessPiece(int x, int y, int t, int n, String name)
	{
		pos = new CoordinatePair(x, y);
		team = t;
		num = n;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String move(CoordinatePair p)
	{
		pos = p;
		return pos.getPos();
	}
	public void destroy() {
		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;
	}
	public int getTeam() 
	{
		return team;
	}
}
