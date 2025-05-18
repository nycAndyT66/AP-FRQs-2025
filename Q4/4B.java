public boolean clearPair(int row, int col){
    int saveNum = puzzle[row][col];
    for(int i = row; i < puzzle.length; i++){
        for(int j = 0; i < puzzle[0].length; j++){
            if(saveNum == puzzle[i][j] && saveNum+puzzle[i][j] == 10){
                puzzle[row][col] == 0;
                puzzle[i][j] == 0;
                return true;
            }
        }
    }
    return false;
}
