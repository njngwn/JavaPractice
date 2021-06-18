package interfaceEx;

import java.util.ArrayList;
import java.util.Scanner;

public class StringStackAnswer implements Stack {
   ArrayList<String> wordList;
   int count;
   int limit;

   public StringStackAnswer(int cnt) {
      wordList=new ArrayList<String>();
      count = 0;
      limit=cnt;
   }

   @Override
   public int length() {
      return count;
   }

   @Override
   public int capacity() {
      return wordList.size();
   }

   @Override
   public String pop() {
      if(count==limit)
         count--;
      return wordList.get(count--);
   }

   @Override
   public boolean push(String val) {
      if(count==limit) {
         return false;
      }
      
      wordList.add(val);
      count++;
      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
      int cnt = sc.nextInt();
      StringStackAnswer st = new StringStackAnswer(cnt);
      while (true) {
         System.out.print("���ڿ� �Է� >>");
         String word = sc.next();
         if (word.equals("�׸�")) {
            st.count--;
            break;
         }
         if(st.push(word)) {
            continue;
         }else {
            System.out.println("������ �� ���� Ǫ�� �Ұ�!");
         }
      }
      
      for(int i=0;i<st.capacity();i++) {
         System.out.println(st.pop());
      }
      sc.close();
   }

}