package PraktikumPemlan8;

public class Healer extends Character{
    private int defense;
    private int attack;
    private int HP;

    Healer(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public boolean attack(){
        double hitchance = Math.random();
        return hitchance < 0.85;
    }
    public void Heal(){
        System.out.println("Menggunakan skill Heal.");
    }
    public int getHp(){
        return this.HP + 25;
    }
    public void setHp(int HP){
        System.out.println(this.HP);
    }
}