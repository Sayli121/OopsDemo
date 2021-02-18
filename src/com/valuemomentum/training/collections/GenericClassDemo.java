package com.valuemomentum.training.collections;
class Sample<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample <Integer> s1=new Sample<Integer>();
s1.setData(15);
System.out.println("Display generic class of type Integer "+s1.getData());

Sample <String> s2=new Sample<String>();
s2.setData("java generics");
System.out.println("Display from generic class of type String "+s2.getData());

Sample <Float> s3=new Sample<Float>();
s3.setData(10.9f);
System.out.println("Display from generic class of type float "+s3.getData());







	}

}
