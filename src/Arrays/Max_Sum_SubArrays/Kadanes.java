package Arrays.Max_Sum_SubArrays;

public class Kadanes {
    public static void kadanes_algo(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }

        System.out.println("Max Sum SubArray : " + ms);
    }

    public static void main(String[] args) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadanes_algo(arr);
    }
}

/*
 * Output :
 * Max Sum SubArray : 7
 */