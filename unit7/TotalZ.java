public class TotalZ{
    public static String TotalZ(String[] name){
        int TotalNameLength = 0;
        for(int i = 0; i < name.length; i++)
        {
            if (name[0].equals("z")|| name[0].equals("Z"))
            {
               TotalNameLength = name[0+1]; 
            }
            else
            {
                TotalNameLength = 0;
            }
        }
        return TotalNameLength;
    }

}