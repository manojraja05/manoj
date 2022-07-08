package com.pojo_class;

public class Pojo_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pojo_A p = new Pojo_A();
int a1 = p.getA();
System.out.println("Get A:"+a1);
p.setA(12);

int a2 = p.getA();

System.out.println("After Set:" +a2);
	}

}
