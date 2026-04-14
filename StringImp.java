public class StringImp {
    public static void main(String[] args) {
       String name = "Pranshu, Paras, vedant, saurabh, laxmi, runali, sanjana";
        String name2 = "Paras";
        char[] arr = name2.toCharArray();
       //length of string
       System.out.println("Length of the string " + name.length());

       //charAt
       System.out.println(name.charAt(5));

       //subString
       System.out.println(name.substring(1, 4));

       //equals
       System.out.println(name.equals("Pranshu"));

       //equalsIgnoreCase
       System.out.println(name.equalsIgnoreCase("pranshu"));

       //concat
       //replace
       System.out.println(name.replace('h', 'H'));

       //compare
       System.out.println("A".compareTo("C"));

       //toUpperCase() / toLowerCase()
       //trim() : remove leading and trailing spaces
       String ans = name.trim();
       System.out.println(ans);

       //split
       String[] result = name.split(", ");

       for(int i = 0;i<result.length;i++){
        System.out.println(result[i]);
       }

       System.out.println(name.lastIndexOf('a'));
       System.out.println(name.contains("ran"));




       StringBuilder sb1 = new StringBuilder("Paras");
       StringBuffer sb2 = new StringBuffer("Vedant");


       System.out.println("StringBuilder initially: " + sb1);

       //append
       sb2.append("123");
       System.out.println( "StringBuffer after append: " + sb2);

       sb1.insert(3, 'a');
       System.out.println(sb1);

       sb1.delete(3,5);
       System.out.println(sb1);

       //replace
       //reverse
       System.out.println(sb1.reverse());

       //setCharAt()

       System.out.println(sb1.toString());

       System.out.println(sb1.capacity());


       StringBuilder sb3 = new StringBuilder("aaaaa");
       System.out.println(sb3.capacity());

    }
}
