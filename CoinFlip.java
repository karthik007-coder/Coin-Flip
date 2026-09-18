import java.util.Random;
public class CoinFlip
{
    public static void main(String[] args)
    {
        Random ran= new Random();
        boolean ishead;
        ishead=ran.nextBoolean();
        if(ishead)
        {
        System.out.printf("Heads");
        }
        else
        {
            System.out.printf("Tails");
        }
    }
}