import java.util.Scanner;

public class SIMULADO {
    public static void main(String[] args) {
        double[] energias = new double[10];
        double media=0, maior=0, alt_ener=0, indice=0;
         Scanner escreve = new Scanner(System.in);
         System.out.println("=== SISTEMA DE MONITORAMENTO DE NEUTRINOS - ICECUBE ===");
         System.out.println("Informe o nívei de energia registrado (em TeV): ");
         for(int i=0;i<energias.length;i++){
            energias[i]=escreve.nextDouble();
            media=media+energias[i];
            if(maior<=energias[i]){
                maior=energias[i];
                indice=i+1;
            }
            if (energias[i]>100.0){
                alt_ener++;
            }
            media=media/energias.length;
         }
         System.out.println("=== RELATÓRIO DE DETECÇÃO DE PARTÍCULAS FANTASMA ===");
         System.out.println("A media de energias calculadas e: "+ media);
         System.out.println("O maior pico de energia capturado foi de: "+ maior + ", e  seu índice (sensor) foi o de posição:"+ indice);
         System.out.println("A quantidade de sensores que contabilizaram o s eventos de altissima energia foram: "+ alt_ener);
         escreve.close();
    }

}
