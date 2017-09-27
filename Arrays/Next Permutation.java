//problem can be found: https://www.interviewbit.com/problems/next-permutation/
public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    int temp,ctr=0,ch=0;
	    int i=a.size()-1,j=0;
		while(ctr==0 && i>0){
			for( j=i-1;j>=0;j--)
			{
				//System.out.println("io"+a.get(i)+"jo"+a.get(j));
				if(a.get(i)>a.get(j))
			{ 	//System.out.println("i"+a.get(i)+"j"+a.get(j));
					temp=a.get(j);
					a.set(j,a.get(i));
					a.set(i, temp);
					ctr=1;
					ch=j;
				//	System.out.println("i"+a.get(i)+"j"+a.get(j));
					break;				
					
				//swap and break
			}				
			}i--;
			}
		//System.out.println(i);
		if(ctr!=0)
		Collections.sort(a.subList(ch+1, a.size()));
		else Collections.sort(a);
	}
}
