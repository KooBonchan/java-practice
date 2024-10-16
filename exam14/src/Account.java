import java.time.LocalDate;

public class Account {
  private String name;
  private final String no;
  private long balance;
  private final Day openDay;

  public Account(String name, String no, long balance, Day openDay) {
    this.name = name;
    this.no = no;
    this.balance = balance;
    this.openDay = openDay;
  }

  public Day getOpenDay() {
    return openDay.clone();
//    to ensure caller cannot modify the original data
//    similar to read-only like.
  }

  public String getName() {
    return name;
  }

  public String getNo() {
    return no;
  }

  public long getBalance() {
    return balance;
  }


  void deposit(long k){
    if(k > 0) balance += k;
  }
  void withdraw(long k){
    if(k > 0){
      balance -= k;
      if(balance < 0) balance = 0;
    }
  }

  @Override
  public String toString() {
    return String.format("""
        ------------------------------------------
        NAME           : %20s
        ACCOUNT NUMBER : %20s
        Balance        : %20d
                     open day %s
        ------------------------------------------
      """, this.name, this.no, this.balance, this.openDay);
  }

}
