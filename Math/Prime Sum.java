//Problem can be found : https://www.interviewbit.com/problems/prime-sum/
public class Solution {
    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int primes[]=new int [a+1];
for(int i=0;i<=a;i++)
primes[i]=1;
primes[0]=0;primes[1]=0;
for(int i=2;i<=Math.sqrt(a);i++)
{
for(int j=2;(j*i)<=a;j++)
primes[i*j]=0;
}
for(int i=0;i<=a;i++)
{
if(primes[i]!=0 && primes[a-i]!=0)
{
al.add(i);
al.add(a-i);
break;
}

}
return al;
    }
}
