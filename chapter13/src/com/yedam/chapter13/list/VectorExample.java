package com.yedam.chapter13.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));	
		Board board = new Board("제목2", "내용2", "글쓴이2");		//위에꺼랑 같은거임
		
		list.add(board);
		
		list.add(new Board("제목3", "내용3", "글쓴이3"));	
		list.add(new Board("제목4", "내용4", "글쓴이4"));	
		list.add(new Board("제목5", "내용5", "글쓴이5"));	
		
		list.remove(2);
		list.remove(3);
		
		for(Board temp : list) {	//향상된 for문
			System.out.println(temp.subject + temp.content + temp.writer);
		}
		
		System.out.println("-------------------");
		
		for(int i=0; i<list.size(); i++) {	//위에껄 풀어서 쓴거(같은거임)
			Board board2 = list.get(i);
			System.out.println(board2.subject + board2.content + board2.writer);
		}
		
		
		
		
	}
}
