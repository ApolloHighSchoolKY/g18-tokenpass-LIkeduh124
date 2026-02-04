public TokenPass(int playerCount){
  /*  to be answered in part (a) */
  currentPlayer = Math.random(0, playerCount-1).next;
  ArrayList board = new ArrayList<int>;
  for(int pos = 0; pos<playerCount; pos++)
  {
    board.add(Math.random(0, 11).next);
  }
  
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  int spot = 0;
  for(int pos = 0; pos<board.size(); pos++)
  {
    while(board.get(pos)>0)
    {
      if(spot = pos)
      {
        spot ++;
      }
      else if(spot = board.size-1)
      {
        board.get(spot)++;
        board.get(pos)--;
        spot = 0;
      }
      else
      {
        board.get(spot)++;
        board.get(pos)--;
        spot++;
      }
    }
  }
}
