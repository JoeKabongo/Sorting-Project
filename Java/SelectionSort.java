public class SelectionSort {

  public static void main(String[] agrs){


    int [] numbers = {12, 4, 90, 5};
    printArray(numbers);
    selectionSort(numbers);
    printArray(numbers);


  }

  public static void selectionSort (int [] array)
  {
      int len = array.length-1;
      for(int i=0; i < len; i++)
      {
        // find the minimum element in the unordered part of the list
        int smallest_index = i;
        for(int j=i+1; j<len+1; j++)
        {
          if(array[j] < array[smallest_index])
          {
              smallest_index = j;
          }
        }

        // Swap the found minimum element with the first element of unordered part
        int temp = array[smallest_index];
        array[smallest_index] = array[i];
        array[i] = temp;
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
