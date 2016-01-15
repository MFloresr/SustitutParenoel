import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main (String[] args){
        Set<String> cordenadas=new HashSet<>();
        int x=0;
        int y=0;
        String cordenada;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(App.class.getResource("cami.txt").openStream()));
            String linia;
            while ((linia = reader.readLine()) != null) {
                for(int i=0 ;i<linia.length();i++){
                    if(linia.charAt(i)=='>'){
                        y=y+1;
                    }if(linia.charAt(i)=='<'){
                        y=y-1;
                    }if(linia.charAt(i)=='^'){
                        x=x+1;
                    }if(linia.charAt(i)=='v'){
                        x=x-1;
                    }
                    //System.out.println("("+x+";"+y+")");
                    cordenada="("+x+";"+y+")";
                    cordenadas.add(cordenada);
                }
            }
            reader.close();
            System.out.println("Archivo Correcto");
            System.out.println("El sustituto ha pasado por : "+cordenadas.size()+" casas");

        } catch (IOException e) {
            System.err.format("Exception ocurred trying to read cami.txt.");
            e.printStackTrace();
        }
    }

}
