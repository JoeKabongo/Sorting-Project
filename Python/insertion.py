def insertion(array):
    # Move elements of arr[0..i-1], that are
    # greater than element, to one position ahead
    # of their current position
    length = len(array)
    for i in range(1, length):
        element = array[i]
        sorted = i-1
        while sorted >= 0 and array[sorted] > element:
            array[sorted+1] = array[sorted]
            sorted -=1
        array[sorted+1] = element
    print(array)


m = [1, 12, 3, 10, 78, -9]
insertion(m)
