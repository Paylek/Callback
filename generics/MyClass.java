package generics;

public class MyClass {
    public static <E> void  sid  (String s, E [] arr){

        E [] a = arr;
        AnyTapeArray <E> anyTapeArray = new AnyTapeArray <E> ();
        anyTapeArray.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< anyTapeArray.getLength(); i++)
            System.out.print(anyTapeArray.getArrIndex(i)+" ");

        System.out.println();
    }



    public static void main(String [] args){

        String [] strings = {"Hello", "World","!"};
        sid("String" , strings);

        Integer [] integers = { 1,2,3,4,5,6,7,8};
        sid("Integer" , integers);

        Double [] doubles = {2.7,6.1,3.1};
        sid("Double" , doubles);

    }
}
