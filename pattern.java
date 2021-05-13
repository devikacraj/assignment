public class Pattern
{

public static void main(String[] args) 
{
	    int i,j,k,row=6;

	    for (i = 1; i <= rows;i++)
          {
	      for (k=i;k<row;k++)
             {
	        System.out.print("  ");
	     }
             for(j=1;j<=(2*i-1);j++)
            {
	      System.out.println();
	    }
	  }
}
}