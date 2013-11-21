public class Board
{
        private char[] squares;
        boolean gameOver;

        public Board()
        {
                gameOver = false;
                squares = new char[9];
        }
        
        public Board(char[] squares)
        {
                squares = squares;
                draw(squares);
        }

        public void makeTurn(char sign, int index)
        {
                // Makes a player turn, puts the player's sign in the correct index
                squares[index] = sign;
                gameOver = checkForWin(sign);
        }
        
        public boolean checkForWin(char sign)
        {
                if (squares[0] == sign &&
                       squares[1] == sign &&
                       squares[2] == sign) {
                    return true;
                }

                if (squares[3] == sign &&
                   squares[4] == sign &&
                   squares[5] == sign) {
                    return true;
                }

                if (squares[6] == sign &&
                   squares[7] == sign &&
                   squares[8] == sign) {
                    return true;
                }

                if (squares[0] == sign &&
                   squares[3] == sign &&
                   squares[6] == sign) {
                    return true;
                }

                if (squares[1] == sign &&
                   squares[4] == sign &&
                   squares[7] == sign) {
                    return true;
                }

                if (squares[2] == sign &&
                   squares[5] == sign &&
                   squares[8] == sign) {
                    return true;
                }

                if (squares[0] == sign &&
                   squares[4] == sign &&
                   squares[8] == sign) {
                    return true;
                }

                if (squares[2] == sign &&
                   squares[4] == sign &&
                   squares[6] == sign) {
                    return true;
                }
                return false;
                // Checks if the game is over
        }


        public boolean playersTurn()
        {
                int counterx = 0;
                int countero = 0;

                for (char s : squares)
                {
                        if (s == 'X')
                        {
                                counterx++;
                        }
                        else if (s == 'O')
                        {
                                countero++;
                        }
                }
                if (counterx == countero)
                {
                        return true;
                }
                return false;
                //TODO: MAKE SURE THIS FUNCTION IS NOT CALLED
                //WHEN GAME IS OVER.
        }

        public void draw(char[] squares)
        {
                // This function draws up the board

                for (int i = 0; i < 9; i++)
                {

                        if (i == 1 || i == 4 || i == 7)
                        {
                                System.out.print("|" + squares[i] + "|");
                        }
                        else 
                                System.out.print(squares[i]);
                        if (i == 2 && i == 5)
                        {
                                System.out.println("\n" + "------------");
                        }
                }
        }
        
        public boolean isGameOver()
        {
                return gameOver;
        }

         public boolean isTaken(int number)
        {

                if (this.squares[number] == 'X' || this.squares[number] == 'O')
                {
                        return true;
                }
                return false;
        }
}