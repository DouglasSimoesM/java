public class For {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            System.out.println("Valor de i "+i);
        }
        for (int i = 0 , j = 10; i < j;i++, j--){
            System.out.println("Valor de i "+i+" Valor de j "+j);
        }
        int count=0;
        for(;count < 5;){
            System.out.println("count é "+count);
            count += 2; //para incrementar de 2 em 2
        }
        int soma = 0;
        for (int i=1; i<5; soma += i++);
        System.out.println("a soma é "+soma);
        
    }
}
