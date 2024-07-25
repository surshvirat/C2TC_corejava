package com.dns.dayfour;

public class Demo {
	Demo(){
		System.out.println("Default consructor");
		
	}
Demo(int a){
	System.out.println("A:"+a);

}
Demo(int a,int b){
	System.out.println("A:"+a+"B:"+b);
}
Demo(int a,String b){
	
	System.out.println("A:"+a+"B:"+b);
}
Demo(String a,int b){
	System.out.println("A:"+a+"B:"+b);
}
}

