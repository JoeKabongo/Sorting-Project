def mergeSort(array):
    length = len(array)

    if length > 1:

        #sort the left and  right part of the list

        middle = length//2
        left = array[0:middle]
        right = array[middle:]
        mergeSort(left)
        mergeSort(right)



        len_right = len(right)
        len_left= len(left)
        l=0
        r=0
        index = 0

        #merge the two list
        while l < len_left and r < len_right:
            if right[r] < left[l]:
                array[index] = right[r]
                r+=1
            else:
                array[index] = left[l]
                l+=1
            index +=1

        while l < len_left:
            array[index] = left[l]
            l+=1
            index +=1

        while r < len_right:
            array[index] = right[r]
            r+=1
            index +=1



v = [3, 4, 1]
mergeSort(v)
print(v)
