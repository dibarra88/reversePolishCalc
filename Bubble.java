public class Bubble {

    public int[] bubbleSort(int[] numbers){

        boolean unsorted = true;
        int temp;

        while (unsorted)
        {
            unsorted= false;
            for(int i =0;  i < numbers.length -1;  i++ )
            {
                if ( numbers[i] > numbers[i+1] )
                {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    unsorted = true;
                }
            }
        }
        return numbers;
    }
}
