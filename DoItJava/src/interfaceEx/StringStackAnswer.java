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
      System.out.print("총 스택 저장 공간의 크기 입력 >>");
      int cnt = sc.nextInt();
      StringStackAnswer st = new StringStackAnswer(cnt);
      while (true) {
         System.out.print("문자열 입력 >>");
         String word = sc.next();
         if (word.equals("그만")) {
            st.count--;
            break;
         }
         if(st.push(word)) {
            continue;
         }else {
            System.out.println("스택이 꽉 차서 푸시 불가!");
         }
      }
      
      for(int i=0;i<st.capacity();i++) {
         System.out.println(st.pop());
      }
      sc.close();
   }

}