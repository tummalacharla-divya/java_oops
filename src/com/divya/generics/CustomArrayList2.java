package com.divya.generics;

import java.util.ArrayList;
import java.util.Arrays;
// it still allows only int type
public class CustomArrayList2<T> {
	
	private Object[] data;
	private static int DEFAULT_SIZE=10;
	private int size=0;
	
	public CustomArrayList2() {
		this.data=new Object[DEFAULT_SIZE];
	}
	
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++]=num;
	}
	
	private void resize() {
		Object[] temp=new Object[data.length*2];
		for (int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
		
	}

	private boolean isFull() {
		return size==data.length;
	}
	
	public T remove() {
		T removed=(T)(data[--size]);
		return removed;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set(int index,int value) {
		data[index]=value;
	}

	public String toString() {
		return "CustomArrayList{"+"data="+Arrays.toString(data)+",size "+size+'}';
	}
	
	public static void main(String[] args) {
		//ArrayList list=new ArrayList();
//		list.add(56);
//		list.remove(0);
//		list.get(34);
//		list.set(1, 457);
//		list.size();
//		list.isEmpty();
//		CustomArrayList2 list=new CustomArrayList2();
//		list.add(8);
//		list.add(9);
//		list.add(4);
//		System.out.println(list);
		CustomArrayList2<Integer> list=new CustomArrayList2<>();
		//list.add("ghj");
		
	}
}
