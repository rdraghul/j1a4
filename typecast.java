import java.util.Scanner;

public class typecast {
    public static void main(String s[])
    {
    	byte byt;
    	int in;
    	short sh;
    	long lon;
    	float fl;
    	double db;
    	
    	Scanner sc = new Scanner(System.in);
    	byt = sc.nextByte();
    	sh = sc.nextShort();
    	
        in = (int)(byt+sh);
        System.out.println("byte + short ="+in);
        lon = (long)(sh + in);
        System.out.println("int + short ="+lon);
        fl = (float)lon + in;
        System.out.println("long + int ="+fl);
        db = (double)fl + lon;
        System.out.println("float + long ="+db);
    }
}
