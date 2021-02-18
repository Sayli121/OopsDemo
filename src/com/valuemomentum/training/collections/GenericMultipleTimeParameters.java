package com.valuemomentum.training.collections;
class Employee10
{
	private String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
interface pair<k,v>
{
	public k getKey();
	public v getValues();
}

class OrderedPair<k,v> implements pair<k,v>{
	private k key;
	private v value;
	

	public OrderedPair(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public k getKey() {

		return key;
	}

	@Override
	public v getValues() {
		
		return value;
	}
	
}
public class GenericMultipleTimeParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedPair<Integer,String> op1=new OrderedPair<Integer,String>(101,"java");
		System.out.println(op1.getKey()+":"+op1.getValues());

		OrderedPair<String,String> op2=new OrderedPair<String,String>("database","My SQL");
		System.out.println(op2.getKey()+":"+op2.getValues());

		OrderedPair<Integer,Employee10> op3=new OrderedPair<Integer,Employee10>(10,new Employee10("joe"));
		System.out.println(op3.getKey()+":"+op3.getValues().getName());
		

	}

}
