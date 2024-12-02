public class TotalZ{
    public static int TotalZ(ArrayList<String> name){
        int TotalNameLength = 0;
        for(int i = 0; i < name.size(); i++)
        {
            if (name.get(i).substring(0, 1).equals("z")|| name.get(i).substring(0,1).equals("Z"))
            {
               TotalNameLength += name.get(i).size(); 
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
        ArrayList<String> names = new ArrayList<String>();
        names.add("Annie");
        names.add("Znfjen");
        names.add("zkdn");
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("kenkn");
        names2.add("nfjrng");
        names2.add("fnjaj");
        ArrayList<String> names3 = new ArrayList<String>();
        names3.add("zngn");
        names3.add("znfjrnj");
        names3.add("znjn");
        ArrayList<String> names4 = new ArrayList<String>();
        names4.add("Zjdn");
        names4.add("Znfn");
        names4.add("nfnmeol");
        
        testTotalZ(names, 10);
        testTotalZ(names2, 0);
        testTotalZ(names3, 15);
        testTotalZ(names4, 8);
    }
}