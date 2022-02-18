
public class Main
{
  public static void main (String[]args)
  {
    int x;
    char[] c = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };
    
    for (int i = 0; i <= c.length - 1; i++)
      {
          int z = 3;
	for (int j = 0; j <= c.length - 1; j++)
	  {
	    if (i + j < c.length - 1)
	      {
		System.out.print (" ");
	      }
	    else
	      {
		System.out.print (c[z]);
		 z++;
	      }
       
	    if (z == c.length)
	      {
		z = 0;
	      }
	  }
	System.out.println ();
      }
  }
}
