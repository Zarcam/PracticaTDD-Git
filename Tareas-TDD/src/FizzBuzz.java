public class FizzBuzz {
    public static String jugar(int num){
        if(num%3!=0 && num%5!=0){
            return Integer.toString(num);
        }

        String resultado = "";
        if(num%3==0){
            resultado = resultado.concat("Fizz");
        }
        if(num%5==0){
            resultado = resultado.concat("Buzz");
        }
        return resultado;
    }
}
