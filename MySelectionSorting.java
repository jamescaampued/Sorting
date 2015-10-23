public class MySelectionSorting
{

    public static void main(String[] args)
    {


        int array[] = new int[] {1,45,23,11,103,55};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        selectionSort(array);

        System.out.println("");

        System.out.println("The numbers in Ascending");
        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

    }
    public static int[] selectionSort(int array[])
    {
        for(int i = array.length - 1; i >= 0; i--)
        {
            int highestIndex = i;
            for(int j = i; j >= 0; j--)
            {
                if(array[j] > array[highestIndex])
                    highestIndex = j;
            }

            int temp = array[i];
            array[i] = array[highestIndex];
            array[highestIndex] = temp;
        }

        return array;
    }
}
