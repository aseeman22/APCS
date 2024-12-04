import java.util.*;

public class TotalZ{
    public static int TotalZ(ArrayList<String> name){
        int TotalNameLength = 0;
        for(int i = 0; i < name.size(); i++)
        {
            if (name.get(i).substring(0, 1).equals("z")|| name.get(i).substring(0,1).equals("Z"))
            {
               TotalNameLength += name.get(i).length(); 
            }
        }
        return TotalNameLength;
    }
 public static void testTotalZ(ArrayList<String> name, int expected)
    {
        int result = TotalZ(name);

        for (String PotentialZName : name)
            System.out.println(PotentialZName + " ");

        System.out.println(" expected: " + expected +
                           " result: " + result + " ");

        if (result == expected)
            System.out.println("Yippee!!!");
        else
            System.out.println("Ugh!!!");
    }

    public static void main(String[] args)
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Annie");
        name.add("Znfjen");
        name.add("zkdn");
        ArrayList<String> name2 = new ArrayList<String>();
        name2.add("kenkn");
        name2.add("nfjrng");
        name2.add("fnjaj");
        ArrayList<String> name3 = new ArrayList<String>();
        name3.add("zngn");
        name3.add("znfjrnj");
        name3.add("znjn");
        ArrayList<String> name4 = new ArrayList<String>();
        name4.add("Zjdn");
        name4.add("Znfn");
        name4.add("nfnmeol");
        
        testTotalZ(name, 10);
        testTotalZ(name2, 0);
        testTotalZ(name3, 15);
        testTotalZ(name4, 8);
    }
}