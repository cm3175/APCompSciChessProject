
public class CoordinatePair
{
	int x, y;
	public CoordinatePair(int a, int b){
		x = a;
		y = b;
	}
	public void set(int a, int b){
		x = a;
		y = b;
	}
	public int getX()
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
	public String getPos()
	{
		return x + "," + y;
	}
}
