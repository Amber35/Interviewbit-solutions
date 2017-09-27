//problem can be found :https://www.interviewbit.com/problems/fizzbuzz/
public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
         ArrayList<String> ar = new ArrayList<String>();

        for (int i = 1;i <= A; i++){
            String val = "";

            if (i %3== 0)
                val+= "Fizz";

            if (i%5 == 0)
                val += "Buzz";

            if (i%3!=0 && i%5!=0)
                val = new Integer(i).toString();

            ar.add(val);
        }
        return ar;
    }
}