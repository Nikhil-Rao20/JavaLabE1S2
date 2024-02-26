// n persons running on a 3 track field, on each comeptition of one track , note down the their oxygen levels from 1 to 100
// Finally finout the average indivudually, if a person average is less then 70, display as you are failed, display top most person
// If oxygen is same then display all, if all are less than 70 then display all are failed

// 2d arrays


import java.util.Scanner;

public class oxygencounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of participants in the race: ");
        int personcount = sc.nextInt();
        int[] avgresult = new int[personcount];
        int[][] analysis = new int[personcount][3];
        Report rp = new Report(personcount, analysis, avgresult);
        rp.intake();
        rp.avgofperson();
        rp.lessthanseventy();
        rp.avgofperson();
        rp.display(avgresult);
        rp.topmost(avgresult);


    }
}

class Report{
    

    public Report(int personcount, int[][]analysis, int[]avgresult){
        this.noofpersons = personcount;
        this.nikhil = analysis;
        this.average = avgresult;

    }
    int noofpersons, topper;
    int[][] nikhil = new int[noofpersons][3];
    Scanner sc = new Scanner(System.in);
    int[] average = new int[noofpersons];
    
    void intake(){
        for(int lap=0; lap<3;lap++){
            for(int person=0;person<noofpersons;person++){
                System.out.println("Enter the oxygen levels of participant "+(person+1)+" in the lap "+(lap+1)+"(The level must be between 1 to 100): ");
                int input = sc.nextInt();
                if(input<=100 && input>=0){
                    nikhil[person][lap] = input;
                }else{
                    System.out.println("Please enter the oxygen level in valid range!");
                    System.out.println("Enter the oxygen levels of participant "+(person+1)+" in the lap "+(lap+1)+"(The level must be between 1 to 100): ");
                    int nextinput = sc.nextInt();
                    if(input<=100 && input>=0){
                        nikhil[person][lap] = nextinput;}
                }
            }
        }
    }

    void display(){
        for(int lap=0; lap<3;lap++){
            for(int person=0;person<noofpersons;person++){
                System.out.println(nikhil[person][lap]+"  ");
            }
            System.err.println();
        }
    }
    void display(int[] average){
        for(int i=0;i<average.length; i++){
            System.out.println("Person "+(i+1)+" average is : "+average[i]);
        }
        System.out.println();
    }

    void avgofperson(){
        for(int person=0;person<noofpersons;person++){
            int sum=0;
            for(int lap=0; lap<3;lap++){
                sum += nikhil[person][lap];
            }
            average[person] = sum/3;
        }
    }

    void lessthanseventy(){
        for(int i=0; i<noofpersons;i++){
            if(average[i]<70){
                System.out.println("Person "+(i+1)+" is failed! Sorry, go back home!");
            }
        }
    }

    void topmost(int[] average){
        topper = average[0];
        for(int i=0; i<noofpersons;i++){
            topper = average[i]>topper ? average[i]:topper;
        }
        System.out.println("The topper is Person "+(topper));
    }
}