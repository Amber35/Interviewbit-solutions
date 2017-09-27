//problem can be found :https://www.interviewbit.com/problems/rotate-matrix/
public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
		//int tlimit1=(int) Math.floor(c/2);
		//int tlimit2=(int) Math.ceil(c/2);
		//reverse the column 
		int temp;
		for(int i=0;i<a.size();i++)
		{
		for(int j=0;j<((a.get(i).size())/2);j++)
		{
			//System.out.println(" j " +j + " i "+i);
			temp=a.get(j).get(i);
			a.get(j).set(i,(a.get(a.size()-j-1).get(i)));
			a.get(a.size()-j-1).set(i,temp);
		
			
		}
		}
		//transpose
		for(int i=0;i<a.size();i++)
		{
		for(int j=0;j<a.get(i).size();j++)
		{if(i>j)
			{//System.out.println(" j " +j + " i "+i);
			temp=a.get(i).get(j);
			a.get(i).set(j,a.get(j).get(i));
			a.get(j).set(i,temp);
			}
			
		}
		}
/*		for(int i=0;i<c;i++)
			{for(int j=0;j<r;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
	}*/
}
}
