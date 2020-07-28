package piff_corp_4ever;
import java.util.ArrayList;
import java.util.Scanner;


public class Songlist {
    public static void songs() {
//ArrayList including Piff-Corp-Vol. 1 Songs along with scanner to be included in GUI
    ArrayList<String> piff = new ArrayList<String>();
    @SuppressWarnings("resource")
    Scanner songresponse = new Scanner(System.in);
    piff.add("Birth of Piff");
    piff.add("Fuck Grace ACAB");
    piff.add("Young Gripper");
    piff.add("James Freestyle");
    piff.add("Noah Woods Beanie");
    piff.add("BrightBart");
    piff.add("Meowxerz");
    piff.add("Piff Clit");
    piff.add("Terraria 2");
    System.out.println("Have you heard any of our songs from Volume One of the Piff Corp Project?");
    String songchoice = songresponse.nextLine();
    if(songchoice.equals("yes")) {
    System.out.println("Here are your song choices from the first album");
    for(int counter=0; counter< piff.size();counter++) {
    System.out.println(piff.get(counter) + "");

    }
    System.out.println("Would you like to listen to any of these songs?");
    }
    else { System.exit(0);}
    String listenresponse = songresponse.nextLine();
    if(piff.contains(listenresponse))
    { System.out.println("sample text");}
}




    public static void main (String[]args)
    {
        songs();
        new PiffGui2();
    }
    }
