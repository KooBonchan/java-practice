import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Account {
  static int count;

  static {
    count = 0;
  }

  { // always run when instance is born
    count++;
    System.out.println("Thank you for visiting");
  } // 생성자 안에 넣는 것이 일반적이라 보임

  private String name;
  private String no;
  private long balance;

  public void deposit(long amount){
    balance += amount;
  }

}
