import java.util.Arrays;

public class MergeSort {

  public static void main(String[] agrs){


    int [] numbers = {12, 4, 90, 5, 2, 100, 45, 2, 6};
    printArray(numbers);
    mergeSort(numbers);
    printArray(numbers);



  }

  public static void mergeSort (int [] array)
  {

    if(array.length > 1){

      //divide the array in two. sort the left half and then the right part
      int len = array.length;
      int middle = array.length/2;
      int [] left = Arrays.copyOfRange(array, 0, middle);
      int [] right = Arrays.copyOfRange(array, middle, len);
      mergeSort(left);
      mergeSort(right);


      //merge the two array
      int left_length= left.length;
      int right_length= right.length;
      int l=0, r=0, index=0;
      while(l<left_length && r<right_length)
      {
        if(left[l] < right[r])
        {
          array[index] = left[l];
          l++;
        }
        else
        {
          array[index] = right[r];
          r++;
        }
        index++;
      }

      //add the remaining element in the main array
      while(l<left_length)
      {
        array[index] = left[l];
        l++;
        index ++;
      }

      while(r<right_length)
      {
        array[index] = right[r];
        r++;
        index++;
      }

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
