public class StringDemo{
    public static void main(String[] args){

        String str ="Hello java";

        System.out.println("Original String:"+str);
        System.out.println("Length:"+str.length());
        System.out.println("Character at index 1:" + str.charAt(1));
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Substring:"+str.substring(6));
        System.out.println("Index of 'java':"+str.indexOf("java"));
        System.out.println("Contains 'Hello':"+str.contains("Hello"));
        System.out.println("Replace:"+str.replace("java","World"));
        System.out.println("Equals 'Hello Java':"+str.equals("Hello Java"));

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("\nStringBuilder");

        sb.append("Java");
        System.out.println("After append:"+sb);

        sb.insert(5,"Java");
        System.out.println("After insert:"+sb);

        sb.replace(6,11,"Student");
        System.out.println("After replace:"+sb);

        sb.delete(5,13);
        System.out.println("After delete:"+sb);

        sb.reverse();
        System.out.println("After reverse:"+sb);


        StringBuffer buffer = new StringBuffer("Hello");
        
        System.out.println("\nStringBuffer:");

        buffer.append("Java");
        System.out.println("After append:"+buffer);
        
        buffer.insert(5,"World");
        System.out.println("After insert:"+buffer);

        buffer.replace(6,11,"Student");
        System.out.println("After replace:"+buffer);

        buffer.delete(5,13);
        System.out.println("After delete:"+buffer);

        buffer.reverse();
        System.out.println("After reverse:"+buffer);
        
        
        
        



        
    

   
    }
}