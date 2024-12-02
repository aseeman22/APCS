public class TotalZ{
    public static int TotalZ(ArrayList<String> name){
        int TotalNameLength = 0;
        for(int i = 0; i < name.length; i++)
        {
            if (name[i].substring(0, 1).equals("z")|| name[i].substring(0,1).equals("Z"))
            {
               TotalNameLength += name[i].length(); 
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

    public static void main(ArrayList<String> args)
    {
        String[] names = {"Annie", "Znfjen", "zkdn"};
        String[] names2 = {"kenkn","nfjrng","fnjaj"};
        String[] names3 = {"zngn", "znfjrnj", "znjn"};
        String[] names4 = {"Zjdn", "Znfn", "nfnmeol"};
        
        testTotalZ(names, 10);
        testTotalZ(names2, 0);
        testTotalZ(names3, 15);
        testTotalZ(names4, 8);
    }
}