package palindrome;
//判断一个数是不是回文，不能使用额外的空间
//@于洪潮
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome(3424243));
	}

	public static boolean isPalindrome(int x) {
		if(x <0)
			return false;
		double anX = 0,temp = x;
		while(x >0) {
			anX = anX *10 + x%10;
			x/=10;
		}

		if(anX == temp)
			return true;
		else
			return false;
        
    }
}
