class stringImp{
    public static void main(String[] args){
        String name = "Vedant";
        String name2 = new String("Vedant");
        String name3 = "Vedu";

        StringBuilder name4 = new StringBuilder();

        StringBuffer name5 = new StringBuffer();

        // == , .equals();
        System.out.println(name.equals(name2));
        System.out.print(name == name2);
    }
}