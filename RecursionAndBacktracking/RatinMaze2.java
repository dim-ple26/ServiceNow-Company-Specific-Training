package RecursionAndBacktracking;

public class RatinMaze2 {

    public static int maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc ==ec) return 1;
        int down = maze(sr+1, sc, er, ec);
        int right=maze(sr, sc+1, er, ec);
        int total = down +right;
        return total;

    }

    public static void print(int sr,int sc,int er,int ec,String s){

        if(sr>er || sc>ec) return;
        if(sr==er && sc ==ec) return 1;

    }



    public static void main(String[] args) {
        int rows =3;
        int col=3;
        int count = maze(1,1,rows,col);
        //System.out.println("Total no. of ways to get out of maze is "+count);
    }
    
}
