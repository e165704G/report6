package jp.ac.uryukyu.ie.e165704;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tnal on 2016/11/13.
 */
public class EnemyTest {
    /**
     * 「死んでる状態では攻撃できない」こと。
     * @throws Exception
     */
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setdead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero. gethitPoint());
    }

}
