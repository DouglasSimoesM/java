public class Arrays {
    public static void main (String[] args){
        double [] temperaturas = new double[365];
        temperaturas[0]=31.3;
        temperaturas[1]=32;
        temperaturas[2]=33.7;
        temperaturas[3]=34;
        temperaturas[4]=33.1;

        System.out.println("O valor da temperatura do dia 1 é "+ temperaturas[0]);
        System.out.println("O tamanho do array é: "+temperaturas.length);
        // para saber o que contem nos arrays devemos colocalo no loop FOR

        for (int i =0;i<temperaturas.length;i++){
            System.out.println("O valor da temperatura do dia "+(i+1)+" é "+temperaturas[i]);
        }

        //for melhorado: ele não fala qual posição ao imprimir
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
