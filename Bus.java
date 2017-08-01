class Bus {
  private Passenger[] passengers;

  public Bus () {
    this.passengers = new Passenger[40];
  }


  public int count() {
    int count = 0;
    for (Passenger passenger : this.passengers) {
      if (passenger != null){
        count++;
      }
    }
    return count;
  }

  public void addPassenger ( Passenger passenger) {
    if (busIsFull()) {
      return;
    }
    int passengersCount = count();
    passengers[passengersCount] = passenger;
  } 


  public boolean busIsFull() {
    return count() == passengers.length;
  }



}