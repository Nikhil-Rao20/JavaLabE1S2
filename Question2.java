import java.util.Scanner;
class ProcessTheData{
    void intake(int[] array, int len){
        for(int i=1;i<=len;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of "+i+"th element: ");
            int j = sc.nextInt();
            array[i-1] = j;
        }
    }
    void display(int[] array){
        for (int j : array) {
            System.out.print("| " + j + " ");
        }
    }


}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        int middle=0, res=0;

        ProcessTheData obj = new ProcessTheData();
        obj.intake(array, len);
        System.out.println("Input array: ");
        obj.display(array);
        System.out.println();
        for(int i=0; i<len;i++){
            if(i%2==0){
                for(int j=i;j<array.length;j=j+2){
                    if(array[i]>array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            else{
                for(int j=i;j<array.length;j=j+2){
                    if(array[i]>array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        System.out.println("Resulting Array: ");
        obj.display(array);

    }
}
