interface SwordFighter {
    int maxSwordsWielded = 2; //Static and final
 
    public abstract void escape();
    
    public abstract void attack();
    
    public abstract void showWeapon();
 }
 
 class Knight implements SwordFighter {
 
    @Override
    public void attack() {
        System.out.println("Knight stops the horse and attacks");
    }
 
    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    public void showWeapon() {
        System.out.println("Shows Sword");
    }
 }
 
 class Ninja implements SwordFighter {
    
    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    public void showWeapon() {
        System.out.println("Shows Katana");
    }
 }
 
 public class Source {
    public static void main(String[] args) {
        //Interface variables are implicitly static and final
        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);
 
        Knight knight = new Knight();
        Ninja ninja = new Ninja();
 
        knight.showWeapon(); 
        ninja.showWeapon();
 
        knight.attack(); 
        ninja.attack();
 
        knight.escape();
        ninja.escape();
    }
 
 }