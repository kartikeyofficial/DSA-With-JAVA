import java.util.Scanner;

 class FirstOccuranceInArray {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size of The Array: ");
        int size = x.nextInt();
        int[] newArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter The Elements "+(i+1)+" : ");
            newArray[i] = x.nextInt();
         }
        System.out.print("Enter The key to Find the Index: ");
        int key = x.nextInt();
        System.out.println("The Given Key is Present At Index: "+Occurance(newArray,key,0));
    }
    public static int Occurance(int[] newArray,int key ,int i){
        if (i== newArray.length){
            return -1;
        }
        if (newArray[i] == key){
            return i;
        }
        return Occurance(newArray, key, i+1);
    }
}
