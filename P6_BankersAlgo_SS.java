//Name: Subrat Sahu 
// Batch: B2
// PRN: 2020016400833692
// Date: 20th August 2021
// Prac-06: Banker's Algorithm
import java.util.Scanner;

public class P6_BankersAlgo_SS {

private int need[][], allocate[][], max[][], avail[][], np, SS;

private void input() {

Scanner sc = new Scanner(System.in);

System.out.print("Enter no. of processes : ");

np = sc.nextInt(); // no. of process

System.out.print("Enter no. of resources: ");

SS = sc.nextInt(); // no. of resources
need = new int[np][SS]; // initializing arrays

max = new int[np][SS];

allocate = new int[np][SS];

vail=newint[1][SS];

for (int i = 0; i < np; i++) {

System.out.print("Enter allocation matrix for process P" + i + ": "); allocate[i][j] = sc.nextInt(); // allocation matrix

for (int j = 0; j < SS; j++)

}

for (int i = 0; i < np; i++) {

System.out.print("Enter maximum matrix for process P" + i + ": ");

for (int j = 0; j<SS; j++)

max[i][j] = sc.nextInt(); // max matrix }
private boolean check(int i) {

// checking if all resources for ith process can be allocated for (int j = 0; j<n; j++)

f(avail * [0] * [j] < need * [i] * [j])

return false;

return true;

} // check() ends public void isSafe() {

input();

calc_need():

boolean done[] = new boolean[np];

int i=0;
// printing Need Matrix

System.out.println("========Need

for (int a = 0; a < np; a++) {

for (int b= 0; b < SS; b++) {

System.out.print(need[a][b] + "\t");

}

System.out.println();

Matrix========");

}	for (int i = 0; i < np; i++)

if (!done[i] && check(i)) { // trying to allocate for (int k = 0; k < SS; k++)

avail[0][k]=avail[0][k]* need[i][k]+max[i][k]; System.out.print("P" + i + ">");

allocated = done[i] = true;
if (j == np) // if all processes are allocated System.out.println("\nSafely allocated");

else System.out.println("All/Remaining process can\'t be allocated safely");

}//isSafe() ends

public static void main(String[] args) {

new P6_BankersAlgo_SS().isSafe();

}

}// class ends