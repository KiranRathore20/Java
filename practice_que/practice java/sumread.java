class sumread
{
public static void main(String args[])
{
int i;
int sum=0;
do 
{
i = Integer.parseInt(JOptionPane.showInputDialog("Input an integer (0 to terminate)"));
sum = sum + i;
}
while (i !=0);
System.out.println("sum = " +sum);
}
}