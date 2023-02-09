package in.coding.LifeChanging;
import java.util.*;
public class L1_recursion_printallsubsequences {
	
	// top to bottom recursion why? because we are making the result from top to bottom     or return type recursion
	public static ArrayList<String> getSubseq(String s)
	{
	     if(s=="")
	     {
	    	 ArrayList<String> temp=new ArrayList<String>();
	    	 temp.add("");
	    	 return temp;
	     }
	     
	     ArrayList<String> smalloutput=getSubseq(s.substring(1));
	     ArrayList<String> bigoutput=new ArrayList<String>(smalloutput);     // adding small output  "",b,c,bc
	     
	     for(String str:smalloutput)                                         // "",b,c,bc,a,ab,ac,abc okk
	     {
	    	 bigoutput.add(s.charAt(0)+str);
	     }
	     
	     return bigoutput;                                                   // returning all subsequences
	}
	
  // bottom to top  basically pre area of recursion calls  during recursion calls make ans okk means bottom to top   or void type recursion
	// i m putting return type int to calculate the subsequences okk 
	
	
   	
 public static int printsubSeq(String s,int idx, String asf)
 {
	   if(idx==s.length())
	   {
		   System.out.print(asf+" ");
		   return 1;
	   }
	 
	int totalSubseq=0;   
	totalSubseq+=printsubSeq(s,idx+1,asf);
    totalSubseq+=printsubSeq(s,idx+1,asf+s.charAt(idx));
    return totalSubseq;
 }
	
	
	public static void main(String[] args)
	{
		
		String s="abc";
		ArrayList<String> ans=getSubseq(s);
		System.out.println(ans);
		int totalSubseq=printsubSeq(s,0,"");
		System.out.println(totalSubseq);
		
	}

}
