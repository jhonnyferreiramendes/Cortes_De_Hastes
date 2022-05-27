/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortedehaste;

/**
 *
 * @author Jhonny
 */
public class Cortes {

    public static int corteDeBarras(int preco[], int n) {
        if (n == 0) {
            return 0;
        }
        int lucro = -1;
        for (int i = 0; i < n; i++) {
            int valor = preco[i] + corteDeBarras(preco, n - i - 1);
            if (valor > lucro) {
                lucro = valor;
            }
        }
        return lucro;
    }

    public static int corteDeBarrasBottomUp(int preco[], int n) {
        int B[] = new int[n + 1];
        int S[] = new int[n + 1];
        B[0] = 0;
        for (int i = 1; i <= n; i++) {
            int lucro = -1;
            for (int j = 0; j < i; j++) {
                int valor = preco[j] + B[i - j - 1];
                if (valor > lucro) {
                    lucro = valor;
                    S[i] = j;
                }
            }
            B[i] = lucro;

        }
        return B[n];
    }
}
