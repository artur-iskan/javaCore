package Homework2;

public class exmaple5 {
}
//5
public static void main(String[] args){
    int rows = 5;
    for (int i = 1; i <= rows; i++){
        for (int s = 0; s < rows - i; s++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
        }
    }
}