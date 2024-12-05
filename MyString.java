public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newstr="";
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)==' ')
        newstr= newstr+(str.charAt(i));
        else if(str.charAt(i)>=65&&str.charAt(i)<=90){
            newstr = newstr + (char)(str.charAt(i)+32);
        }
        else if(str.charAt(i)>=97&&str.charAt(i)<=122)
        newstr = newstr + (char)(str.charAt(i));
        else 
        newstr= newstr +(str.charAt(i));
       }
       return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        boolean equal=false;
        if(str1.length()<str2.length())
        return false;
        if (str2=="")
        return true;
        //while(str1!=""||str2!=""){
        for(int i =0;i<str2.length();i++)
        {
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(j)==str2.charAt(i))
                {
                    equal=true;
                    if(str2.length()<j)
                    return true;
                    if(str1.charAt(j+1)!=str2.charAt(i+1))
                    {
                        equal=false;
                        break;
                    }
                //else return true;
                }
            }  
        }
        return equal;
    }
  //  return false; 
    }

