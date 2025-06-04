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

    public Game(Player player) {
        this.player = player;
        this.questionBank = new QuestionBank();
        this.currentIndex = 0;
    }

    public Question getCurrentQuestion() {
        return questionBank.getQuestion(currentIndex);
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(getCurrentQuestion().getAnswer());
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
}

// Tidak public → boleh disimpan dalam file yang sama
class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public void incrementScore() { score++; }
}

class Question {
    private String imagePath;
    private String answer;

    public Question(String imagePath, String answer) {
        this.imagePath = imagePath;
        this.answer = answer;
    }

    public String getImagePath() { return imagePath; }
    public String getAnswer() { return answer; }
}

class QuestionBank {
    private java.util.List<Question> questions;

    public QuestionBank() {
        questions = new java.util.ArrayList<>();
        questions.add(new Question("src/Soal1.jpeg", "radiasi matahari"));
        questions.add(new Question("src/Soal2.jpeg", "panjang umur"));
        questions.add(new Question("src/Soal3.jpeg", "keramik lantai"));
        questions.add(new Question("src/Soal4.jpeg", "meniti waktu"));
        questions.add(new Question("src/Soal5.jpeg", "hitung persentase"));
    }

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public int totalQuestions() {
        return questions.size();
    }
}