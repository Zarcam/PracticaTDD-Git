import java.util.ArrayList;

public class OperacionesTDD {
    public static int suma(String valores){
        if(valores.isBlank()){
            return 0;
        }

        //Comprobamos si hay separador al final
        if(valores.charAt(valores.length()-1) == ','){
            return -1;
        }

        //Extraemos los numeros del String y los almacenamos en un arrylist
        ArrayList<Integer> valoresASumar = new ArrayList<>();
        for(int i = 0; i < valores.length(); i++){
            int j = i;
            while(j < valores.length() && valores.charAt(j) != ','){
                j++;
            }
            if(i != j){
                valoresASumar.add(Integer.parseInt(valores.substring(i, j)));
            }
            i = j;
        }

        //Buscamos valores negativos
        for(Integer i : valoresASumar){
            if(i < 0){
                System.err.println("Numero negativo no permitido");
                return -1;
            }
        }

        int suma = 0;
        for(Integer i : valoresASumar){
            if(i > 1000){
                System.err.println("Número superior a 1000 ignorado");
            }else {
                suma += i;
            }
        }
        return suma;
    }
}
