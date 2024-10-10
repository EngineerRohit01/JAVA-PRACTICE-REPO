import java.util.Scanner;
public class Main{

public static boolean found(int[][] arrae , int num){
int i = 0;
while(i<arrae.length){
  int j = 0;
  while(j<arrae[i].length){
     if(arrae[i][j]==num){
         return true;
     } 
     j++;
  }
  i++;  
}
return false;
}





public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the no of  rows: ");
int rows = input.nextInt();

System.out.print("Enter the no of  column: ");
int column = input.nextInt();

int[][] arrae = new int[rows][column];

int i =0;
while(i<rows){
int j = 0;
while(j<column){
System.out.print("Enter row:"+(i+1)+",column:"+(j+1)+":");
arrae[i][j] = input.nextInt();
j++;
}
i++;
}

System.out.print("enter the search no");
int num = input.nextInt();


boolean found = found(arrae,num);
if(found){
System.out.print("no is found");
}else{
System.out.print("no is not found");
}
}
}
