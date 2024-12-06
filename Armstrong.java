public class Armstrong
{
   public static void main(String[] args)
   {
    int num=153;
    int number1=num;
    int leng=0;

    while(number1 != 0)
    {
        leng=leng+1;
        number1=number1/10;
    }

    int number2=num;
    int armstrong = 0;
    while(number2!=0)
    {
        int multi=1;
        int rem=number2%10;
        for(int i=1; i<=leng; i++)
        {
            multi=multi*rem;
        }
        armstrong=armstrong+multi;
        number2=number2/10;
    }
    if(armstrong==num)
    {
        System.out.println("NUmber is armstrong.");
    }else{
        System.out.println("Number is not armstrong.");
    }
   } 
}
