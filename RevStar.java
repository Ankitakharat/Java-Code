public class RevStar
{
public static void main(String[] args)
{
int i,j;
for(i=1;i<=4;i++) //rows
{
 for(j=4;j>=i;j--) //columns
 {
   System.out.print("*");
 }
   System.out.println();
}
}
}