public class OperacionesTDD {
    public static int suma(String valores){
        if(valores.isBlank()){
            return 0;
        }

        int suma = 0;
        for(int i = 0; i < valores.length(); i++){
            if(i%2==0){
                suma +=Integer.parseInt(valores.substring(i, i+1));
            }
        }
        return suma;
    }
}
