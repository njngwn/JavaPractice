package quiz;
import java.util.Scanner;

public class card_answer {
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
	      int lLimit=0,hLimit=99;
	      
	      int count=1;
	      int userNum=0;
	      int comNum=(int)(Math.random()*100);
	      while(true) {
	         System.out.println(lLimit+"-"+hLimit);
	         System.out.print(count+">>");
	         count++;
	         userNum=sc.nextInt();
	         if(userNum>comNum) {//�� ����
	            hLimit=userNum;
	            System.out.println("�� ����");
	            continue;
	         }else if(userNum<comNum) {//�� ����
	            lLimit=userNum;
	            System.out.println("�� ����");
	            continue;
	         }else {
	            System.out.println("�¾ҽ��ϴ�.");
	            String reGame;
	            System.out.print("�ٽ� �����ϰڽ��ϱ�(y/n)");
	            reGame=sc.next();
	            if(reGame.equals("y") || reGame.equals("Y")) {
	               System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
	               comNum=(int)(Math.random()*100);
	               count=0;
	               lLimit=0;hLimit=99;
	               continue;
	            }else if(reGame.equals("n") || reGame.equals("N")) {
	               break;
	            }
	         }
	      }
	      
	      System.out.println("���� ����");
	      sc.close();
	   }

}
