def selectionSort(array):
    length = len(array)
    for i in range(0, length):
        smallest_index = i
        for j in range(i, length):
            if array[j] < array[smallest_index]:
                smallest_index = j
        a

array = [3, 5, 1]
selectionSort(array)
