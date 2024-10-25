※ 15-15
   arg를 입력하지 않으면 오늘 달력을 그리고 
   arg에 년도를 입력하면 그해 1~12월을 출력함.


1. import 수정
   import java.util.GregorianCalendar;
   import static java.util.GregorianCalendar.*;
아래와 같이 변경
   import java.util.GregorianCalendar;


2. %3로 되어 있으므로 아래 공백도 3칸이 되도록 수정
   for (int i = 0; i < wd; i++) 
   System.out.print(" ");		// 1일보다 왼쪽 스페이스를 표시
	
   for (int i = 1; i <= mdays; i++) {
      System.out.printf("%3d",i);


3. 기호상수 변경
   GregorianCalendar today = new GregorianCalendar();	// 현재 날짜
   year = today.get(YEAR);			// 년
   month = today.get(MONTH) + 1;	// 월
아래와 같이 변경
   GregorianCalendar today = new GregorianCalendar();	// 현재 날짜
   year = today.get(today.YEAR);			// 년
   month = today.get(today.MONTH) + 1;	// 월

3. 