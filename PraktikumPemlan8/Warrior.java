package PraktikumPemlan8;

public class Warrior extends Character{
    private int defense;
    private int attack;
    private int HP;

    Warrior(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public boolean attack(){
        double hitchance = Math.random();
        return hitchance < 0.6;
    }
}