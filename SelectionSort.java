public class SelectionSort {

    public static void main (String[] args){


        int[] intArray= {20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex >0; lastUnsortedIndex --){
            int largest= 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i]> intArray[largest]){
                    largest = i;
                }


            }

            swap(intArray, largest, lastUnsortedIndex);

        }

        for(int i =0; i< intArray.length;i++){

            System.out.println(intArray[i]);
        }



    }
    public static void swap(int [] arrayt, int i, int j){
        if(i==j){
            return;
        }
        int temp = arrayt[i];
        arrayt[i] = arrayt[j];
        arrayt[j] = temp;    

    }
}
