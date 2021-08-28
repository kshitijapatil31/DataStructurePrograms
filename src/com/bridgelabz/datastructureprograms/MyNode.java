package com.bridgelabz.datastructureprograms;

public class MyNode<T> {


	String data;
	  String key;
	 MyNode next;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public MyNode getNext() {
		return next;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}

	  
	@Override
	public String toString() {
		return "MyNode [data=" + data + ", key=" + key + ", next=" + next + "]";
	}
	

}
