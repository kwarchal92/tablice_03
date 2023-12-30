package tablice_03;

public class NewClass {

    public static void main(String[] args)
    {
        int n =10, i, j, suma;
        int macierz[][] = new int[n][n];

        for (i = 0; i < macierz.length; i++)
        {
            for (j =0; j < macierz.length; j++)
            {
                if (i == j)
                    macierz[i][j] = i;
                else
                    macierz[i][j] = 0;
            }
        }

        //wyswietlenie zawartosci tablicy

        for (i = 0; i < macierz.length; i++)
        {
            for (j =0; j < macierz.length; j++)
            {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();

        }

        //suma liczb po przekatnej macierzy

        suma = 0;

        for (i = 0; i < macierz.length; i++)
        {
            suma += macierz[i][i];
        }

        System.out.println("\nsuma liczb to: " + suma);

    }
}
