package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
       Scanner sc = new Scanner(System.in);
       
       ArrayList<Goods> gList = new ArrayList<Goods>();
       
       System.out.println("상품을 입력해주세요(종료 q)");
       
       while(sc.hasNext()) {
    	   String str = sc.nextLine();
    	   
    	   if(str.equals("q")) {
    		   break;
    	   }
    	   
    	   String[] arr = str.split(",");
    	   
    	   String name = arr[0];
    	   int price = Integer.parseInt(arr[1]);
    	   int count = Integer.parseInt(arr[2]);
    	   
    	   gList.add( new Goods(name, price, count) );
       }
       
       System.out.println("[ 입력 완료 ]");
       
       int sum = 0;
       
       for(Goods g : gList) {
    	   System.out.println(g.toString());
    	   sum += g.getCount();
       }
       
       System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
       
       sc.close();
    }

}
