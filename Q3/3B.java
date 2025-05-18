public ArrayList<Match> buildMatches(){
    ArrayList<Match> arrMatch = new ArrayList<Match>();
    if(competitorList.size()%2 == 0){
        for(int i = 0; i < competitorList.size()/2; i++){
            arrMatch.add(new Match(competitorList.get(i), competitorList.get(competitorList.size()-1-i)));
        }
        return arrMatch;
    }
    else{
        for(int i = 0; i < competitorList.size()/2; i++){
            arrMatch.add(new Match(competitorList.get(i+1), competitorList.get(competitorList.size()-1-i)));
        }
        return arrMatch;
    }
}
