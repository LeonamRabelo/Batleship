package battleship;
import java.util.*;
/**
 *
 * @author Lion
 */
public class Battleship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char tabuleirop1[][] = new char [5][5];
        char tabuleirop2[][] = new char [5][5];
        //char posnavio1[][] = new char [5][5];
        //char posnavio2[][] = new char [5][5];
        
        System.out.println("Welcome to Battleship!!!");
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
            tabuleirop1[i][j]='-';
            tabuleirop2[i][j]='-';
        }
        }
        
        /////////adicionar os navios do player1
        for(int c=0; c<5;){
        int i, j;
        System.out.println("PLAYER 1: Digite as cordenadas (linha/coluna) do navio " + (c+1) + " de comprimento um: ");
        i = in.nextInt();
        j = in.nextInt();
        if(i>4 && i<0){
        System.out.println("Invalid coordinates. Choose different coordinates.");
        }
        if(tabuleirop1[i][j]=='@'){
        System.out.println("You already have a ship there. Choose different coordinates.");
        }else{
        tabuleirop1[i][j] = '@';
        c++;
        }
        }
        ////imprimir o tabuleiro com os navios @ do player1
        System.out.printf("  0 1 2 3 4\n");
        for(int i=0; i<5; i++){
        System.out.printf("%d ", i);
        for(int j=0; j<5; j++){
        System.out.printf("%c ", tabuleirop1[i][j]);
        }
        System.out.printf("\n");
        }
            
        /////////adicionar os navios do player2
        for(int c=0; c<5;){
        int i, j;
        System.out.println("PLAYER 2: Digite as cordenadas (linha/coluna) do navio " + (c+1) + "de comprimento um");
        i = in.nextInt();
        j = in.nextInt();
        if(i>4 && i<0){
        System.out.println("Invalid coordinates. Choose different coordinates.");
        }
        if(tabuleirop2[i][j]=='@'|| tabuleirop2[i][j]=='X' || tabuleirop2[i][j]=='0'){
        System.out.println("You already have a ship there. Choose different coordinates.");
        }else{
        tabuleirop2[i][j] = '@';
        c++;
        }
        }
        ////imprimir o tabuleiro com os navios @ do player2
        System.out.printf("  0 1 2 3 4\n");
        for(int i=0; i<5; i++){
        System.out.printf("%d ", i);
        for(int j=0; j<5; j++){
        System.out.printf("%c ", tabuleirop2[i][j]);
        }
        System.out.printf("\n");
        }
        
        
    }
}
