public class Test {
    public static void main(String[] args){
        ListArrayBased testList = new ListArrayBased();
        //check if the list is empty
        System.out.println("Is the list empty: " + testList.isEmpty());
        System.out.println("Size of the list: " + testList.size());
        //adding and getting the item test
        testList.add(1, "Dog");
        testList.add(2, "Cat");
        testList.add(3, "Parrot");
        System.out.println("Item at index 1 is: " + testList.get(1));
        System.out.println("Item at index 2 is: " + testList.get(2));
        System.out.println("Item at index 3 is: " + testList.get(3));
        //double check
        System.out.println();
        System.out.println("Is the list empty: " + testList.isEmpty());
        System.out.println("Size of the list: " + testList.size());
        //Remove and removeAll methods test
        System.out.println();
        testList.remove(2);
        System.out.println(testList.get(2));//now is parrot as the list has shifted
        System.out.println("Size of the list: " + testList.size());
        testList.removeAll();
        System.out.println();
        System.out.println("Size of the list: " + testList.size());
    }
}
