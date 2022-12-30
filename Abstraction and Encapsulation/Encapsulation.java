import java.util.*;

class SavingAmount {
    int saving;
    
    protected void setInitialSaving(int saving){
        this.saving = saving;
    }
    protected int getCurrentSaving(){
        return saving;
    }
    protected void incrementSaving(){
        this.saving+=1000;
    }
    protected void decrementSaving(){
        this.saving-=100;
    }
    protected void checkSaving(){
        if(saving >= 1000){
            System.out.println("Congratulations! You have saved a good amount");
        }else if(saving <1000 && saving >=0){
            System.out.println("Insufficient saving!");
        }else{
            System.out.println("You are in debt");
        }
    }
//write your code here
}

public class Source {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}


