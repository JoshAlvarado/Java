//Sorting Programming Project 
//Joshua Alvarado
import java.util.*;

abstract class Sorter{ 

   public Sorter(){ }

   protected int[] array;     
   public String toString(){ 
      if (array == null) return "(null)";
      String result = "";
      for (int i = 0; i < array.length; i++) result += array[i] + " ";
      return result;
   }

   public abstract void sort(); 
 
   public boolean isSorted(){ 
      if (array == null) return true;
      for (int i = 0; i < array.length - 1; i++){
         if (array[i] > array[i+1]) return false;
      }
      return true; 
   }

   public void fillRandom(int n, int range){ 
      Random r = new Random();
      array = new int[n];
      for (int i = 0; i < n; i++) 
         array[i] = r.nextInt(range);
   }

   public double timedSort(){
      double t1 = System.currentTimeMillis();
      sort();
      double t2 = System.currentTimeMillis();
      return t2 - t1;
   }

   public double[] timedSortSeries(int[] n, int[] range){
      double[] times = new double[n.length];
      for(int i = 0; i < n.length; i++){
         fillRandom(n[i], range[i]);
         times[i] = timedSort();
      }
      return times;
   }

   public String getTimeString(int[] nvalues, double[] times){
      String result = "";
      String newline = System.getProperty("line.separator");
      for(int i = 0; i < nvalues.length; i++){
         result += "\t" + nvalues[i] + ":\t" + times[i] + newline;
      }
      return result;
   }

   public void testSortOutput(){
      System.out.println("before Sorting: " + this);
      sort();
      System.out.println("after Sorting: " + this);
      System.out.println("sorted: " + isSorted());
   }
}
/////////////////////////// ALGORITHMS ///////////////////////////////
   // selection sort //
   class SelectionSorter extends Sorter{
      public void sort(){
         int i, j, minValue, minIndex, temp = 0;
         for(i = 0; i < array.length; i++){
            minValue = array[i]; 
            minIndex = i; 
            for(j = i; j < array.length; j++){
               if(array[j] < minValue){
                  minValue = array[j];
                  minIndex = j;
               }
            }
            if(minValue < array[i]){

               temp = array[i];
               array[i] = array[minIndex];
               array[minIndex] = temp;
            }
         }
      }
   }
   // bubble sort //
   class BubbleSorter extends Sorter{
      public void sort(){
         int i, j, temp = 0;
         for(i = 0; i < array.length - 1; i++){
            for(j = 0; j < array.length - 1 - i; j++){
               if(array[j] > array[j+1]){
                  temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
               }
            }
         }
      } 
   } 
   // insertion sort //
   class InsertionSorter extends Sorter{
      public void sort(){
         int i,j,key,temp;
         for (i = 1; i < array.length; i++){
            key = array[i];
            j = i - 1;
            while (j >= 0 && key < array[j]){
               temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
               j--;
            }
         }
         return;
      }
   }
   
   // quick sort //
   class QuickSorter extends Sorter{
      public void sort(){
         quickSort(0,array.length-1);
      }

      public void quickSort(int Low, int High){
         if(Low < High){
            int p = partition(Low, High);
               quickSort(Low,p-1);
               quickSort(p+1,High);
         }
      }

      public int partition (int Low, int High){
         int pivot = array[High];
         int x = Low;
         for (int i = Low; i <= High; i++){
            if (array[i] < pivot){
               int temp = array[x];
               array[x] = array[i];
               array[i] = temp;
               x++;
            }
         }
         int temp = array[x];
         array[x] = array[High];
         array[High] = temp;
         return x;
      }
   }
   
   // heap sort //
   class HeapSorter extends Sorter{ 
      public void sort(){ 
      int num = array.length;
        for (int i = array.length / 2 - 1; i >= 0; i--) 
            heapify(num, i); 
  
        for (int i=array.length-1; i >=0 ; i--){
            int temp = array[0]; 
            array[0] = array[i]; 
            array[i] = temp; 
            heapify(i, 0); 
        } 
      } 
  
       void heapify(int num, int i) { 
           int largest = i;   
           int l = 2*i + 1;   
           int r = 2*i + 2;   
     
           if (l < num && array[l] > array[largest]) 
               largest = l; 
     
           if (r < num && array[r] > array[largest]) 
               largest = r; 
     
           if (largest != i){ 
               int swap = array[i]; 
               array[i] = array[largest]; 
               array[largest] = swap; 
               heapify(num, largest); 
           } 
       }
   
}

////////////////////////////////////TEST//////////////////////////////

class SortTest{
   public static void SelectionSortTest(){
      SelectionSorter sorter = new SelectionSorter();
      sorter.fillRandom(20, 1000);
      System.out.println("Selection Sorter Test: ");
      sorter.testSortOutput();
   }
   
   public static void BubbleSortTest(){
      BubbleSorter sorter = new BubbleSorter();
      sorter.fillRandom(20, 1000);
      System.out.println("Bubble Sorter Test: ");
      sorter.testSortOutput();
   }
   
   public static void InsertionSortTest(){
      InsertionSorter sorter = new InsertionSorter();
      sorter.fillRandom(20, 1000);
      System.out.println("Insertion Sorter Test: ");
      sorter.testSortOutput();
   }
   
   public static void QuickSortTest(){
      QuickSorter sorter = new QuickSorter();
      sorter.fillRandom(20, 1000);
      System.out.println("Quick Sorter Test: ");
      sorter.testSortOutput();
   }
   
   public static void HeapSortTest(){
      HeapSorter sorter = new HeapSorter();
      sorter.fillRandom(20, 1000);
      System.out.println("Heap Sorter Test: ");
      sorter.testSortOutput();
   }
}
/////////////////////////OUTPUT NUMBERS AND TIMES//////////////////////////////
class TestDriver {
   public static void main(String[] args){
   
      SortTest.SelectionSortTest();
      SortTest.BubbleSortTest();
      SortTest.InsertionSortTest();
      SortTest.QuickSortTest();
      SortTest.HeapSortTest();


      SelectionSorter s1 = new SelectionSorter();
      BubbleSorter s2 = new BubbleSorter();
      InsertionSorter s3 = new InsertionSorter();
      QuickSorter s4 = new QuickSorter();
      HeapSorter s5 = new HeapSorter();
      
      System.out.println();
      System.out.println("\nTiming SelectionSorter: ");
      System.out.println("Numbers Time(MS)");

      for(int num = 10000; num <= 100000; num += 10000){
         s2.fillRandom(num, num*10);
         double t1 = s2.timedSort();
         System.out.println(num + "       " + t1);
      } 
      
      System.out.println();
      System.out.println("\nTiming BubbleSorter: ");
      System.out.println("Numbers Time(MS)");

      for(int num = 10000; num <= 100000; num += 10000){
         s1.fillRandom(num, num*10);
         double t2 = s1.timedSort();
         System.out.println(num + "       " + t2);
      } 

      System.out.println();
      System.out.println("\nTiming InsertionSorter: ");
      System.out.println("Numbers Time(MS)");

      for(int num = 10000; num <= 100000; num += 10000){
         s3.fillRandom(num, num*10);
         double t3 = s3.timedSort();
         System.out.println(num + "       " + t3);
      } 
      
      System.out.println();
      System.out.println("\nTiming QuickSorter: ");
      System.out.println("Numbers  Time(MS)");

      for(int num = 100000; num <= 1000000; num += 100000){
         s4.fillRandom(num, num*10);
         double t4 = s4.timedSort();
         System.out.println(num + "       " + t4);
      } 
      
      System.out.println();
      System.out.println("\nTiming HeapSorter: ");
      System.out.println("Numbers Time(MS)");

      for(int num = 100000; num <= 1000000; num += 100000){
         s5.fillRandom(num, num*10);
         double t5 = s5.timedSort();
         System.out.println(num + "       " + t5);
      } 
   }
}
