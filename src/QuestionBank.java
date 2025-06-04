/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Muhammad Dzaky
 */
public class QuestionBank {
    private List<Question> questions;
    private final int questionPerLevel = 1;

    public QuestionBank() {
        questions = new ArrayList<>();
        initialQuestions();
    }
    
    private void initialQuestions(){
        questions.add(new Question("src/Gambar Soal/level1.jpg", "siraman air"));
        questions.add(new Question("src/Gambar Soal/level2.jpg", "jalur langit"));
        questions.add(new Question("src/Gambar Soal/level3.jpg", "beribadah"));
        questions.add(new Question("src/Gambar Soal/level4.jpeg", "radiasi matahari"));
        questions.add(new Question("src/Gambar Soal/level5.jpeg", "panjang umur"));
        questions.add(new Question("src/Gambar Soal/level6.jpeg", "keramik lantai"));
        questions.add(new Question("src/Gambar Soal/level7.jpeg", "meniti jam"));
        questions.add(new Question("src/Gambar Soal/level8.jpeg", "hitung persentase"));
        questions.add(new Question("src/Gambar Soal/level3.jpg", "beribadah"));
        questions.add(new Question("src/Gambar Soal/level2.jpg", "jalur langit"));
    }

    public Question getQuestion(int index) {
        if(index >= 0 && index < questions.size()){
            return questions.get(index);
        }
        return null;
    }

    public int totalQuestions() {
        return questions.size();
    }
    
    public int getQuestionPerLevel(){
        return questionPerLevel;
    }
    
    public List<Question> getQuestionForLevel(int level){
        List<Question> questionLevel = new ArrayList<>();
        int startIndex = (level - 1) * questionPerLevel;
        int endIndex = Math.min(startIndex + questionPerLevel, questions.size());
        
        for (int i = startIndex; i < endIndex; i++){
            questionLevel.add(questions.get(i));
        }
        return questionLevel;
    }
}
