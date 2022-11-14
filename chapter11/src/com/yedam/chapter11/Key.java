package com.yedam.chapter11;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number = number;
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		//System.out.println("");
		return "Key 값은 : " + number;
	}
	
	
}
