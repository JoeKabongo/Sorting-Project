public class BubbleSort {

  public static void main(String[] agrs){


    int [] numbers = {12, 4, 90, 5};
    printArray(numbers);
    bubbleSort(numbers);
    printArray(numbers);


  }

  public static void bubbleSort(int [] array)
  {
    
      int len = array.length-1;
      boolean sorted = false;

      while (!sorted){
        sorted = true;
        for(int i=0; i<len; i++)
        {
          // swap element if the one after it is larger
          if (array[i] > array[i+1])
          {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
            sorted = false;
          }
        }
      }

  }

  public static void printArray(int [] array)
  {
    int len = array.length;
    for(int i=0; i<len; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println();
  }


}
