public class stringfunction {
    public static boolean comparestring(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String stringcopy(String orignal) {
        return new String(orignal);
    }

    public static String concationsting(String str1, String str2) {
        return str1 + str2;
    }
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Are string is equal : "+comparestring(str1,str2));

        String orignal = "Cat";
        String cpoystring = stringcopy(orignal);
        System.out.println("Orignal string is :" + orignal);
        System.out.println("Copy String is :"+ cpoystring);

        System.out.println("String cancation : "+concationsting(str1,str2));
    }
}





