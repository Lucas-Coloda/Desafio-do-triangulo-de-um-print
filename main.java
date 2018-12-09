
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		char[] valores = { ' ', 'x', ' ','\n' };// itens printaveis
		int[] periodo = { 0, 0, 0, 0 };         // div dos 4 periodos de loop
        int linhas =  in.nextInt();  

		periodo = defPeriodo(linhas);           // calcula os valores dos periodos inicialmente

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < 4; j++) {
                for(int per = periodo[j]; per > 0; per--){
				    System.out.print(valores[j]);
                }
			}
			periodo = attPeriodo(periodo);
		}
	}

	public static int trocaMarcha(int contador) {
		contador++;
		if (contador == 3) {
			contador = 0;
		}
		return contador;
	}

	public static int[] defPeriodo(int linhas) {
		int bl1 = linhas ;
		int bl2 = linhas;
		int epx = 1;
		int epl = 1;
		int[] vet = {bl1,epx,bl2,epl};
		return vet;
	}

	public static int[] attPeriodo(int periodo[]) {
		periodo[0] -= 1;
		periodo[1] += 2;
		periodo[2] -= 1;
		return periodo;
	}

}
