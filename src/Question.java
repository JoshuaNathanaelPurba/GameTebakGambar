/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Dzaky
 */
public class Question {
    private String imagePath;
    private String answer;

    public Question(String imagePath, String answer) {
        this.imagePath = imagePath;
        this.answer = answer;
    }

    public String getImagePath() { 
        return imagePath; 
    }
    
    public String getAnswer() {
        return answer;
    }
}
