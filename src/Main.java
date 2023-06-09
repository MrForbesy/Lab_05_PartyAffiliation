// class PoliticalParty
//	main ()
//		STRING politicalParty
//		output “What is your political party?”
//		if politicalParty = “Democrat” then
//			output “You get a Democratic Donkey.”
//		elseif politicalParty = "Republican” then
//			output "You get a Republican Elephant.”
//		elseif politicalParty = “Independent” then
//output “You get an Independent Man.”
//				else
//					out “Your party does not have a symbol or mascot.”
//				endIf
//	return
//end class

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String politicalParty = "";

        System.out.printf("Please enter D if you are a Democrat, R if you are a Republican or a I if you are an Independent.");

        politicalParty = in.nextLine();

        if(politicalParty.equals("D"))
        {
            System.out.printf("You are a Democrat and your party's mascot is a donkey!");
        }
        else if (politicalParty.equals("R"))
        {
            System.out.printf("You are a Republican and your party's mascot is an elephant!");
        }
        else if (politicalParty.equals("I"))
        {
            System.out.printf("You are an Independent and your party's mascot is a man!");
        }
        else
        {
            System.out.printf("Your political party is not recognized and has no know mascot.");
        }
    }
}