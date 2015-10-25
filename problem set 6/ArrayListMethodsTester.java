// DON'T CHANGE THIS FILE
// Changes in this file will be ignored when you run your
// program. 
// This is here to help you understand the output when 
// you click testRun. 

import java.util.ArrayList;
public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        //set up
        ArrayList<String> animals = new ArrayList<String>();
        ArrayListMethods zoo = new ArrayListMethods(animals); 
        zoo.list.add("ape");
        zoo.list.add("dog");
        soo.list.add("zebra");
        
        //test isSorted
        System.out.println(zoo.isSorted());
        System.out.println("Expected: true");
        
        zoo.list.add("cat");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
        
        zoo.list.remove("cat");
        zoo.list.add(0,"cat");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
        
        
        
        zoo.list.add(3,"horse");
        
        //test replaceWithLargerNeighbor
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("Expected: [cat, dog, horse, zebra, zebra]");
        
        zoo.list.add(0,"cat");
        
        //test count duplicates;
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 2");
        zoo.list.add(4,"dog");
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 3");
        
        
        //start with fresh array list
        animals = new ArrayList<String>();
        zoo = new ArrayListMethods(animals); 
        
        //does empty array list work?
         System.out.println(zoo.isSorted());
         System.out.println("Expected: true");
         zoo.replaceWithLargerNeighbor();
         System.out.println(zoo.toString());
         System.out.println("Expected: []");
         System.out.println(zoo.countDuplicates());
         System.out.println("Expected: 0");
        
        //test xyzToFront
        zoo.list.add("ape");
        zoo.list.add("dog");
        zoo.list.add("xantus");
        zoo.list.add("zebra");
        zoo.list.add("cat");
        zoo.list.add("yak");
        
        zoo.xyzToFront();
        System.out.println(zoo.toString());
        System.out.println("Expected: [xantus, zebra, yak, ape, dog, cat]");
        

    }
}

