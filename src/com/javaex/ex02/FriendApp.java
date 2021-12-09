package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해주세요.");
    	
    	while(sc.hasNextLine()) {
    		String str = sc.nextLine();
    		String[] arr = str.split(" ");
    		
    		fList.add(new Friend(arr[0], arr[1], arr[2]));
    		
    	}
    	
    	for(Friend f : fList) {
    		System.out.println(f.toString());
    	}
    	
    	sc.close();
    	
    	
    }

}
