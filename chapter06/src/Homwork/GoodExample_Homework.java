package Homwork;

import java.util.Scanner;

public class GoodExample_Homework {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 입력할 상품 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Goods[] gAry = new Goods[count];
		
		for(int i=0; i<gAry.length; i++) {
			Goods gd = new Goods();
			
			System.out.println("상품명 입력 : > ");
			String gdName = sc.nextLine();
			gd.setGdName(gdName);
			
			System.out.println("가격 입력 : > ");
			int gdPrice = Integer.parseInt(sc.nextLine());
			gd.setGdPrice(gdPrice);
			
			gAry[i] = gd;
		}
		
		for(int i=0; i<gAry.length; i++) {
			gAry[i].getInfo();
		}
	
		int sum = 0;
		for(int i=0; i<gAry.length; i++) {
			;
		}
		
		
	}
}
