
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Dzaky
 */
public class Game {
    private Player player;
    private QuestionBank questionBank;
    private int currentIndex;
    private int currentLevel;

    public Game(Player player) {
        this.player = player;
        this.questionBank = new QuestionBank();
        this.currentIndex = 0;
        this.currentLevel = 1;
    }

    public Question getCurrentQuestion() {
        if (currentIndex < questionBank.totalQuestions()) {
            return questionBank.getQuestion(currentIndex);
        }
        return null;
    }

    public boolean checkAnswer(String Answer) {
        Question current = getCurrentQuestion();
        if(current != null){
            return Answer.trim().equalsIgnoreCase(current.getAnswer().trim());
        }
        return false;
    }

    public void nextQuestion() {
        currentIndex++;
    }

    public boolean isGameOver() {
        return currentIndex >= questionBank.totalQuestions();
    }

    public Player getPlayer() {
        return player;
    }
    
    public int getCurrentLevel(){
        return currentLevel;
    }
    
    public int getCurrentIndex(){
        return currentIndex;
    }
    
    public void setCurrentLevel(int level){
        this.currentLevel = level;
        this.currentIndex = (level - 1) * questionBank.getQuestionPerLevel();
    }
    
    public boolean hasNextQuestion(){
        return currentIndex + 1 < questionBank.totalQuestions();
    }
}