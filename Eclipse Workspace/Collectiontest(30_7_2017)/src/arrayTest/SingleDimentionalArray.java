package arrayTest;

public class SingleDimentionalArray 
{
public static void main(String[] args) {
	int[] a = new int[5];
	//a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
// for (int i=0;i<a.length;i++)  // print in normal order
	for (int i=a.length-1;i>=0;i--) // print in reverse order
{
	System.out.println(a[i]);
}
//System.out.println(a[0]);
}
}

/* disadvantages are
 memory size is fixed
 memory wastage is huge
 data type restriction issue
 To overcome we use Collections
 
 
 */

