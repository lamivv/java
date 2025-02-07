package com.yedam.collections;
// 제너레이트
class Box<E> {
	E item;

	void setItem(E item) {
		this.item = item;
	}

	E getItem() {
		return item;
	}
}

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
//		Box<Integer> box = new Box<Integer>();
		box.setItem("오렌지");
//		box.setItem(100);

		String result = box.getItem();
//		Integer result = box.getItem();
		System.out.println(result);
	}
}
