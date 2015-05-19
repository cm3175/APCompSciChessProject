import java.util.Random;

public class Knight extends ChessPiece
{
	private final String NAME = "Knight";
	public Knight(int x, int y, int t)
	{
		super(x,y,t);
	}
	public String move(CoordinatePair p)
	{
		if(this.pos.getX() + 1 == p.getX() && this.pos.getY() + 2 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() + 2 == p.getX() && this.pos.getY() + 1 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 1 == p.getX() && this.pos.getY() - 2 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 2 == p.getX() && this.pos.getY() - 1 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() + 1 == p.getX() && this.pos.getY() - 2 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 1 == p.getX() && this.pos.getY() + 2 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() + 2 == p.getX() && this.pos.getY() - 1 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 2 == p.getX() && this.pos.getY() + 1 == p.getY())
		{
			super.pos = p;
			return NAME + " to " + pos.getPos();
		}
		else
			return "IMPROPER MOVEMENT!";
	}
	public void destroy(){
		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;}
}
