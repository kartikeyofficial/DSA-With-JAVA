public class GridWay {

    public static  int Grid(int i, int j,int n, int m){
        if (i==n-1 && j==m-1){   // Base Case
            return 1;
        }
        else if(i==n || j==m){ //Boundary Cross Condition
            return 0;
        }
        int way1= Grid(i+1,j,n,m);
        int way2 =Grid(i,j+1,n,m);
        return  way1+way2;


    }
    static void main(String[] args) {
        int n=3,m=3;
        System.out.println(Grid(0,0,n,m));

    }
}
