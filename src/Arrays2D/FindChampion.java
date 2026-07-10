package Arrays2D;

import javax.naming.PartialResultException;
import java.util.Scanner;
import java.util.Stack;

public class FindChampion {
    public static int Champion(int [][] grid){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < grid.length; i++){
            stack.push(i);
        }

        while(stack.size() >= 2){
            int i = stack.pop();
            int j = stack.pop();

            if(grid[i][j] == 1){
                stack.push(i);
            }else{
                stack.push(j);
            }
        }

        int pot = stack.pop();
        for(int i = 0; i< grid.length; i++){
                if(i != pot && grid[pot][i] == 0){
                    return -1;
                }
        }
        return pot;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square Matrix Size--");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter values");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Champion(arr));
    }
}
