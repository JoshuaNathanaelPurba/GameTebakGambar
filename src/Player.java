
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Dzaky
 */
public class Player {
    private String name;
    private int score;
    private Set<Integer> levelBerhasil;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.levelBerhasil = new HashSet<>();
    }
    
    public boolean incrementScore(int level){
        if (!levelBerhasil.contains(level)){
            score += 100;
            levelBerhasil.add(level);
            return true;
        }
        return false;
    }
    
    public boolean levelBeresCek(int level){
        return levelBerhasil.contains(level);
    }

    public Set<Integer> getLevelBerhasil(){
        return new HashSet<>(levelBerhasil);
    }
    
    public String getName() { 
        return name; 
    }
    
    public int getScore() { 
        return score; 
    }
}
