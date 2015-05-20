import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver
{
	public static void main(String[]msStreet)
	{
		ArrayList<ChessPiece> black = new ArrayList<ChessPiece>();// black team initialized
		ArrayList<ChessPiece> white = new ArrayList<ChessPiece>();// white team initialized
    
		white.add(0, new King(0, 4, 0, 1));//initialization of white pieces
		white.add(1, new Queen(0, 3, 0, 1));
		white.add(2, new Bishop(0, 5, 0, 1));
		white.add(3, new Bishop(0, 2, 0, 2));
		white.add(4, new Knight(0, 6, 0, 1));
		white.add(5, new Knight(0, 1, 0, 2));
		white.add(6, new Rook(0, 7, 0, 1));
		white.add(7, new Rook(0, 0, 0, 2));
		white.add(8, new Pawn(1, 4, 0, 1));
		white.add(9, new Pawn(1, 3, 0, 2));
		white.add(10, new Pawn(1, 5, 0, 3));
		white.add(11, new Pawn(1, 2, 0, 4));
		white.add(12, new Pawn(1, 6, 0, 5));
		white.add(13, new Pawn(1, 1, 0, 6));
		white.add(14, new Pawn(1, 7, 0, 7));
		white.add(15, new Pawn(1, 0, 0, 8));
    
		black.add(0, new King(7, 4, 1, 1));// initialization of black pieces
		black.add(1, new Queen(7, 3, 1, 1));
		black.add(2, new Bishop(7, 5, 1, 1));
		black.add(3, new Bishop(7, 2, 1, 2));
		black.add(4, new Knight(7, 6, 1, 1));
		black.add(5, new Knight(7, 1, 1, 2));
		black.add(6, new Rook(7, 7, 1, 1));
		black.add(7, new Rook(7, 0, 1, 2));
		black.add(8, new Pawn(6, 4, 1, 1));
		black.add(9, new Pawn(6, 3, 1, 2));
		black.add(10, new Pawn(6, 5, 1, 3));
		black.add(11, new Pawn(6, 2, 1, 4));
		black.add(12, new Pawn(6, 6, 1, 5));
		black.add(13, new Pawn(6, 1, 1, 6));
		black.add(14, new Pawn(6, 7, 1, 7));
		black.add(15, new Pawn(6, 0, 1, 8));
		//Board Printing
		for(int x = 0; x < 8; x++)
		{
			for(int y = 0; y < 8; y++)
			{
				for(int p = 0; p < 16; p++)
				{
					if(black.get(p).pos.getX() == x && black.get(p).pos.getY() == y)
					{
						System.out.print("B"+black.get(p).getName() + black.get(p).num + " ");
						p = 17;
					}
					else if(white.get(p).pos.getX() == x && white.get(p).pos.getY() == y)
					{
						System.out.print("W"+white.get(p).getName() + white.get(p).num + " ");
						p = 17;
					}
					else if(p == 15)
					{
						System.out.print("______	");
					}							
				}
			}
			System.out.println("");
		}
		System.out.println("To move a piece, type in move, the coordinates to move to in the X Y order, the name of the piece,\n"
				 + " and for pieces with multiple instances denotate it with its number: Ex: move bishop 5 4 1\n"
				 + "To Print out the board, type print board");
		System.out.println("Enter HELP for help.");
		String input = "";
		Scanner scan = new Scanner(System.in);
		
		
		//Turns
		boolean b = true;
		String output = "";
		while(black.get(0).pos.getX() >= -1 || white.get(0).pos.getX() >= -1)
		{
			input = "";
			//white turn]
			System.out.println("White Turn");
			while(b)
			{
				System.out.println("Please enter you move: ");
				input = scan.nextLine();
				System.out.println(input);
				if(input.equalsIgnoreCase("help"))
				{
					System.out.println("To move a piece, type in move, the coordinates to move to in the X Y order, the name of the piece,\n"
									 + " and for pieces with multiple instances denotate it with its number: Ex: move bishop 5 4 1\n"
									 + "To Print out the board, type print board");
				}
				else if(input.substring(0, input.indexOf(" ")).equalsIgnoreCase("move"))
				{
					input = input.substring(input.indexOf(' ')+1, input.length());
					if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("king"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.length()));
						output = white.get(0).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("queen"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.length()));
						output = white.get(1).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("bishop"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = white.get(t+1).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("knight"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = white.get(t+3).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("rook"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = white.get(t+5).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("pawn"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						System.out.println(x);
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						System.out.println(y);
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						System.out.println(t+7);
						output = white.get(t+7).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
				}
				else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("print board"))
				{
					for(int x = 0; x < 8; x++)
					{
						for(int y = 0; y < 8; y++)
						{
							for(int p = 0; p < 16; p++)
							{
								if(black.get(p).pos.getX() == x && black.get(p).pos.getY() == y)
								{
									System.out.print("B"+black.get(p).getName() + black.get(p).num + " ");
									p = 17;
								}
								else if(white.get(p).pos.getX() == x && white.get(p).pos.getY() == y)
								{
									System.out.print("W"+white.get(p).getName() + white.get(p).num + " ");
									p = 17;
								}
								else if(p == 15)
								{
									System.out.print("______	");
								}							
							}
						}
						System.out.println("");
					}
				}
				else
					System.out.println("Unknown Command");
			}
			b = true;
			for(int x= 0; x < 8; x++)
			{
				for(int y = 0; y < 8; y++)
				{
					for(int p = 0; p < 16; p++)
					{
						if(black.get(p).pos.getX() == x && black.get(p).pos.getY() == y)
						{
							System.out.print("B"+black.get(p).getName() + black.get(p).num + " ");
							p = 17;
						}
						else if(white.get(p).pos.getX() == x && white.get(p).pos.getY() == y)
						{
							System.out.print("W"+white.get(p).getName() + white.get(p).num + " ");
							p = 17;
						}
						else if(p == 15)
						{
							System.out.print("______	");
						}							
					}
				}
				System.out.println("");
			}
			input = "";
			//black turn
			System.out.println("Black Turn");
			while(b)
			{
				System.out.println("Please enter you move: ");
				input = scan.nextLine();
				if(input.equalsIgnoreCase("help"))
				{
					System.out.println("To move a piece, type in move, the coordinates to move to in the X Y order, the name of the piece,\n"
									 + " and for pieces with multiple instances denotate it with its number: Ex: move bishop 5 4 1\n"
									 + "To Print out the board, type print board");
				}
				else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("move"))
				{
					input = input.substring(input.indexOf(' ')+1, input.length());
					if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("king"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.length()));
						output = black.get(0).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("queen"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.length()));
						output = black.get(1).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("bishop"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = black.get(t+1).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("knight"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = black.get(t+3).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("rook"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = black.get(t+5).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
						{
							b = false;
							System.out.println(output);
						}
					}
					else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("pawn"))
					{
						input = input.substring(input.indexOf(' ')+1, input.length());
						int x = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int y = Integer.valueOf(input.substring(0, input.indexOf(' ')));
						input = input.substring(input.indexOf(' ')+1, input.length());
						int t = Integer.valueOf(input.substring(0, input.length()));
						output = black.get(t+7).move(new CoordinatePair(x,y));
						if(output.equals("IMPROPER MOVEMENT!"))
							System.out.println(output);
						else
							b = false;
							System.out.println(output);
					}
				}
				else if(input.substring(0, input.indexOf(' ')).equalsIgnoreCase("print board"))
				{
					for(int x = 0; x < 8; x++)
					{
						for(int y = 0; y < 8; y++)
						{
							for(int p = 0; p < 16; p++)
							{
								if(black.get(p).pos.getX() == x && black.get(p).pos.getY() == y)
								{
									System.out.print("B"+black.get(p).getName() + black.get(p).num + " ");
									p = 17;
								}
								if(white.get(p).pos.getX() == x && white.get(p).pos.getY() == y)
								{
									System.out.print("W"+white.get(p).getName() + white.get(p).num + " ");
									p = 17;
								}
								else if(p == 15)
								{
									System.out.print("______	");
								}							
							}
						}
						System.out.println("");
					}
				}
				else
					System.out.println("Unknown Command");
			}
			b = true;
			for(int x = 0; x < 8; x++)
			{
				for(int y = 0; y < 8; y++)
				{
					for(int p = 0; p < 16; p++)
					{
						if(black.get(p).pos.getX() == x && black.get(p).pos.getY() == y)
						{
							System.out.print("B"+black.get(p).getName() + black.get(p).num + " ");
							p = 17;
						}
						if(white.get(p).pos.getX() == x && white.get(p).pos.getY() == y)
						{
							System.out.print("W"+white.get(p).getName() + white.get(p).num + " ");
							p = 17;
						}
						else if(p == 15)
						{
							System.out.print("______	");
						}							
					}
				}
				System.out.println("");
			}
		}
	}
}

