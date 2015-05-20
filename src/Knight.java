import java.util.Random;

public class Knight extends ChessPiece
{
	public Knight(int x, int y, int t, int n)
	{
		super(x,y,t,n,"Knight");
	}
	public String move(CoordinatePair p)
	{
		if(this.pos.getX() + 1 == p.getX() && this.pos.getY() + 2 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() + 2 == p.getX() && this.pos.getY() + 1 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 1 == p.getX() && this.pos.getY() - 2 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 2 == p.getX() && this.pos.getY() - 1 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() + 1 == p.getX() && this.pos.getY() - 2 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 1 == p.getX() && this.pos.getY() + 2 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() + 2 == p.getX() && this.pos.getY() - 1 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() - 2 == p.getX() && this.pos.getY() + 1 == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else
			return "IMPROPER MOVEMENT!";
	}
	public void destroy(){
		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;}
}
