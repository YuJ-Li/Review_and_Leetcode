def asc_bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                # swap arr[j] and arr[j+1]
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


def dec_bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] < arr[j + 1]:
                # swap arr[j] and arr[j+1]
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


if __name__ == '__main__':
    arr = [5, 1, 4, 2, 8]
    print("The unsorted array: ",end=" ")
    for i in range(len(arr)):
        print(arr[i], end=" ")
    asc_bubble_sort(arr)
    print("")
    print("The sorted array in asceding order: ",end=" ")
    for i in range(len(arr)):
        print(arr[i], end=" ")
    dec_bubble_sort(arr)
    print("")
    print("The sorted array in asceding order: ", end=" ")
    for i in range(len(arr)):
        print(arr[i], end=" ")