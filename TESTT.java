package com.inheritance;


public class TESTT {
	public static void main(String[] args ) {
		System.out.println("A");
		A a=new A();
		a.m1();//from class A
		a.m2();//from class A
		a.m3();//from class A
		System.out.println(a.x);
		System.out.println(a.y);
		 System.out.println();
		 System.out.println("B");
		B b=new B();
		b.m1(); //from class B
		b.m2(); //from class B(m2 method overriden in class B too)
		b.m3(); //from class A(m2 method overriden in class B too)
		b.m4(); //from class B(m2 method overriden in class B too)
		System.out.println(b.x);//B object
		System.out.println(b.y);//B object
		 System.out.println();
		 System.out.println("C");
		C c=new C();
		c.m1();//from class C
		c.m2();//from class A(m2 method overriden in class A too)
		c.m3();//from class C
		c.m4();//from class C
		System.out.println(c.x);//class C object
		System.out.println(c.y);//class C object
		System.out.println(c.z);//class C object
		 System.out.println();
		 System.out.println("D");
		D d=new D();
		d.m1();//from class A(m1 method overriden in class A too)
		d.m2();//from class D
		d.m3();//from class B
		d.m4();//from class D
		d.m5();//from class D
		d.m6();//from class D
		System.out.println(d.x);//class D object
		System.out.println(d.y);//class D object
		System.out.println(d.z);//class D object
		 System.out.println();
		 System.out.println("E");
		E e=new E();
		e.m1();//from class E
		e.m2();// from class D
		e.m3();//from class E
		e.m4();// from class D
		e.m5();// from class E
		e.m6();//from class D 
		e.m7();//from class E
		System.out.println(e.x);//D object
		System.out.println(e.p);//E object
		System.out.println(e.y);//E object
		System.out.println(e.z);//E object
		 System.out.println();
		 System.out.println("F");
		F f=new F();
		f.m1();// from class E
		f.m2();//from class F
		f.m3();//from  class E
		f.m4();//from class F 
		f.m5();//from class E
	    f.m6();//from class D
	    f.m7();//from class F
	    f.m8();//from class F
	    System.out.println(f.x);//object D
	    System.out.println(f.p);//object E
	    System.out.println(f.q);// object F
	    System.out.println(f.y);//object F
	    System.out.println(f.z);// object F
	    System.out.println();
	    System.out.println("parent refrence child object");
	    System.out.println();
	    System.out.println("A of B");
	    A a1=new B();
	    a1.m1();//CLASS A
	    a1.m2();//CLASS B(method m2 is overridden class B hence class will get called)
	    a1.m3();//CLASS B(method m2 is overridden class B hence class will get called)
	    System.out.println(a1.x);//OBJECT A
	    System.out.println(a1.y);//OBJECT A
	    System.out.println();
	    System.out.println("A of C");
	    A a2=new C();
	    a2.m1();//CLASS C
	    a2.m2();//CLASS A
	    a2.m3();//CLASS C
	    System.out.println(a2.x);//OBJECT A
	    System.out.println(a2.y);//OBJECT A
	    System.out.println();
	    System.out.println("A of D");
	    A a3=new D();
	    a3.m1();
	    a3.m2();//Method m2 is overridden in class D
	    a3.m3();//Method m3 is overridden in class B
	    System.out.println(a3.x);//object A
	    System.out.println(a3.y);//object A
	    System.out.println();
	    System.out.println("A of E");
	    A a4=new E();
	    a4.m1();//overridden in class E
	    a4.m2();//overridden in class D
	    a4.m3();//overridden in class E
	    System.out.println(a4.x);//object A
	    System.out.println(a4.y);//object A
	    System.out.println();
	    System.out.println("A of F");
	    A a5=new F();
	    a5.m1();//overridden in class F
	    a5.m2();//overrieddn in class F
	    a5.m3();//OVERRIDEN IN CLASS E
	    System.out.println(a5.x);//object of class A
	    System.out.println(a5.y);//object of class A
	    System.out.println();
	    System.out.println("B of D");
	    B b1=new D();
	    b1.m1();//class A method
	    b1.m2();// overridden in class D
	    b1.m3();// overridden in class B
	    b1.m4();//overridden in class D
	   System.out.println(b1.x);//object of class B
	   System.out.println(b1.y);//object of class B
	   System.out.println();
	   System.out.println("B of E");
	   B b2=new E();
	   b2.m1();//overridden in class E
	   b2.m2();//overridden in class D
	   b2.m3();//overridden in class E
	   b2.m4();//overridden in class D
	   System.out.println(b2.x);//object of class B
	   System.out.println(b2.y);//object of class B
	   System.out.println();
	   System.out.println("B of F");
	   B b3=new F();
	   b3.m1();//overridden in class E
	   b3.m2();//overridden in class F
	   b3.m3();//overridden in class E
	   b3.m4();//overridden in class F
	   System.out.println(b3.x);//object of class B
	   System.out.println(b3.y);//object of class B
	   System.out.println();
	   System.out.println("there is no derived class for C "
	   	+ "hence it will not create any object and properties");
	  System.out.println();  
	  System.out.println("D of E");
	D d1=new E();
	d1.m1();//overridden in class E
	d1.m2();//overridden in class D
	d1.m3();//overridden in class E
	d1.m4();//overridden in class D
	d1.m5();//overridden in class E
	d1.m6();//overridden in class D
	System.out.println(d1.x);//object of class D
	System.out.println(d1.y);//object of class D
	System.out.println(d1.z);//object of class D
	System.out.println();
	  System.out.println("D of F");
	D d2=new F();
	d2.m1();//overridden in class E
	d2.m2();//overridden in class F
	d2.m3();//overridden in class E
	d2.m4();//overridden in class F
	d2.m5();//overridden in class E
	d2.m6();//overridden in class D
	System.out.println(d2.x);//object of class D
	System.out.println(d2.y);//object of class D
	System.out.println(d2.z);//object of class D
	System.out.println();
	 System.out.println("there is no derived class for E and F "
			   	+ "hence it will not create any object and properties");
	
	}
}
		