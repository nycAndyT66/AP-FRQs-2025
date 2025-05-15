public int dogWalkShift(int startHour, int endHour){
  int total = 0;
  for(int i = startHour; i <= endHour; i++){
      total += walkDogs(i) * 5;
      if (walkDog(1) == maxDogs){
        total += 3;
      }
      else if(9 <= i && i <=17){
          total += 3;
      }
    }
  return total;
}
