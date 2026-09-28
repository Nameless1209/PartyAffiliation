import java.util.Scanner;

public class PartyAffiliation {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        String affiliation;

        System.out.println("PLease enter one of the following: D, R, I");
        affiliation = in.nextLine();

        if (affiliation.equals("D")){
            System.out.println("You get a Democratic Donkey");
        }
        else if (affiliation.equals("R")) {
            System.out.println("You get a Republican Rino");
        }
        else if (affiliation.equals("I")){
            System.out.println("You get a Independent Iguana");
        }
        else {
            System.out.println("You get a " + affiliation + " Star");
        }

    }
}
