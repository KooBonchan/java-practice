public class Day {
  private int year = 1;
  private int month = 1;
  private int date = 1;

  public Day(){}
  public Day(int year) {
    this.year = year;
  }
  public Day(int year, int month) {
    this.year = year;
    this.month = month;
  }
  public Day(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }
  public Day(Day day){
    this(day.getYear(), day.getMonth(), day.getDate());
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if(month > 0 && month < 13)
      this.month = month;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    if(date > 0 && date < 32)
      this.date = date;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void set(int year, int month, int date){
    this.year = year;
    this.month = month;
    this.date = date;
  }
  public void set(Day day){
    this.set(day.getYear(), day.getMonth(), day.getDate());
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;
    if(this == obj) return true;
    if(this.getClass() != obj.getClass()) return false;
    Day rhs = (Day) obj;
    return this.year  == rhs.year
        && this.month == rhs.month
        && this.date  == rhs.date;
  }

  @Override
  protected Day clone() {
    return new Day(this);
  }

  public int toDayOfWeek(){
    int year = this.year;
    int month = this.month;
    if(month == 1 || month == 2){
      year--; month+=12;
    }

    return (year + year/4 - year/100 + year/400
            + (13 * month + 8) / 5
            + this.date
    ) % 7;
  }

  @Override
  public String toString() {
    String[] abbrev = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    return String.format("| %04d %02d %02d (%s) |",
      this.year, this.month, this.date, abbrev[this.toDayOfWeek()]);
  }
}
