import java.util.Scanner;
class ProcessData{
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

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        ProcessData obj = new ProcessData();
        obj.intake(array, len);
        System.out.println("Input array: ");
        obj.display(array);
        System.out.println();
        for(int i=0; i<len;i++){
            int left=0;
            int right=0;
            for(int j=i+1;j<len;j++){
                right+=array[j];
            }
            for(int j=i;j>=0;j--){
                left += array[j];
            }
            System.out.println(i+" position is done: left="+left+" right="+right);

            if (left==right){
                System.out.println("The required position is "+i);
                break;
            }
        }

    }
}
