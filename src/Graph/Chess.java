package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Chess {
    Scanner scan = new Scanner(System.in);

    public Chess() {
        System.out.println("Enter the size of chess board - '8' or '4");
        int n = scan.nextInt();
        Graph<String> graph_Chess = new AdjacencyGraph<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph_Chess.addValue(i + "," + j);
                System.out.println(i + "," + j);
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row - 2 >= 0 && col - 1 >= 0) {
                    graph_Chess.Undirected(row + "," + col, (row - 2) + "," + (col - 1));
                    System.out.print(row + "," + col + (row - 2) + "," + (col - 1));
                }
                if (row - 2 >= 0 && col + 1 < n) {
                    graph_Chess.Undirected(row + "," + col, (row - 2) + "," + (col + 1));
                    System.out.print(row + "," + col + (row - 2) + "," + (col + 1));
                }
                if (row - 1 >= 0 && col + 2 < n) {
                    graph_Chess.Undirected(row + "," + col, (row - 1) + "," + (col + 2));
                    System.out.print(row + "," + col + (row - 1) + "," + (col + 2));
                }
                if (row - 1 >= 0 && col - 2 >= 0) {
                    graph_Chess.Undirected(row + "," + col, (row - 1) + "," + (col - 2));
                    System.out.print(row + "," + col + (row - 1) + "," + (col - 2));
                }
                if (row + 2 < n && col - 1 >= 0) {
                    graph_Chess.Undirected(row + "," + col, (row + 2) + "," + (col - 1));
                    System.out.print(row + "," + col + (row + 2) + "," + (col - 1));
                }
                if (row + 2 < n && col + 1 < n) {
                    graph_Chess.Undirected(row + "," + col, (row + 2) + "," + (col + 1));
                    System.out.print(row + "," + col + (row + 2) + "," + (col + 1));
                }
                if (row + 1 < n && col + 2 < n) {
                    graph_Chess.Undirected(row + "," + col, (row + 1) + "," + (col + 2));
                    System.out.print(row + "," + col + (row + 1) + "," + (col + 2));
                }
                if (row + 1 < n && col - 2 >= 0) {
                    graph_Chess.Undirected(row + "," + col, (row + 1) + "," + (col - 2));
                    System.out.print(row + "," + col + (row + 1) + "," + (col - 2));
                }
                System.out.println();
            }
            System.out.println();
        }

        ArrayList<String> list = new ArrayList<>();4
        int value = 35;
        for (int i = 0; i < n * 9; i++) {
            if (i == 9) {
                value = (35 - i);
            } else if (i == 18) {
                value = (35 - i);
            } else if (i == 27) {
                value = (35 - i);
            } else {
                if ((i + value) % 2 == 0) {
                    list.add(null);
                } else {
                    list.add(String.valueOf(i));
                }
            }
        }

        Iterator<String> itr = graph_Chess.breadthFirstPath("0,0", "3,3").iterator();
        int count = -1;
        int counter_matrix = 1;
        int temp = 0;
        while (itr.hasNext()) {
            String elements = itr.next();
            for (int i = 0; i < list.size(); i++) {
                char row = elements.charAt(0);
                char col = elements.charAt(2);
                int row_Value = Character.getNumericValue(row);
                int col_Value = Character.getNumericValue(col);
                if (row_Value == 0) {
                    if (null == list.get(i)) {
                        count = count + 1;
                        if (count == (row_Value + col_Value)) {
                            list.set(i, String.valueOf(counter_matrix));
                            counter_matrix += 1;
                        }
                    }
                } else if (row_Value == 1) {
                    temp = col_Value + 4;
                    if (null == list.get(i)) {
                        count = count + 1;
                        if (count == (temp + col_Value)) {
                            list.set(i, String.valueOf(counter_matrix));
                            counter_matrix += 1;
                        }
                    }
                } else if (row_Value == 2) {
                    temp = col_Value + 8;
                    if (null  == list.get(i)) {
                        count = count + 1;
                        if (count == (temp + col_Value)) {
                            list.set(i, String.valueOf(counter_matrix));
                            counter_matrix += 1;
                        }
                    }
                } else {
                    temp = col_Value + 12;
                    if (null == list.get(i)) {
                        count = count + 1;
                        if (count == (temp + col_Value)) {
                            list.set(i, String.valueOf(counter_matrix));
                            counter_matrix += 1;
                        }
                    }
                }
            }
        }
        Iterator<String> itr2 = list.iterator();
        while (itr2.hasNext()) {
            String elements = itr2.next();
            System.out.println(elements);
        }
        System.out.println("The final output of the graph is");
        System.out.println(graph_Chess.breadthFirstPath("0,0", "3,3"));
    }


    public static void main(String[] args) {
        Chess ch = new Chess();

    }
}
