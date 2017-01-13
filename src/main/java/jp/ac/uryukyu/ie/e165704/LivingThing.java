package jp.ac.uryukyu.ie.e165704;

/**
 * Created by e165704 on 2016/11/26.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;


    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }


    public boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }


    public void attack(LivingThing e){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
            e.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで精力を搾り取られた。\n", name);
        }
    }
    public boolean getdead(){
        return dead;
    }
    public void setdead(boolean dead){
        this.dead = dead;
    }


    public int gethitPoint(){
        return hitPoint;
    }
    public  void sethitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
}

