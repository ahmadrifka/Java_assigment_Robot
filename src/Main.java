import com.enigma.model.Robot;
import com.enigma.model.Direction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input koordinat (x,y) : ");
        String koordinat = dataIn.readLine();
        String[] xy = koordinat.split(",");
        Robot baymax = new Robot(Integer.parseInt(xy[0]),Integer.parseInt(xy[1]), Direction.valueOf(xy[2]));
        System.out.print("Input Perintah :");
        String comands = dataIn.readLine();
        baymax.comand(comands);
        baymax.run();
        System.out.println(baymax.print());

    }
}
