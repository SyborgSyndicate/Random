import java.util.*;
import java.util.Random;
//yahahah hayuk pale pale pale

public class katasandi
{
    public static void main(String[] args)
    {
        int length = 10; 
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("(##) Random Pass with java");
        System.out.println("(##) Coded by H-Nut");
        System.out.println("(00) Password lu :");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();
        
        char[] kontl = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) 
        {
            kontl[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return kontl;
    }
}
