package homework.answer;

import java.util.Scanner;

public class ExeStore {

	Scanner sc = new Scanner(System.in);
	boolean run = true; // 실행
	Goods[] gdsAry = null; // 상품의 객체 배열
	
	int menuNo;
	int mostExpencive = 0; // 상품 중 가장 비싼 값
	int allPrice = 0; // 값의 총합

	public ExeStore() {
		while (run) {
			showMenu();
			System.out.print( "select Menu : ");
			menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				goodsAdd();
				break;
			case 3:
				allGdsInfo();
				break;
			case 4:
				analysis();
				break;
			case 5:
				PrintAnalysis();
				break;
			case 6:
				run = false;
				break;
			default:
			}
		}

	}

	// 메뉴 호출
	public void showMenu() {
		System.out.println("==============================================================================");
		System.out.println("| 1. 상품등록갯수설정 | 2. 상품정보입력 | 3. 모든상품조회 | 4. 상품분석 | 5. 분석조회 | 6. 종료 |");
		System.out.println("==============================================================================");
	}

	// menu 1 : 상품 등록 갯수
	public void setSize() {
		System.out.print("등록하고자 하는 물품의 가지 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		gdsAry = new Goods[count];
	}

	// menu 2: 상품정보입력
	public void goodsAdd() {
		for (int i = 0; i < gdsAry.length; i++) {
			Goods goods = new Goods();
			System.out.print("상품 이름 > ");
			String pName = sc.nextLine();
			goods.setpName(pName);
			System.out.print("상품 수량 > ");
			int stocks = Integer.parseInt(sc.nextLine()); // nextInt
			goods.setStocks(stocks);
			System.out.print("상품 가격 > ");
			int price = Integer.parseInt(sc.nextLine()); // nextInt
			goods.setPrice(price);
			System.out.println((i + 1) +"/"+gdsAry.length+ "번째 상품 정보 입력 완료-");
			System.out.println();
			gdsAry[i] = goods; // 배열마다 객체가 들어감
		}
	}
	
	// menu 3: 모든 상품 조회
	public void allGdsInfo() {
		for (int i = 0; i < gdsAry.length; i++) {
			gdsAry[i].getInfo();
			System.out.println("\t---\t---\t---\t---");
		}
	}

	// menu 4 : 분석
	public void analysis() {
		// 분석1) 가장 비싼값
		for (int i = 0; i < gdsAry.length; i++) {
			if (mostExpencive < gdsAry[i].getPrice()) {
				mostExpencive = gdsAry[i].getPrice();
			}
		}

		// 분석2) 가장 비싼 가격 빼고 다른 상품들의 총 합산 값
		for (int i = 0; i < gdsAry.length; i++) {
			if (mostExpencive == gdsAry[i].getPrice()) {
				continue;
			} else {
				allPrice += (gdsAry[i].getPrice() * gdsAry[i].getStocks());
			}
		}
		System.out.println("가장 비싼 상품을 찾았고, 이 상품을 제외한 상품들의 총 가격이 계산되었습니다.");
	}
	
	// menu 5 : 분석값 출력
	public void PrintAnalysis() {
		for(int i = 0; i < gdsAry.length; i++) {
			if (mostExpencive == gdsAry[i].getPrice()) {
				System.out.println(gdsAry[i].getpName()+"이(가) 가장 비쌉니다");
			}
		}
		System.out.println("가장 비싼 상품을 제외한 상품들의 총 가격 : " + allPrice);
	}

}

/*
 * package com.home.java.hw221110;
 * 
 * import java.util.Scanner;
 * 
 * public class Store { public static void main(String[] args) { int
 * mostExpencive = 0; int allThing=0; int sumPrice=0;
 * 
 * 
 * Scanner sc = new Scanner(System.in); // 상품의 객체 배열 생성 // 선언만 하고, 필요한만큼만 선언하게끔
 * 지금은 빈공간으로 값을 줌 Goods[] gdsAry = null;
 * 
 * System.out.print("등록하고자 하는 물품의 가지 수 > "); int count =
 * Integer.parseInt(sc.nextLine()); gdsAry = new Goods[count];
 * 
 * for(int i=0; i<gdsAry.length;i++) { Goods goods = new Goods();
 * System.out.print("상품 이름 > "); String pName = sc.nextLine();
 * goods.setpName(pName); System.out.print("상품 수량 > "); int stocks =
 * Integer.parseInt(sc.nextLine()); //nextInt goods.setStocks(stocks);
 * System.out.print("상품 가격 > "); int price = Integer.parseInt(sc.nextLine());
 * //nextInt goods.setPrice(price); System.out.println((i+1)+"번째 상품 정보 입력 완료-");
 * System.out.println(); gdsAry[i] = goods; // 배열마다 객체가 들어감 }
 * 
 * // 상품 정보 for(int i=0; i<gdsAry.length;i++) { gdsAry[i].getInfo(); }
 * 
 * // 가장 비싼 값 찾기 for(int i=0;i<gdsAry.length;i++) { if(mostExpencive <
 * gdsAry[i].getPrice()) { mostExpencive = gdsAry[i].getPrice(); } }
 * 
 * // 분석1 for(int i=0;i<gdsAry.length;i++) { if(mostExpencive ==
 * gdsAry[i].getPrice()) { continue; } else { sumPrice+= gdsAry[i].getPrice();
 * allThing+=gdsAry[i].getStocks(); } }
 * System.out.println("가장 비싼값의 물품을 제외한 물품들의 총 갯수는 "+allThing+"개");
 * 
 * 
 * 
 * } }
 * 
 * 
 */
