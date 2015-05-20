import java.util.Random;

public class Pawn extends ChessPiece
{
	public Pawn(int x, int y, int t, int n)
	{
		super(x,y,t,n,"Pawn");
	}
	public String move(CoordinatePair p)
	{
		if(this.pos.getX() == p.getX() && this.pos.getY() + 1 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(((this.pos.getX() +1 == p.getX() || this.pos.getX() - 1 == p.getX()) && this.pos.getY() == p.getX()))
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else
		{
			return "IMPROPER MOVMENT!";
		}
	}
	public void destroy()
	{
		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;
	}
	public void promote(){}
}
