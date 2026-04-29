package com.example.exam.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
     }

    @Column(nullable = false)
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
     }

    @Column(nullable = false)
    private int durationInMinutes;

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
     }


    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setField(List<Question> questions){
        this.questions = questions;
     }


    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ExamResult> results;

    public List<ExamResult> getResults() {
        return results;
    }

    public void setResults(List<ExamResult> results){
        this.results = results;
     }

}
