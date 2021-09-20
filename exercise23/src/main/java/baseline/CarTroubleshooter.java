package baseline;

import java.util.Scanner;

public class CarTroubleshooter {
    private static final Scanner input = new Scanner(System.in);
    private String userChoiceTemp;
    private char userChoice;
    private boolean carSilent;
    private boolean crankUpNoStart;

    public CarTroubleshooter() {
        this.userChoiceTemp = "";
        this.carSilent = true;
        this.crankUpNoStart = true;
    }

    public void carIsSilent() {
        System.out.print("Is the car silent when you turn the key? ");

        this.userChoiceTemp = input.nextLine();
        this.userChoice = this.userChoiceTemp.charAt(0);

        if(this.userChoice == 'y') {
            System.out.print("Are the battery terminals corroded? ");

            this.userChoiceTemp = input.nextLine();
            this.userChoice = this.userChoiceTemp.charAt(0);

            if(this.userChoice == 'y') {
                System.out.println("Clean terminals and try starting again.");
            }else {
                System.out.println("Replace cables and try again.");
            }
        }else {
            this.carSilent = false;
        }
    }

    public void carIsNotSilent() {
        if(!this.carSilent) {
            System.out.print("Does the car make a slicking noise? ");

            this.userChoiceTemp = input.nextLine();
            this.userChoice = this.userChoiceTemp.charAt(0);

            if(this.userChoice == 'y') {
                System.out.println("Replace the battery.");
            }else {
                System.out.print("Does the car crank up but fail to start? ");

                this.userChoiceTemp = input.nextLine();
                this.userChoice = this.userChoiceTemp.charAt(0);

                if(this.userChoice == 'y') {
                    System.out.println("Check spark plug connections.");
                }else {
                    this.crankUpNoStart = false;
                }

            }
        }
    }

    public void carStartThenDieCheck() {
        if (!this.crankUpNoStart) {
            System.out.print("Does the engine start and then die? ");

            this.userChoiceTemp = input.nextLine();
            this.userChoice = this.userChoiceTemp.charAt(0);

            if (this.userChoice == 'y') {
                System.out.print("Does you car have fuel injection? ");

                this.userChoiceTemp = input.nextLine();
                this.userChoice = this.userChoiceTemp.charAt(0);

                if (this.userChoice == 'y') {
                    System.out.println("Get it in for service.");
                } else {
                    System.out.println("Check to ensure the choke is opening and closing.");
                }
            } else {
                System.out.println("This should not be possible.");
            }
        }
    }
}
