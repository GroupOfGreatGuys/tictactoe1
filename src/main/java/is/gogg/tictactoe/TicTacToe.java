package is.gogg.tictactoe;

import java.util.Scanner;
import static spark.Spark.*;
import spark.*;

public class TicTacToe
{
		private static Board board;
		private static Player p1;
		private static Player p2;
		
		public TicTacToe(Board b, Player player1, Player player2)
		{
			board = b;
			p1 = player1;
			p2 = player2;
		}
		
		public void playGame()
		{
			boolean p1Turn;
			if(p1.getMarker() == 'X')
			{
				p1Turn = true;
			}
			else
			{
				p1Turn = false;
			}
			for(int i = 0; i < 9; i++)
			{
				board.draw();
				boolean validTurn;
				if(p1Turn)
				{
					do
					{
						validTurn = board.makeTurn(p1.getMarker(), p1.getPlayerMove());
					}while(!validTurn);
					if(board.checkForWin(p1.getMarker()))
					{
						System.out.println(p1.getMarker() + " is winner!");
						return;
					}
				}
				else
				{
					do
					{
						validTurn = board.makeTurn(p2.getMarker(), p2.getPlayerMove());
					}while(!validTurn);
					if(board.checkForWin(p1.getMarker()))
					{
						System.out.println(p1.getMarker() + " is winner!");
						return;
					}
				}
				p1Turn = !p1Turn;
			}
		}
		
        public static void main(String[] args)
        {
			staticFileLocation("/public");
			/*Scanner sc = new Scanner(System.in);
			char marker;
			do
			{
				System.out.println("Welcome to tic-tac-toe, would you like to play as x or o? ");
				marker = Character.toUpperCase(sc.findInLine(".").charAt(0));
			}while(marker != 'x' && marker != 'X' && marker != 'o' && marker != 'O');
			Player human = new Player(true, marker);
			Player cpu;
			if(marker == 'X')
			{
				cpu = new Player(false, 'O');
			}
			else
			{
				cpu = new Player(false, 'X');
			}
            System.out.println("Let's play");
			Board b = new Board();
			TicTacToe tictactoe = new TicTacToe(b, human, cpu);
			tictactoe.playGame();*/
			post(new Route("/setMarker") {
            @Override
            public Object handle(Request request, Response response) {
                char marker = Character.toUpperCase(String.valueOf(request.queryParams("marker")).charAt(0));
				System.out.println(marker);
                p1 = new Player(true, marker);
				if(marker == 'X')
				{
					p2 = new Player(false, 'O');
				}
				else
				{
					p2 = new Player(false, 'X');
				}
				board = new Board();
				return marker;
            }
        });
		post(new Route("/getSquare") {
            @Override
            public Object handle(Request request, Response response) {
				String square = String.valueOf(request.queryParams("square"));
				String valueToReturn = "";
				int p1Square;
				int p2Square;
				boolean valid;
				if(p1.getMarker() == 'X')
				{
					p1Square = p1.getHumanMove(square);
					valid = board.makeTurn(p1.getMarker(), p1Square);
					do
					{
						p2Square = p2.getPlayerMove();
						valid = board.makeTurn(p2.getMarker(), p2Square);
						System.out.println(p2.getMarker());
					}while(!valid);
				}
				else
				{
					do
					{
						p2Square = p2.getPlayerMove();
						valid = board.makeTurn(p2.getMarker(), p2Square);
					}while(!valid);
					p1Square = p1.getHumanMove(square);
					valid = board.makeTurn(p1.getMarker(), p1Square);
				}
				valueToReturn = valueToReturn + String.valueOf(p1Square) + String.valueOf(p2Square);
				if(board.checkForWin(p1.getMarker()))
				{
					valueToReturn =  valueToReturn + 'w';
				}
				else if(board.checkForWin(p2.getMarker()))
				{
					valueToReturn = valueToReturn + 'l';
				}
				for(int i = 0; i < 9; i++)
				{
					if(!board.isTaken(i))
					{
						System.out.println(valueToReturn);
						return valueToReturn;
					}
				}
				valueToReturn = valueToReturn + 't';
				return valueToReturn;
            }
        });
        }
}
