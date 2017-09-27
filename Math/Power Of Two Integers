//problem can be found here:https://www.interviewbit.com/problems/power-of-two-integers/
public class Solution {
    public boolean isPower(int a) {
        boolean ans=false;
        int temp;
        if (a<=1) return true;
for(int i=(int)Math.sqrt(a);i>=2;i--)
{ temp=a;
if(temp%i==0)
{ 
while(temp%i==0)
{if(temp/i==1)
{ans=true;
break;}
temp/=i;
}

}
}
return ans;
    }
}
