package SelfPract;

import PractSelf.T1;

public class Q1 extends P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(q);
		
		P1 ab = new P1();
		int abc = ab.a(2);
		
		System.out.println(abc);
		
		System.out.println(ab.a(2));
		
		S1 sq = new S1();
		
		int abcd =sq.R(2);

	
		System.out.println(abcd);
	

		
		
		
		R1 r = new R1();
		r.R(2);
		System.out.println(r.q + "*******");
		
		r.RS();
		
		System.out.println(r.q);
		
		System.out.println(S1.q);
		
		T1 t = new T1();
		t.R(5);
}
	
	
	public void q(int d) {
		System.out.println( d);
		
		
	}
}