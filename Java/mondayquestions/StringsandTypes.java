public class StringsandTypes {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vedant");
        System.out.println(sb);
        // Append for stringBuilder
        sb.append("1234");
        System.out.println("after Apped "+sb);

        StringBuffer sb2 = new StringBuffer("Vedant");
        // Append for StringBuffer
        sb2.append(" Nighot");
        System.out.println(sb2);

        String name = "Vedant";
        int count = name.length();
        System.out.println(count);

        //charAt indexing
        System.out.println(name.charAt(5));

        // Substring
        System.out.println(name.substring(0,3));

        // equals
        System.out.println(name.equals("Vedant"));
        System.out.println(name.equalsIgnoreCase("vedant"));
        
        //concat
        //replace
        //compare to 
        //toLowerCase() , //toUpperCase();
        //Trim remove leadidng and trailing spaces
        String nam2 = "    Vedant     ";
        System.out.println(nam2.trim());

        //split()
        String name3 = "vedant , Kumud , paras , Pranshu";


        String[] result = name3.split(" , ");
        System.out.println(result);

        for(String n:result){
            System.out.println(n);
        }
        //replace();
        //reverse();
        //setCharAt();
        //toString(); to convert StringBuffer to StringBuilder in String;
        //capacity

        StringBuilder name23 = new StringBuilder("Vedantnighot");

        name23.insert(1, "E");
        System.out.println(name23);



    }
}
