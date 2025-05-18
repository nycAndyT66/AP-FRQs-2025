public SumorSameGame(int numRows, int numCols){
    puzzle = new puzzle[numRows][numCols];
    for(int i = 0, i < numRows; i++){
        for(int j = 0; j < numCols; j++){
            int random = (int) (Math.random()*9 + 1);
            puzzle[i][j] = random;
        }
    }
}
