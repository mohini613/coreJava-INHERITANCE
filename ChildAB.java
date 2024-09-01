package com.inheritance;

public class ChildAB implements ImplementedA, ImplementedB  {
@override
public void m1()
{
	System.out.println("class m1()called");
}
public static void main(String[] args) {
	ChildAB c=new ChildAB();
	c.m1();
}
}