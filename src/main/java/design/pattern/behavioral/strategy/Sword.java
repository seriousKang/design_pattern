package design.pattern.behavioral.strategy;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("sword attack()");
    }
}
