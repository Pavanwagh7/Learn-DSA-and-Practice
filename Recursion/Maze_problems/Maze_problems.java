package Recursion.Maze_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze_problem01 {
    public static void main(String[] args) {
//        System.out.println(numberOfPaths(3,3));
//        print_the_paths("",3,3);
//        System.out.println(retrun_the_paths("",3,3));
//        System.out.println(retrun_the_paths_including_diagonal("",3,3));
        //obstacles_in_maze("",new boolean[][]{{true,true,true},{true,false,true},{true,true,true}},0,0);
        //allPaths ("",new boolean[][]{{true,true,true},{true,true,true},{true,true,true}},0,0);
        boolean[][] grid = new boolean[][]{
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[grid.length][grid[0].length];
        allPathsInMatrices("",grid,0,0,path,1);
    }
    //Count Number of Paths in a Grid (Maze)
    static int numberOfPaths (int r,int c) {
        //base case
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = numberOfPaths(r - 1,c);
        int right = numberOfPaths(r,c - 1);
        return right + left;
    }


    //print all the paths
    static void print_the_paths(String p, int r, int c) {
        //base case
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1)
            print_the_paths(p + "d",r - 1,c);

        if (c > 1)
            print_the_paths(p + "r",r,c - 1);
    }


    //return all the paths
    static ArrayList<String> retrun_the_paths(String p, int r, int c) {
        //base case
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1)
            list.addAll(retrun_the_paths(p + "d",r - 1,c));

        if (c > 1)
            list.addAll(retrun_the_paths(p + "r",r,c - 1));

        return list;
    }

    //retrun the paths including diagonal paths
    //vertical V
    //Horizontal H
    //diagonal D
    static ArrayList<String> retrun_the_paths_including_diagonal(String p, int r, int c) {
        //base case
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1)
            list.addAll(retrun_the_paths_including_diagonal(p + "D",r - 1,c - 1));

        if (r > 1)
            list.addAll(retrun_the_paths_including_diagonal(p + "V",r - 1,c));

        if (c > 1)
            list.addAll(retrun_the_paths_including_diagonal(p + "H",r,c - 1));

        return list;
    }

    //Maze with obstacles
    //find all the possible paths
    static void obstacles_in_maze (String p,boolean[][] maze,int r,int c) {
        //base case
        if (r == 2 && c == 2) {
            System.out.println(p);
            return;
        }

        //in every call, check if there is an obstacle(cell value is false) or not on current possition
        if (!maze[r][c])
            return;

        //go D - down
        if (r < maze.length - 1) {
            obstacles_in_maze(p + "D", maze, r + 1, c);
        }

        // go R - right
        if (c < maze[0].length - 1) {
            obstacles_in_maze(p + "R", maze, r, c + 1);
        }
    }
    //find all the paths
    //consider R-right, L-left, U-up, D-down
    static void allPaths (String p,boolean[][] maze,int r,int c) {
        //base case
        if (r == 2 && c == 2) {
            System.out.println(p);
            return;
        }

        //if cureent cell is already(i.e cell value is already false) visited don't proceed return from there
        if (!maze[r][c])
            return;

        //mark current cell false as it is visited
        maze[r][c] = false;

        //go U - up
        if (r > 0) {
            allPaths(p + "U", maze, r - 1, c);
        }

        //go D - down
        if (r < maze.length - 1) {
            allPaths(p + "D", maze, r + 1, c);
        }

        // go L - left
        if (c > 0) {
            allPaths(p + "L", maze, r, c - 1);
        }

        // go R - right
        if (c < maze[0].length - 1) {
            allPaths(p + "R", maze, r, c + 1);
        }

        //and when you have done with this recurssive call,revert all the changes made
        maze[r][c] = true;
    }

    //print all the paths in the saperate matrices
    static void allPathsInMatrices (String p,boolean[][] maze,int r,int c,int[][] path,int step) {
        //base case
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path)
                System.out.println(Arrays.toString(arr));
            System.out.println(p);
            System.out.println();//new line
            return;
        }

        //check if cell is already visited or not
        if (!maze[r][c]) {
            return;
        }

        //mark the visted cell
        maze[r][c] = false;

        //consider the cell is in my path or count the cell in path
        path[r][c] = step;

        //go U - up
        if (r > 0) {
            allPathsInMatrices(p + "U", maze, r - 1, c,path,step + 1);
        }

        //go D - down
        if (r < maze.length - 1) {
            allPathsInMatrices(p + "D", maze, r + 1, c,path,step + 1);
        }

        // go L - left
        if (c > 0) {
            allPathsInMatrices(p + "L", maze, r, c - 1,path,step + 1);
        }

        // go R - right
        if (c < maze[0].length - 1) {
            allPathsInMatrices(p + "R", maze, r, c + 1,path,step + 1);
        }

        //revert all the changes made in current call,before coming out of the function call
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
