import java.util.ArrayList;
import java.util.Random;

public class King extends ChessPiece
{
	public King(int x, int y, int t, int n)
	{
		super(x,y,t,n,"King");
	}
	public void destroy(){
		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;}
	public boolean isInCheck(ArrayList<ChessPiece> a)
	{
		for(int x = 0; x < a.size() - 1; x++)
		{
			CoordinatePair p = a.get(x).pos;
			if(a.get(x).move(this.pos) == "IMPROPER MOVMENT!")
			{
				a.get(x).pos = p;
				return false;
			}
		}
		return false;
	}
	public boolean isInCheckmate(ArrayList<ChessPiece> a)
	{
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 = false;
		boolean b4 = false;
		boolean b5 = false;
		boolean b6 = false;
		boolean b7 = false;
		boolean b8 = false;
		for(int x = 0; x < a.size() - 1; x++)
		{
			CoordinatePair p = a.get(x).pos;
			if(a.get(x).move(new CoordinatePair(p.getX(), p.getY())) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b1 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX() + 1, p.getY())) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b2 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX() - 1, p.getY())) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b3 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX(), p.getY() + 1)) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b4 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX(), p.getY() - 1)) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b5 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX() + 1, p.getY() + 1)) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b6 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX() - 1, p.getY() + 1)) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b7 = true;
			}
			else if(a.get(x).move(new CoordinatePair(p.getX() + 1, p.getY() - 1)) != "IPROPER MOVEMENT!")
			{
				a.get(x).pos = p;
				b8 = true;
			}
		}
		if(b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8)
			return true;
		else
			return false;
	}
	public String move(CoordinatePair p)
	{
		if(this.pos.getX() + 1 == p.getX() && this.pos.getY() == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getX() -1 == p.getX() && this.pos.getY() == p.getY())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getY() + 1 == p.getY() && this.pos.getX() == p.getX())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getY() - 1 == p.getY() && this.pos.getX() == p.getX())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getY() + 1 == p.getY() && this.pos.getX() + 1== p.getX())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getY() - 1 == p.getY() && this.pos.getX() + 1== p.getX())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getY() + 1 == p.getY() && this.pos.getX() - 1== p.getX())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else if(this.pos.getY() - 1 == p.getY() && this.pos.getX() - 1== p.getX())
		{
			super.pos = p;
			return getName() + " to " + pos.getPos();
		}
		else
		{
			return "IMRPOPER MOVEMENT!";
		}
	}
}