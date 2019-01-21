def bubbleSort(array):
    """
    sort array that contains element of the same type
    """
    sorted = False
    length = len(array)

    while not sorted:
        sorted = True
        length -= 1
        for i in range(length):
            if array[i] > array[i+1]:
                array[i] , array[i+1] = array[i+1], array[i]
                sorted = False
    return array
