package com.example.exam.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
     }

    @Column(nullable = false, length = 1024)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text = text;
     }

    @Column(nullable = false)
    private String option1;

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1){
        this.option1 = option1;
     }

    @Column(nullable = false)
    private String option2;

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2){
        this.option2 = option2;
     }

    @Column(nullable = false)
    private String option3;

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3){
        this.option3 = option3;
     }

    @Column(nullable = false)
    private String option4;

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4){
        this.option4 = option4;
     }

    // 1 for option1, 2 for option2, etc.
    @Column(nullable = false)
    private int correctAnswer;

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Column(nullable = false)
    private int marks;

    public int getMarks() {
        return marks;
     }

     public void setMarks(int marks) {
        this.marks = marks;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
/***
 Subscribe Lazycoder - https://www.youtube.com/c/LazyCoderOnline?sub_confirmation=1
 whatsapp - https://wa.me/919572181024
 email - wapka1503@gmail.com
 ***/