package quiz;
import java.util.Scanner;

public class card_answer {
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("수를 결정하였습니다. 맞추어 보세요");
	      int lLimit=0,hLimit=99;
	      
	      int count=1;
	      int userNum=0;
	      int comNum=(int)(Math.random()*100);
	      while(true) {
	         System.out.println(lLimit+"-"+hLimit);
	         System.out.print(count+">>");
	         count++;
	         userNum=sc.nextInt();
	         if(userNum>comNum) {//더 낮게
	            hLimit=userNum;
	            System.out.println("더 낮게");
	            continue;
	         }else if(userNum<comNum) {//더 높게
	            lLimit=userNum;
	            System.out.println("더 높게");
	            continue;
	         }else {
	            System.out.println("맞았습니다.");
	            String reGame;
	            System.out.print("다시 시작하겠습니까(y/n)");
	            reGame=sc.next();
	            if(reGame.equals("y") || reGame.equals("Y")) {
	               System.out.println("수를 결정하였습니다. 맞추어 보세요");
	               comNum=(int)(Math.random()*100);
	               count=0;
	               lLimit=0;hLimit=99;
	               continue;
	            }else if(reGame.equals("n") || reGame.equals("N")) {
	               break;
	            }
	         }
	      }
	      
	      System.out.println("게임 종료");
	      sc.close();
	   }

}
