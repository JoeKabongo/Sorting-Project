public class InsertionSort {

  public static void main(String[] agrs){


    int [] numbers = {12, 4, 90, 5,1};
    printArray(numbers);
    insertionSort(numbers);
    printArray(numbers);


  }

  public static void insertionSort (int [] array)
  {
      int len = array.length-1;
      for(int i=0; i < len; i++)
      {
          int key= array[i+1];
          int j=i;
          //move element to the right that are larger than key
          while(j>=0 && array[j] > key)
          {
            array[j+1] = array[j];
            j--;
          }

          array[j+1] = key;

      }

  }

  // print element in the array
  public static void printArray(int [] array)
  {
    int len = array.length;
    for(int i=0; i<len; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println();
  }


}
