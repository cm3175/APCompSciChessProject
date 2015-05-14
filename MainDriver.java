import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver
{  
  public static void main(String[]msStreet)
  {
    ChessBoard board = new ChessBoard();
    ArrayList<ChessPiece> black = new ArrayList<ChessPiece>();
    ArrayList<ChessPiece> white = new ArrayList<ChessPiece>();
    /*
     * AREA FOR PICTURE STUFF THINGS & Putting of pieces into teams
     */
    white.add(0, new King(0, 4, 0));
    white.add(1, new Queen(0, 3, 0));
    white.add(2, new Bishop(0, 5, 0));
    white.add(3, new Bishop(0, 2, 0));
    white.add(4, new Knight(0, 6, 0));
    white.add(5, new Knight(0, 1, 0));
    white.add(6, new Rook(0, 7, 0));
    white.add(7, new Rook(0, 0, 0));
    white.add(8, new Pawn(1, 4, 0));
    white.add(9, new Pawn(1, 3, 0));
    white.add(10, new Pawn(1, 5, 0));
    white.add(11, new Pawn(1, 2, 0));
    white.add(12, new Pawn(1, 6, 0));
    white.add(13, new Pawn(1, 1, 0));
    white.add(14, new Pawn(1, 7, 0));
    white.add(15, new Pawn(1, 0, 0));

	System.out.println("Enter HELP for help.");
	String input = "";
	Scanner scan = new Scanner(System.in);
  //Turns
    while(black.get(0).pos.getX() <= -1 || white.get(0).pos.getX() <= -1)
    {
    	input = "";
    	//white turn]
    	{
    		System.out.println("Please enter you move: ");
    		input = scan.next();
    		if(input.indexOf("help") != 0)
    		{
    			System.out.println("To move a piece, type in move, the name of the piece, for pieces with multiple instances denotate it with its number,  and the coordinates to move to: /n"
    					+ "Ex: move bishop 1 5 4");
    		}
    		else if(input.indexOf("move") != 0)
    		{
    			if(input.indexOf("queen") != 0)
    			{
    				white.get(Integer.parseInt(input.substring(input.indexOf("queen")+6, input.indexOf("queen")+7))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("queen")+8, input.indexOf("queen")+9)),
    						Integer.parseInt(input.substring(input.indexOf("queen")+10, input.indexOf("queen")+11))));
    			}
    			else if(input.indexOf("pawn") != 0)
    			{
    				white.get(Integer.parseInt(input.substring(input.indexOf("pawn")+5, input.indexOf("pawn")+6))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("pawn")+7, input.indexOf("pawn")+8)),
    						Integer.parseInt(input.substring(input.indexOf("pawn")+9, input.indexOf("pawn")+10))));
    			}
    			else if(input.indexOf("king") != 0)
    			{
    				white.get(Integer.parseInt(input.substring(input.indexOf("king")+5, input.indexOf("king")+6))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("king")+7, input.indexOf("king")+8)),
    						Integer.parseInt(input.substring(input.indexOf("king")+9, input.indexOf("king")+10))));
    			}
    			else if(input.indexOf("bishop") != 0)
    			{
    				white.get(Integer.parseInt(input.substring(input.indexOf("bishop")+7, input.indexOf("bishop")+8))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("bishop")+9, input.indexOf("bishop")+10)),
    						Integer.parseInt(input.substring(input.indexOf("bishop")+11, input.indexOf("bishop")+12))));
    			}
    			else if(input.indexOf("knight") != 0)
    			{
    				white.get(Integer.parseInt(input.substring(input.indexOf("knight")+7, input.indexOf("knight")+8))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("knight")+9, input.indexOf("knight")+10)),
    						Integer.parseInt(input.substring(input.indexOf("knight")+11, input.indexOf("knight")+12))));
    			}
    			else if(input.indexOf("rook") != 0)
    			{
    				white.get(Integer.parseInt(input.substring(input.indexOf("rook")+5, input.indexOf("rook")+6))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("rook")+7, input.indexOf("rook")+8)),
    						Integer.parseInt(input.substring(input.indexOf("rook")+9, input.indexOf("rook")+10))));
    			}
    			else
	    			System.out.println("Piece does not exist. Pieces are /n"
	    					+ "pawn, queen, king, rook, knight, and rook.");
    		}
    		else
    			System.out.println("Unknown Command");
    	}
    	input = "";
    	//black turn
    	{
    		System.out.println("Please enter you move: ");
    		input = scan.next();
    		if(input.indexOf("help") != 0)
    		{
    			System.out.println("To move a piece, type in move, the name of the piece, for pieces with multiple instances denotate it with its number,  and the coordinates to move to: /n"
    					+ "Ex: move bishop 1 5 4");
    		}
    		else if(input.indexOf("move") != 0)
    		{
    			if(input.indexOf("queen") != 0)
    			{
    				black.get(Integer.parseInt(input.substring(input.indexOf("queen")+6, input.indexOf("queen")+7))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("queen")+8, input.indexOf("queen")+9)),
    						Integer.parseInt(input.substring(input.indexOf("queen")+10, input.indexOf("queen")+11))));
    			}
    			else if(input.indexOf("pawn") != 0)
    			{
    				black.get(Integer.parseInt(input.substring(input.indexOf("pawn")+5, input.indexOf("pawn")+6))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("pawn")+7, input.indexOf("pawn")+8)),
    						Integer.parseInt(input.substring(input.indexOf("pawn")+9, input.indexOf("pawn")+10))));
    			}
    			else if(input.indexOf("king") != 0)
    			{
    				black.get(Integer.parseInt(input.substring(input.indexOf("king")+5, input.indexOf("king")+6))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("king")+7, input.indexOf("king")+8)),
    						Integer.parseInt(input.substring(input.indexOf("king")+9, input.indexOf("king")+10))));
    			}
    			else if(input.indexOf("bishop") != 0)
    			{
    				black.get(Integer.parseInt(input.substring(input.indexOf("bishop")+7, input.indexOf("bishop")+8))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("bishop")+9, input.indexOf("bishop")+10)),
    						Integer.parseInt(input.substring(input.indexOf("bishop")+11, input.indexOf("bishop")+12))));
    			}
    			else if(input.indexOf("knight") != 0)
    			{
    				black.get(Integer.parseInt(input.substring(input.indexOf("knight")+7, input.indexOf("knight")+8))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("knight")+9, input.indexOf("knight")+10)),
    						Integer.parseInt(input.substring(input.indexOf("knight")+11, input.indexOf("knight")+12))));
    			}
    			else if(input.indexOf("rook") != 0)
    			{
    				black.get(Integer.parseInt(input.substring(input.indexOf("rook")+5, input.indexOf("rook")+6))).move(
    						new CoordinatePair(Integer.parseInt(input.substring(input.indexOf("rook")+7, input.indexOf("rook")+8)),
    						Integer.parseInt(input.substring(input.indexOf("rook")+9, input.indexOf("rook")+10))));
    			}
    			else
	    			System.out.println("Piece does not exist. Pieces are /n"
	    					+ "pawn, queen, king, rook, knight, and rook.");
    		}
    		else
    			System.out.println("Unknown Command");
    	}
    }
  }
}

