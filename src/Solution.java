



import java.util.Random;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // 4. Fer un programa que llegeixi una taula numèrica real i escrigui la taula transposada. La taula transposada s'obté canviant les files per les columnes.
        Scanner in=new Scanner (System.in);


        System.out.print("Files: ");
        int files=in.nextInt();
        System.out.print("Columnes: ");
        int cols=in.nextInt();
        in.close();

        int[][] matriu = new int[files][cols];
        int[][] trasposada = new int[cols][files];

        //Omplim la matriu amb un bucle	de numeros aleatoris entre 0 i 100

        for (int x=0; x<files; x++)
        {
            for (int y=0; y<cols; y++)
            {
                matriu[x][y]=(int)(Math.random()*100);
                System.out.print(matriu[x][y]+" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //Taula trasposada
        System.out.println("Taula trasposada");
        System.out.println(" ");
        for (int x=0; x<cols; x++)
        {
            for (int y=0; y<files; y++)
            {
                System.out.print(matriu[y][x]+" ");
                trasposada[x][y] = matriu[y][x];
            }
            System.out.println(" ");
        }

    }

}
