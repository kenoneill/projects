package ie.kenoneill.coops.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void emptyList_containsNothing(){
        MyLinkedList objUnderTest = new MyLinkedList();
        assertEquals(0, objUnderTest.size());
        assertEquals(true, objUnderTest.isEmpty());
    }
//
//    @Test
//    public void addElementToList_sizeAndEmptyAreCorrect_elementCanBeRetrieved(){
//        MyLinkedList<String> objUnderTest = new MyLinkedList<>();
//        objUnderTest.add("Test String");
//        assertEquals(1, objUnderTest.size());
//        assertEquals(false, objUnderTest.isEmpty());
//        assertEquals("Test String", objUnderTest.peek());
//    }
//
//    @Test
//    public void addElementToList_sizeAndEmptyAreCorrect_elementCanBeRemoved(){
//        MyLinkedList<String> objUnderTest = new MyLinkedList<>();
//        objUnderTest.add("Test String");
//        assertEquals(1, objUnderTest.size());
//        assertEquals(false, objUnderTest.isEmpty());
//        assertEquals("Test String", objUnderTest.remove());
//
//        assertEquals(0, objUnderTest.size());
//        assertEquals(true, objUnderTest.isEmpty());
//        assertEquals(null, objUnderTest.peek());
//    }
//
//
//
//    @Test
//    public void addMultipleElementSToList_sizeAndEmptyAreCorrect_elementCanBeRemoved(){
//        MyLinkedList<String> objUnderTest = new MyLinkedList<>();
//        objUnderTest.add("Test String 1");
//        objUnderTest.add("Test String 2");
//        assertEquals(2, objUnderTest.size());
//        assertEquals(false, objUnderTest.isEmpty());
//        assertEquals("Test String 1", objUnderTest.remove());
//
//        assertEquals(1, objUnderTest.size());
//        assertEquals(false, objUnderTest.isEmpty());
//
//    }
//
//
//
//    @Test
//    public void addElementsOtherThanStringToList_sizeAndEmptyAreCorrect_elementCanBeRemoved(){
//        MyLinkedList<Integer> objUnderTest = new MyLinkedList<>();
//        objUnderTest.add(1);
//        objUnderTest.add(2);
//        assertEquals(2, objUnderTest.size());
//        assertEquals(false, objUnderTest.isEmpty());
//        assertEquals(Integer.valueOf(1), objUnderTest.remove());
//
//        assertEquals(1, objUnderTest.size());
//        assertEquals(false, objUnderTest.isEmpty());
//    }


}
