import java.util.Random;

public class Queen extends ChessPiece
{
	private final String NAME = "Queen";
	public Queen(int x, int y, int t)
	{
		super(x,y,t);
	}
	public void destroy(){
		Random r = new Random();
		pos.x = r.nextInt()*-10;
		pos.y = r.nextInt()*-10;}
	public String move(CoordinatePair p) 
	{
		for(int x = 1; ((this.pos.getX() + x <= 8 && this.pos.getX() + x >= 8)) &&
				((this.pos.getY() + x <= 8 )&&(this.pos.getY() - x >= 0)); x++)
		{
			if(this.pos.getX() == p.getX() && this.pos.getY() + x == p.getY())
			{
				super.pos = p;
				return NAME + " to " + pos.getPos();
			}
			else if(this.pos.getX() + x == p.getX() && this.pos.getY() == p.getY())
			{
				super.pos = p;
				return NAME + " to " + pos.getPos();
			}
			else if(this.pos.getX() - x == p.getX() && this.pos.getY() == p.getY())
			{
				super.pos = p;
				return NAME + " to " + pos.getPos();
			}
			else if(this.pos.getX() == p.getX() && this.pos.getY() - x == p.getY())
			{
				super.pos = p;
				return NAME + " to " + pos.getPos();
			}
			else if(this.pos.getX() + x == p.getX() && this.pos.getY() + x == p.getY())
			{
				super.pos = p;
				return NAME + " to " + pos.getPos();
			}
			else if(this.pos.getX() + x == p.getX() && this.pos.getY() + x == p.getY())
			{
				super.pos = p;
				return NAME + " to " + pos.getPos();
			}
		}
		return "IMPROPER MOVMENT!";
	}
}
