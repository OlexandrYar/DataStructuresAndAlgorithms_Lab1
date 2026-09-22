public class Test {
    public static void displayList(ListArrayBased list){
        System.out.println("Contents of the list:");
        System.out.println("#============#");
        for (int i = 1; i<=list.size(); i++){
            System.out.printf("%d %2s\n",i,list.get(i));
        }
        System.out.println("#============#");
    }
    public static void main(String[] args){
        ListArrayBased testList = new ListArrayBased();
        //check if the list is empty
        System.out.println("Test 1");
        System.out.println("Is the list empty: " + testList.isEmpty());
        System.out.println("Size of the list: " + testList.size());
        displayList(testList);
        //adding and getting the item test
        testList.add(1, "Dog");
        testList.add(2, "Cat");
        testList.add(3, "Parrot");
        System.out.println("Test 2");
        displayList(testList);
        //double check
        System.out.println();
        System.out.println("Is the list empty: " + testList.isEmpty());
        System.out.println("Size of the list: " + testList.size());

        //Remove and removeAll methods test
        System.out.println("Test 3");
        testList.remove(2);
        displayList(testList);
        System.out.println("Size of the list: " + testList.size());
        System.out.println("List after removeAll method");
        testList.removeAll();
        System.out.println("Size of the list: " + testList.size());

        //Exception tests
        //testList.add(51,"Rabbit");
        //testList.remove(-12);

    }
}
