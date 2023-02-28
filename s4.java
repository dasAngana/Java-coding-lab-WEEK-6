public class s4 {

    static void Reverse(String s){

        if(s==null||s.length()<=1)
        {
            System.out.println(s);
        }
        else{
            System.out.println(s.charAt(s.length()-1));
            Reverse(s.substring(0,s.length()-1));
        }
    }

    public static void main(String[] args)
    {
        String str = "awe program";
    
        Reverse(str);
    } 
    
}
