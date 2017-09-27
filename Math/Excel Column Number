Problem can be found:https://www.interviewbit.com/problems/excel-column-number/
public class Solution {
	public int titleToNumber(String a) {
	    int ans=0,mul=1;
	     ans+=(int)a.charAt(a.length()-1)-64;
	     //System.out.println(a.charAt(0));
	     //System.out.println(ans);
	    for(int i=a.length()-2;i>=0;i--)
        { 
        ans+=((int)a.charAt(i)-64)*(int)Math.pow(26,mul);
        //System.out.println(((int)a.charAt(i)-64)*Math.pow(26,mul));
        mul++;
        }
        return ans;
	}
}
