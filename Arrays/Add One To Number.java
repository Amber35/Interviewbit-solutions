//Problem can be found -https://www.interviewbit.com/problems/add-one-to-number/
public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int lsb,msb,j=1,ctr=0;
	    ArrayList<Integer> ab=new ArrayList<Integer>();
	    for(int i=a.size()-1;i>=0;i--)
	    { 
	        lsb=a.get(i);
	       if(lsb+1==10 && i!=0)
	         {a.set(i,0);
	         
	           //System.out.println("if");  
	         }
	         else if(lsb+1==10 && i==0)
	         { ctr=1;
	         ab.add(0,1);
	         a.set(i,0);
	         
	           //System.out.println("elseif");  
	             for(int p=0;p<a.size();p++)
	            { ab.add(a.get(p)); 
	            }
	         }
	         else
	         {
	         a.set(i,a.get(i)+1);
	         //System.out.println("break");
	         break;
	         }
	        }
	        msb=a.get(0);
	        
	        while(a.size()>1)
	        { int r;
	            if(msb==0)
	            {
	                msb=a.get(1);
	                r=a.remove(0);
	                
	           //System.out.println("r" + q);  
	                
	            }
	            else break;
	        }
	        if(ctr==0)
	        return a;
	        else return ab;
	    }
	   	    
	}
