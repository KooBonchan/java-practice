class ID {
  private static int counter = 10100;
  private final int id;

  public int getStep() {
    return step;
  }

  public void setStep(int step) {
    this.step = step;
  }

  private int step = 1;

  public ID(){
    this.id = counter;
    counter += step;
  }

  public int getId() {
    return id;
  }


  static int getLastId(){
    return counter;
  }
}
