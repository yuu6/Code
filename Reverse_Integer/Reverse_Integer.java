package Reverse_Integer;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Integer {
	
	public static void  main(String[] args) {
		System.out.println(reverse_Int(123));
	}
	static int reverse_Int(int x) {
		//最小数的情况
		if(x == Integer.MIN_VALUE)
			return 0;
		
		int outInt =0 ,length = 0 , temp = 0 ,theHead =0 ,my_max= 0;
		Queue<Integer> q = 	new LinkedList<Integer>();
		//将这个数的每一位存储在队列中
		int otherX =Math.abs(x);
		for(length = 0; otherX >0;length++) {
			q.add(otherX%10);
			otherX/=10;
		}
		
		my_max = Integer.MAX_VALUE;
		for(int i = length; i > 0 ; i--) {
			my_max=my_max - theHead;
			theHead = q.poll();
			temp = i -1;
			for(;temp > 0;temp--) {
				if(theHead > my_max/10)//判断，为了使它不溢出
					return 0;
				theHead *=10;
			}
			outInt = outInt + theHead;	

		}
		return x>0?outInt:-1*outInt;
	}
	
}

