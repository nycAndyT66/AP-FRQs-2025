public Round(String[] names){
    competitorList = new ArrayList<Competitor>();
    int count = 1;
    for(String x: names){
        competitorList.add(new Competitor(x, count));
        count++;
    }
}
