package DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicGenericArray<String> myStore = new DynamicGenericArray<String>(1);
        myStore.insertData("test");
        myStore.insertData("car");
        myStore.insertData("cat");
        myStore.insertData("house");

        System.out.println(myStore.getData(3));
        System.out.println(myStore.getData(0));
        System.out.println(myStore.getData(2));
    }
}
